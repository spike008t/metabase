import React from "react";
import { render, screen } from "@testing-library/react";
import TableBrowser from "./TableBrowser";

const DatabaseLink = () => <div />;

jest.mock("metabase/entities/databases", () => ({ Link: DatabaseLink }));

describe("TableBrowser", () => {
  it("should render synced tables", () => {
    const tables = [getTable({ id: 1, name: "Orders", initial_sync: true })];

    render(
      <TableBrowser
        tables={tables}
        getTableUrl={getTableUrl}
        xraysEnabled={true}
      />,
    );

    expect(screen.getByText("Orders")).toBeInTheDocument();
    expect(screen.getByLabelText("bolt icon")).toBeInTheDocument();
    expect(screen.queryByTestId("loading-spinner")).not.toBeInTheDocument();
  });

  it("should render syncing tables", () => {
    const tables = [getTable({ id: 1, name: "Orders", initial_sync: false })];

    render(
      <TableBrowser
        tables={tables}
        getTableUrl={getTableUrl}
        xraysEnabled={true}
      />,
    );

    expect(screen.getByText("Orders")).toBeInTheDocument();
    expect(screen.queryByLabelText("bolt icon")).not.toBeInTheDocument();
    expect(screen.getByTestId("loading-spinner")).toBeInTheDocument();
  });
});

const getTable = ({ id, name, initial_sync }) => ({
  id,
  name,
  initial_sync,
});

const getTableUrl = table => {
  return `/question/${table.id}`;
};
