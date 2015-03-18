(ns metabase.test-data.data)

(defn- timestamp
  "Return a new `java.sql.Timestamp` with YEAR MONTH and DAY."
  ([year month day hour minute]
   (-> (java.util.Date. (- year 1900) (- month 1) day)
       .getTime                                        ; this is in ms
       (+ (* 60 60 1000 hour) (* 60 1000 minute))
       java.sql.Timestamp.))
  ([year month day]
   (timestamp year month day 0 0)))

;; [name last_login]
(defonce ^:private users
  [["Plato Yeshua" (timestamp 2014 4 1 1 30)]
   ["Felipinho Asklepios" (timestamp 2014 12 5 7 15)]
   ["Kaneonuskatew Eiran" (timestamp 2014 11 6 8 15)]
   ["Simcha Yan" (timestamp 2014 1 1 0 30)]
   ["Quentin Sören" (timestamp 2014 10 3 10 30)]
   ["Shad Ferdynand" (timestamp 2014 8 2 5 30)]
   ["Conchúr Tihomir" (timestamp 2014 8 2 2 30)]
   ["Szymon Theutrich" (timestamp 2014 2 1 2 15)]
   ["Nils Gotam" (timestamp 2014 4 3 2 30)]
   ["Frans Hevel" (timestamp 2014 7 3 12 30)]
   ["Spiros Teofil" (timestamp 2014 11 1)]
   ["Kfir Caj" (timestamp 2014 7 2 18 30)]
   ["Dwight Gresham" (timestamp 2014 8 1 3 30)]
   ["Broen Olujimi" (timestamp 2014 10 3 6 45)]
   ["Rüstem Hebel" (timestamp 2014 8 1 5 45)]])

;; name
(defonce ^:private categories
  [["African"]
   ["American"]
   ["Artisan"]
   ["Asian"]
   ["BBQ"]
   ["Bakery"]
   ["Bar"]
   ["Beer Garden"]
   ["Breakfast / Brunch"]
   ["Brewery"]
   ["Burger"]
   ["Café"]
   ["Café Sweets"]
   ["Caribbean"]
   ["Chinese"]
   ["Coffee Shop"]
   ["Comedy Club"]
   ["Deli"]
   ["Dim Sum"]
   ["Diner"]
   ["Donut Shop"]
   ["English"]
   ["Entertainment"]
   ["Fashion"]
   ["Fast Food"]
   ["Food Truck"]
   ["French"]
   ["Gay Bar"]
   ["German"]
   ["Gluten-free"]
   ["Greek"]
   ["Grocery"]
   ["Health & Beauty"]
   ["Home"]
   ["Hostel"]
   ["Hot Dog"]
   ["Hotel"]
   ["Indian"]
   ["Italian"]
   ["Japanese"]
   ["Jewish"]
   ["Juice Bar"]
   ["Karaoke"]
   ["Korean"]
   ["Landmark"]
   ["Late Dining"]
   ["Latin American"]
   ["Lounge"]
   ["Mediterannian"]
   ["Mexican"]
   ["Middle Eastern"]
   ["Molecular Gastronomy"]
   ["Moroccan"]
   ["Museum"]
   ["Nightclub"]
   ["Nightlife"]
   ["Outdoors"]
   ["Pizza"]
   ["Ramen"]
   ["Restaurant General"]
   ["Scandinavian"]
   ["Seafood"]
   ["South Pacific"]
   ["Southern"]
   ["Spanish"]
   ["Stadium"]
   ["Steakhouse"]
   ["Strip Club"]
   ["Tapas"]
   ["Tea Room"]
   ["Thai"]
   ["Unknown"]
   ["Vegetarian / Vegan"]
   ["Wine Bar"]
   ["Winery"]])

;; [name lat lon price category_id]
(defonce ^:private venues
  [["Red Medicine" 34.0646 -118.374 3 4]
   ["Stout Burgers & Beers" 34.0996 -118.329 2 11]
   ["The Apple Pan" 34.0406 -118.428 2 11]
   ["Wurstküche" 33.9997 -118.465 2 29]
   ["Brite Spot Family Restaurant" 34.0778 -118.261 2 20]
   ["The 101 Coffee Shop" 34.1054 -118.324 2 20]
   ["Don Day Korean Restaurant" 34.0689 -118.305 2 44]
   ["25°" 34.1015 -118.342 2 11]
   ["Krua Siri" 34.1018 -118.301 1 71]
   ["Fred 62" 34.1046 -118.292 2 20]
   ["The Gorbals" 34.0474 -118.25 2 2]
   ["The Misfit Restaurant + Bar" 34.0154 -118.497 2 2]
   ["Pellicola Pizzeria" 34.0451 -118.257 1 58]
   ["Jones Hollywood" 34.0908 -118.346 3 7]
   ["BCD Tofu House" 34.0619 -118.303 2 44]
   ["Pacific Dining Car - Santa Monica" 34.0367 -118.476 4 67]
   ["Ruen Pair Thai Restaurant" 34.1021 -118.306 2 71]
   ["The Original Pantry" 34.0464 -118.263 2 20]
   ["800 Degrees Neapolitan Pizzeria" 34.0597 -118.444 2 58]
   ["Greenblatt's Delicatessen & Fine Wine Shop" 34.0981 -118.365 2 3]
   ["PizzaHacker" 37.7441 -122.421 2 58]
   ["Gordo Taqueria" 37.7822 -122.484 1 50]
   ["Taqueria Los Coyotes" 37.765 -122.42 2 50]
   ["La Tortilla" 37.7612 -122.435 1 50]
   ["Garaje" 37.7818 -122.396 2 50]
   ["Taqueria San Francisco" 37.753 -122.408 1 50]
   ["Tout Sweet Patisserie" 37.7873 -122.407 2 13]
   ["Liguria Bakery" 37.8014 -122.409 1 6]
   ["20th Century Cafe" 37.775 -122.423 2 12]
   ["Noe Valley Bakery" 37.7513 -122.434 2 6]
   ["Bludso's BBQ" 33.8894 -118.207 2 5]
   ["Boneyard Bistro" 34.1477 -118.428 3 5]
   ["My Brother's Bar-B-Q" 34.167 -118.595 2 5]
   ["Beachwood BBQ & Brewing" 33.7701 -118.191 2 10]
   ["Smoke City Market" 34.1661 -118.448 1 5]
   ["Handy Market" 34.1716 -118.335 2 3]
   ["bigmista's barbecue" 34.118 -118.26 2 5]
   ["Zeke's Smokehouse" 34.2053 -118.226 2 5]
   ["Baby Blues BBQ" 34.0003 -118.465 2 5]
   ["Dear Mom" 37.7655 -122.413 2 46]
   ["Cheese Steak Shop" 37.7855 -122.44 1 18]
   ["Little Star Pizza" 37.7665 -122.422 2 58]
   ["Marnee Thai" 37.7634 -122.482 2 71]
   ["In-N-Out Burger" 37.8078 -122.418 1 11]
   ["Tu Lan Restaurant" 37.7821 -122.41 1 4]
   ["Shanghai Dumpling King" 37.7317 -122.451 2 19]
   ["Marlowe" 37.7767 -122.396 3 2]
   ["The Residence" 37.7677 -122.429 2 7]
   ["Hotel Biron" 37.7735 -122.422 3 74]
   ["Two Sisters Bar & Books" 37.7765 -122.426 2 48]
   ["Empress of China" 37.7949 -122.406 3 15]
   ["Cole's" 34.0448 -118.25 2 7]
   ["Tam O'Shanter" 34.1254 -118.264 3 18]
   ["Yamashiro Hollywood" 34.1057 -118.342 3 2]
   ["Dal Rae Restaurant" 33.983 -118.096 4 67]
   ["Philippe the Original" 34.0597 -118.237 1 18]
   ["Musso & Frank Grill" 34.1018 -118.335 3 2]
   ["Taylor's Prime Steak House" 34.0579 -118.302 3 67]
   ["Pacific Dining Car" 34.0555 -118.266 3 2]
   ["Polo Lounge" 34.0815 -118.414 3 48]
   ["Lawry's The Prime Rib" 34.0677 -118.376 4 67]
   ["Hot Sauce and Panko" 37.7825 -122.476 1 64]
   ["Giordano Bros." 37.765 -122.422 1 18]
   ["Festa" 37.7852 -122.432 2 43]
   ["Slate" 37.765 -122.418 2 48]
   ["Playground" 37.7858 -122.43 2 43]
   ["Mint Karaoke Lounge" 37.7702 -122.426 2 43]
   ["Dimples" 37.7856 -122.43 1 43]
   ["The Virgil" 34.091 -118.287 2 48]
   ["The Drawing Room" 34.1037 -118.287 1 7]
   ["Frolic Room" 34.1016 -118.326 1 7]
   ["The Daily Pint" 34.0211 -118.466 2 7]
   ["Pineapple Hill Saloon & Grill" 34.1525 -118.448 2 7]
   ["Chez Jay" 34.0104 -118.493 2 2]
   ["Geido" 40.6778 -73.9729 2 40]
   ["Beyond Sushi" 40.7328 -73.9861 2 40]
   ["Sushi Nakazawa" 40.7318 -74.0045 4 40]
   ["Soto" 40.7321 -74.0006 2 40]
   ["Sushi Yasuda" 40.7514 -73.9736 4 40]
   ["Blue Ribbon Sushi" 40.7262 -74.0026 3 40]
   ["Tanoshi Sushi & Sake Bar" 40.7677 -73.9533 4 40]
   ["Bozu" 40.7129 -73.9576 2 40]
   ["Sushi Yasaka" 40.7794 -73.9835 2 40]
   ["Spitz Eagle Rock" 34.1411 -118.221 2 49]
   ["Cha Cha Chicken" 34.0071 -118.49 1 14]
   ["Yuca's Taqueria" 34.1092 -118.287 1 50]
   ["The Gumbo Pot" 34.072 -118.361 2 64]
   ["Kinaree Thai Bistro" 34.094 -118.344 1 71]
   ["Tacos Villa Corona" 34.1177 -118.261 1 50]
   ["Señor Fish" 34.0489 -118.238 2 50]
   ["Manuel's Original El Tepeyac Cafe" 34.0478 -118.198 2 50]
   ["Tito's Tacos" 34.0082 -118.415 1 50]
   ["33 Taps" 34.1018 -118.326 2 7]
   ["Ye Rustic Inn" 34.1044 -118.288 1 7]
   ["Rush Street" 34.023 -118.395 2 2]
   ["Busby's West" 34.0372 -118.469 2 48]
   ["Barney's Beanery" 34.0908 -118.375 2 46]
   ["Lucky Baldwin's Pub" 34.1454 -118.149 2 7]
   ["Golden Road Brewing" 34.1505 -118.274 2 10]
   ["Mohawk Bend" 34.0777 -118.265 2 46]])

;; [user_id venue_id timestamp]
(defonce ^:private checkins
  [[5 12 (timestamp 2014 4 7)]
   [1 31 (timestamp 2014 9 18)]
   [8 56 (timestamp 2014 9 15)]
   [5 4 (timestamp 2014 3 11)]
   [3 49 (timestamp 2013 5 5)]
   [3 35 (timestamp 2015 7 4)]
   [12 6 (timestamp 2014 4 11)]
   [11 16 (timestamp 2014 5 13)]
   [3 79 (timestamp 2014 5 26)]
   [3 55 (timestamp 2015 8 22)]
   [15 23 (timestamp 2013 3 25)]
   [5 25 (timestamp 2014 11 16)]
   [6 80 (timestamp 2014 5 17)]
   [9 93 (timestamp 2015 9 7)]
   [5 61 (timestamp 2015 2 19)]
   [11 34 (timestamp 2015 2 19)]
   [8 69 (timestamp 2014 8 31)]
   [3 27 (timestamp 2015 8 5)]
   [11 70 (timestamp 2014 7 31)]
   [11 81 (timestamp 2014 9 14)]
   [4 73 (timestamp 2015 12 10)]
   [8 18 (timestamp 2015 2 17)]
   [8 71 (timestamp 2014 4 2)]
   [12 45 (timestamp 2014 4 4)]
   [12 31 (timestamp 2014 7 5)]
   [8 67 (timestamp 2014 5 17)]
   [11 57 (timestamp 2015 2 15)]
   [10 100 (timestamp 2015 5 2)]
   [15 7 (timestamp 2014 9 27)]
   [5 48 (timestamp 2014 7 20)]
   [8 27 (timestamp 2013 5 12)]
   [14 31 (timestamp 2014 2 17)]
   [5 6 (timestamp 2015 10 7)]
   [14 28 (timestamp 2014 9 26)]
   [10 56 (timestamp 2014 7 19)]
   [8 19 (timestamp 2015 9 29)]
   [4 48 (timestamp 2015 11 19)]
   [10 11 (timestamp 2015 11 15)]
   [11 65 (timestamp 2015 4 30)]
   [6 6 (timestamp 2014 9 14)]
   [10 62 (timestamp 2013 7 5)]
   [11 88 (timestamp 2015 3 5)]
   [5 51 (timestamp 2015 11 30)]
   [2 61 (timestamp 2013 11 19)]
   [9 59 (timestamp 2013 8 24)]
   [9 66 (timestamp 2015 6 26)]
   [14 67 (timestamp 2014 7 19)]
   [12 15 (timestamp 2015 7 18)]
   [5 12 (timestamp 2015 4 7)]
   [8 13 (timestamp 2013 8 2)]
   [13 30 (timestamp 2014 6 28)]
   [4 8 (timestamp 2014 10 13)]
   [6 65 (timestamp 2014 5 5)]
   [4 93 (timestamp 2015 5 8)]
   [15 14 (timestamp 2014 12 22)]
   [3 99 (timestamp 2014 7 24)]
   [2 15 (timestamp 2015 3 6)]
   [4 40 (timestamp 2015 11 9)]
   [13 24 (timestamp 2014 6 11)]
   [10 69 (timestamp 2014 3 24)]
   [3 15 (timestamp 2013 11 1)]
   [10 3 (timestamp 2013 5 28)]
   [5 15 (timestamp 2015 12 24)]
   [6 34 (timestamp 2014 8 18)]
   [7 29 (timestamp 2014 4 13)]
   [6 86 (timestamp 2015 2 21)]
   [3 28 (timestamp 2014 5 25)]
   [5 29 (timestamp 2014 9 16)]
   [8 85 (timestamp 2014 3 14)]
   [11 65 (timestamp 2014 11 20)]
   [14 93 (timestamp 2014 1 7)]
   [1 1 (timestamp 2015 4 18)]
   [11 75 (timestamp 2013 8 7)]
   [11 91 (timestamp 2015 11 14)]
   [7 97 (timestamp 2015 9 11)]
   [9 9 (timestamp 2014 3 28)]
   [14 33 (timestamp 2014 3 3)]
   [4 3 (timestamp 2015 3 2)]
   [8 19 (timestamp 2014 5 7)]
   [1 99 (timestamp 2013 12 27)]
   [7 18 (timestamp 2013 7 23)]
   [13 30 (timestamp 2014 6 28)]
   [11 17 (timestamp 2015 2 19)]
   [12 58 (timestamp 2015 12 2)]
   [13 82 (timestamp 2014 11 15)]
   [8 69 (timestamp 2015 7 1)]
   [14 95 (timestamp 2014 8 18)]
   [6 75 (timestamp 2015 5 29)]
   [14 83 (timestamp 2013 10 29)]
   [7 66 (timestamp 2014 2 10)]
   [11 73 (timestamp 2015 4 9)]
   [4 93 (timestamp 2014 8 2)]
   [2 18 (timestamp 2013 7 2)]
   [10 17 (timestamp 2015 2 9)]
   [8 60 (timestamp 2013 10 27)]
   [13 24 (timestamp 2014 2 11)]
   [2 71 (timestamp 2014 11 25)]
   [11 29 (timestamp 2014 1 4)]
   [13 91 (timestamp 2015 11 27)]
   [9 21 (timestamp 2014 7 26)]
   [11 99 (timestamp 2015 9 4)]
   [5 44 (timestamp 2013 12 2)]
   [8 51 (timestamp 2015 4 10)]
   [8 9 (timestamp 2015 9 26)]
   [11 19 (timestamp 2014 11 31)]
   [2 38 (timestamp 2014 2 10)]
   [10 12 (timestamp 2014 7 14)]
   [10 30 (timestamp 2013 12 15)]
   [8 33 (timestamp 2013 3 16)]
   [9 49 (timestamp 2015 9 17)]
   [6 38 (timestamp 2013 5 19)]
   [15 93 (timestamp 2014 3 12)]
   [2 36 (timestamp 2013 1 27)]
   [7 98 (timestamp 2015 9 17)]
   [4 6 (timestamp 2015 9 18)]
   [6 34 (timestamp 2013 9 16)]
   [11 73 (timestamp 2014 2 20)]
   [14 46 (timestamp 2014 7 5)]
   [1 44 (timestamp 2014 10 18)]
   [10 83 (timestamp 2013 12 22)]
   [3 21 (timestamp 2014 11 5)]
   [12 57 (timestamp 2014 12 19)]
   [10 77 (timestamp 2015 7 25)]
   [10 97 (timestamp 2013 8 5)]
   [14 8 (timestamp 2015 4 16)]
   [12 13 (timestamp 2015 9 11)]
   [15 81 (timestamp 2015 10 29)]
   [13 17 (timestamp 2014 8 18)]
   [15 2 (timestamp 2014 8 25)]
   [8 74 (timestamp 2014 8 11)]
   [7 90 (timestamp 2013 2 13)]
   [4 84 (timestamp 2014 8 26)]
   [10 87 (timestamp 2014 1 9)]
   [8 88 (timestamp 2013 8 21)]
   [6 85 (timestamp 2015 12 26)]
   [8 62 (timestamp 2014 5 21)]
   [4 97 (timestamp 2015 2 15)]
   [4 65 (timestamp 2014 2 11)]
   [9 1 (timestamp 2015 10 8)]
   [13 96 (timestamp 2014 10 10)]
   [10 83 (timestamp 2015 11 22)]
   [15 24 (timestamp 2013 7 24)]
   [10 38 (timestamp 2014 9 14)]
   [12 3 (timestamp 2015 11 13)]
   [4 78 (timestamp 2014 10 13)]
   [14 12 (timestamp 2014 7 17)]
   [3 18 (timestamp 2014 5 31)]
   [11 10 (timestamp 2013 10 19)]
   [11 81 (timestamp 2013 3 13)]
   [5 61 (timestamp 2014 11 21)]
   [13 81 (timestamp 2014 12 17)]
   [13 24 (timestamp 2014 9 4)]
   [8 54 (timestamp 2013 2 21)]
   [10 42 (timestamp 2014 7 8)]
   [7 97 (timestamp 2014 9 23)]
   [3 14 (timestamp 2013 3 8)]
   [12 58 (timestamp 2014 1 31)]
   [11 100 (timestamp 2015 9 4)]
   [8 90 (timestamp 2014 3 6)]
   [12 20 (timestamp 2015 5 5)]
   [3 47 (timestamp 2014 6 30)]
   [5 44 (timestamp 2015 1 4)]
   [1 47 (timestamp 2013 9 10)]
   [7 11 (timestamp 2015 5 22)]
   [15 87 (timestamp 2013 12 29)]
   [2 66 (timestamp 2014 7 17)]
   [2 52 (timestamp 2014 7 9)]
   [11 3 (timestamp 2015 6 29)]
   [9 12 (timestamp 2013 9 16)]
   [2 39 (timestamp 2014 7 17)]
   [11 3 (timestamp 2014 3 13)]
   [10 47 (timestamp 2015 3 4)]
   [15 78 (timestamp 2015 8 21)]
   [12 3 (timestamp 2014 4 19)]
   [11 45 (timestamp 2014 11 7)]
   [2 75 (timestamp 2013 5 3)]
   [10 9 (timestamp 2013 3 8)]
   [2 51 (timestamp 2013 10 4)]
   [4 4 (timestamp 2014 7 10)]
   [8 57 (timestamp 2014 7 16)]
   [8 38 (timestamp 2014 8 15)]
   [5 31 (timestamp 2014 1 6)]
   [3 54 (timestamp 2015 5 27)]
   [10 84 (timestamp 2015 7 5)]
   [5 54 (timestamp 2013 2 29)]
   [3 43 (timestamp 2015 8 6)]
   [8 70 (timestamp 2014 11 9)]
   [2 59 (timestamp 2014 7 30)]
   [11 18 (timestamp 2015 1 14)]
   [9 75 (timestamp 2013 6 30)]
   [13 41 (timestamp 2015 8 1)]
   [7 87 (timestamp 2014 2 6)]
   [6 91 (timestamp 2013 3 19)]
   [7 90 (timestamp 2013 6 23)]
   [8 61 (timestamp 2014 4 11)]
   [5 35 (timestamp 2014 10 28)]
   [2 82 (timestamp 2014 6 9)]
   [9 35 (timestamp 2013 10 23)]
   [6 52 (timestamp 2014 9 28)]
   [6 96 (timestamp 2015 9 4)]
   [11 59 (timestamp 2015 9 18)]
   [12 34 (timestamp 2015 8 9)]
   [10 80 (timestamp 2015 4 8)]
   [4 78 (timestamp 2015 2 29)]
   [6 4 (timestamp 2015 9 1)]
   [4 35 (timestamp 2014 7 7)]
   [13 50 (timestamp 2013 6 23)]
   [11 69 (timestamp 2014 3 17)]
   [10 62 (timestamp 2013 3 15)]
   [13 31 (timestamp 2015 3 27)]
   [13 42 (timestamp 2014 10 2)]
   [14 86 (timestamp 2013 5 14)]
   [4 83 (timestamp 2014 8 13)]
   [9 21 (timestamp 2015 4 18)]
   [14 90 (timestamp 2014 6 15)]
   [12 65 (timestamp 2015 5 5)]
   [7 57 (timestamp 2013 3 8)]
   [12 70 (timestamp 2014 9 6)]
   [11 16 (timestamp 2014 2 9)]
   [7 38 (timestamp 2013 10 12)]
   [2 40 (timestamp 2014 3 9)]
   [8 52 (timestamp 2015 6 22)]
   [7 84 (timestamp 2013 1 22)]
   [9 4 (timestamp 2014 8 20)]
   [2 4 (timestamp 2014 3 4)]
   [8 56 (timestamp 2014 2 3)]
   [6 23 (timestamp 2013 10 29)]
   [7 87 (timestamp 2013 10 2)]
   [5 28 (timestamp 2014 2 14)]
   [5 19 (timestamp 2013 9 8)]
   [2 13 (timestamp 2014 6 30)]
   [12 65 (timestamp 2013 7 25)]
   [4 73 (timestamp 2015 11 6)]
   [7 56 (timestamp 2013 7 14)]
   [1 46 (timestamp 2014 3 9)]
   [13 58 (timestamp 2013 7 10)]
   [4 68 (timestamp 2013 4 12)]
   [14 86 (timestamp 2014 3 9)]
   [7 89 (timestamp 2014 11 22)]
   [4 42 (timestamp 2014 4 13)]
   [13 83 (timestamp 2014 10 19)]
   [10 66 (timestamp 2014 7 7)]
   [11 69 (timestamp 2013 8 19)]
   [2 18 (timestamp 2014 11 28)]
   [12 7 (timestamp 2015 8 16)]
   [7 45 (timestamp 2014 3 20)]
   [8 85 (timestamp 2014 10 9)]
   [13 27 (timestamp 2014 5 16)]
   [8 6 (timestamp 2014 8 24)]
   [9 52 (timestamp 2013 4 11)]
   [2 75 (timestamp 2015 2 26)]
   [11 65 (timestamp 2014 5 29)]
   [7 30 (timestamp 2013 6 3)]
   [11 14 (timestamp 2013 6 26)]
   [11 61 (timestamp 2014 11 9)]
   [8 81 (timestamp 2013 6 27)]
   [10 92 (timestamp 2014 5 7)]
   [3 52 (timestamp 2014 1 26)]
   [5 56 (timestamp 2014 11 14)]
   [11 75 (timestamp 2014 4 2)]
   [9 13 (timestamp 2014 10 22)]
   [4 25 (timestamp 2015 5 18)]
   [10 70 (timestamp 2015 5 4)]
   [2 48 (timestamp 2014 6 21)]
   [6 78 (timestamp 2014 3 28)]
   [12 68 (timestamp 2014 10 24)]
   [10 8 (timestamp 2014 2 26)]
   [5 63 (timestamp 2015 10 12)]
   [14 66 (timestamp 2015 8 6)]
   [2 3 (timestamp 2014 5 14)]
   [3 36 (timestamp 2014 4 27)]
   [11 71 (timestamp 2015 4 24)]
   [1 85 (timestamp 2015 2 30)]
   [13 68 (timestamp 2015 6 22)]
   [5 34 (timestamp 2014 9 25)]
   [2 75 (timestamp 2014 7 29)]
   [7 13 (timestamp 2014 10 3)]
   [12 86 (timestamp 2014 1 10)]
   [13 100 (timestamp 2015 7 17)]
   [8 59 (timestamp 2014 10 15)]
   [15 27 (timestamp 2014 5 17)]
   [13 83 (timestamp 2013 10 11)]
   [2 68 (timestamp 2014 6 3)]
   [10 23 (timestamp 2013 4 8)]
   [12 17 (timestamp 2013 1 10)]
   [8 89 (timestamp 2014 4 31)]
   [4 11 (timestamp 2013 6 12)]
   [3 97 (timestamp 2015 5 22)]
   [14 77 (timestamp 2013 10 19)]
   [10 69 (timestamp 2014 10 10)]
   [13 79 (timestamp 2014 11 11)]
   [5 95 (timestamp 2014 7 22)]
   [14 33 (timestamp 2015 8 26)]
   [2 75 (timestamp 2014 7 10)]
   [7 97 (timestamp 2014 2 29)]
   [6 88 (timestamp 2014 8 4)]
   [12 73 (timestamp 2013 11 16)]
   [14 61 (timestamp 2013 5 21)]
   [9 43 (timestamp 2015 3 7)]
   [4 44 (timestamp 2013 8 20)]
   [15 61 (timestamp 2015 7 18)]
   [11 98 (timestamp 2014 9 29)]
   [11 32 (timestamp 2013 8 2)]
   [3 94 (timestamp 2014 12 6)]
   [4 48 (timestamp 2015 8 20)]
   [11 59 (timestamp 2014 7 21)]
   [9 77 (timestamp 2014 6 5)]
   [7 10 (timestamp 2015 4 23)]
   [7 17 (timestamp 2013 4 1)]
   [9 45 (timestamp 2015 2 13)]
   [3 2 (timestamp 2014 12 23)]
   [9 85 (timestamp 2014 12 11)]
   [6 22 (timestamp 2015 4 24)]
   [12 96 (timestamp 2013 6 11)]
   [1 78 (timestamp 2014 6 9)]
   [13 29 (timestamp 2014 2 10)]
   [3 54 (timestamp 2013 1 19)]
   [11 60 (timestamp 2014 8 30)]
   [2 16 (timestamp 2013 11 27)]
   [9 41 (timestamp 2014 5 14)]
   [10 98 (timestamp 2014 1 26)]
   [13 98 (timestamp 2015 7 1)]
   [12 4 (timestamp 2015 10 4)]
   [1 63 (timestamp 2014 3 14)]
   [11 2 (timestamp 2015 10 23)]
   [14 64 (timestamp 2014 5 27)]
   [6 42 (timestamp 2014 5 1)]
   [2 44 (timestamp 2014 9 26)]
   [5 42 (timestamp 2013 8 15)]
   [5 39 (timestamp 2013 4 26)]
   [11 94 (timestamp 2014 7 14)]
   [4 17 (timestamp 2015 8 18)]
   [9 3 (timestamp 2014 2 19)]
   [3 75 (timestamp 2014 5 18)]
   [10 38 (timestamp 2015 9 22)]
   [10 74 (timestamp 2013 3 28)]
   [11 25 (timestamp 2014 1 4)]
   [7 20 (timestamp 2014 9 14)]
   [7 33 (timestamp 2014 5 18)]
   [2 40 (timestamp 2013 2 19)]
   [9 62 (timestamp 2013 6 16)]
   [6 5 (timestamp 2014 11 25)]
   [14 13 (timestamp 2014 7 19)]
   [4 82 (timestamp 2013 4 24)]
   [6 86 (timestamp 2014 4 10)]
   [15 66 (timestamp 2013 5 31)]
   [10 63 (timestamp 2014 9 3)]
   [13 46 (timestamp 2014 6 25)]
   [13 44 (timestamp 2015 2 24)]
   [5 82 (timestamp 2014 6 19)]
   [12 57 (timestamp 2014 9 12)]
   [5 96 (timestamp 2015 3 16)]
   [12 36 (timestamp 2015 5 11)]
   [6 100 (timestamp 2015 11 28)]
   [9 44 (timestamp 2014 10 24)]
   [13 70 (timestamp 2014 4 3)]
   [10 77 (timestamp 2014 4 12)]
   [13 42 (timestamp 2015 7 23)]
   [6 99 (timestamp 2013 6 2)]
   [9 22 (timestamp 2015 7 6)]
   [13 83 (timestamp 2014 12 16)]
   [13 27 (timestamp 2014 7 20)]
   [10 94 (timestamp 2015 11 5)]
   [13 70 (timestamp 2015 1 23)]
   [5 59 (timestamp 2014 5 20)]
   [12 61 (timestamp 2013 1 25)]
   [1 5 (timestamp 2015 7 23)]
   [5 95 (timestamp 2013 8 19)]
   [6 88 (timestamp 2014 7 25)]
   [3 54 (timestamp 2013 11 7)]
   [11 57 (timestamp 2015 7 20)]
   [7 27 (timestamp 2014 8 26)]
   [2 62 (timestamp 2015 5 3)]
   [4 36 (timestamp 2014 4 14)]
   [12 1 (timestamp 2013 11 9)]
   [4 27 (timestamp 2013 7 14)]
   [10 63 (timestamp 2013 11 15)]
   [6 31 (timestamp 2014 5 22)]
   [2 90 (timestamp 2015 10 4)]
   [8 2 (timestamp 2013 12 3)]
   [1 86 (timestamp 2015 9 23)]
   [7 46 (timestamp 2014 9 5)]
   [9 8 (timestamp 2015 7 29)]
   [1 51 (timestamp 2014 5 30)]
   [7 68 (timestamp 2014 3 25)]
   [14 74 (timestamp 2015 2 23)]
   [8 63 (timestamp 2015 5 12)]
   [1 68 (timestamp 2013 4 11)]
   [7 20 (timestamp 2015 3 28)]
   [14 28 (timestamp 2014 7 24)]
   [13 8 (timestamp 2014 2 3)]
   [3 40 (timestamp 2013 9 27)]
   [9 72 (timestamp 2014 1 19)]
   [11 15 (timestamp 2013 5 14)]
   [9 11 (timestamp 2014 3 30)]
   [4 10 (timestamp 2014 12 3)]
   [4 79 (timestamp 2014 11 7)]
   [4 74 (timestamp 2013 5 9)]
   [5 78 (timestamp 2015 12 8)]
   [12 74 (timestamp 2015 6 4)]
   [6 89 (timestamp 2014 6 14)]
   [2 87 (timestamp 2013 1 23)]
   [15 84 (timestamp 2015 7 18)]
   [4 65 (timestamp 2015 3 11)]
   [7 66 (timestamp 2013 7 25)]
   [10 14 (timestamp 2013 11 29)]
   [5 77 (timestamp 2014 6 2)]
   [8 74 (timestamp 2013 4 30)]
   [14 7 (timestamp 2014 3 5)]
   [4 45 (timestamp 2013 11 5)]
   [15 96 (timestamp 2013 11 26)]
   [4 45 (timestamp 2015 1 15)]
   [15 52 (timestamp 2015 4 31)]
   [6 46 (timestamp 2014 2 25)]
   [12 42 (timestamp 2014 11 10)]
   [13 17 (timestamp 2014 5 20)]
   [6 44 (timestamp 2015 3 27)]
   [3 71 (timestamp 2014 4 14)]
   [2 35 (timestamp 2013 9 31)]
   [9 74 (timestamp 2015 3 3)]
   [4 68 (timestamp 2014 12 1)]
   [6 40 (timestamp 2013 11 25)]
   [4 63 (timestamp 2014 6 14)]
   [11 12 (timestamp 2013 8 5)]
   [13 41 (timestamp 2015 2 3)]
   [11 13 (timestamp 2014 10 5)]
   [10 18 (timestamp 2015 3 20)]
   [5 20 (timestamp 2014 5 11)]
   [5 79 (timestamp 2014 2 22)]
   [7 15 (timestamp 2013 4 15)]
   [6 25 (timestamp 2014 3 28)]
   [14 9 (timestamp 2014 8 12)]
   [8 53 (timestamp 2014 4 24)]
   [9 78 (timestamp 2014 7 2)]
   [3 4 (timestamp 2014 6 26)]
   [7 3 (timestamp 2015 10 29)]
   [6 56 (timestamp 2015 10 28)]
   [4 65 (timestamp 2014 8 12)]
   [15 35 (timestamp 2014 7 28)]
   [8 49 (timestamp 2014 9 1)]
   [11 80 (timestamp 2014 7 31)]
   [10 51 (timestamp 2015 3 1)]
   [14 70 (timestamp 2013 7 15)]
   [12 18 (timestamp 2013 10 6)]
   [8 80 (timestamp 2013 10 31)]
   [15 91 (timestamp 2013 11 16)]
   [9 78 (timestamp 2014 9 6)]
   [9 88 (timestamp 2013 6 4)]
   [12 88 (timestamp 2014 5 29)]
   [7 22 (timestamp 2013 6 7)]
   [2 38 (timestamp 2014 6 21)]
   [4 7 (timestamp 2014 5 7)]
   [2 49 (timestamp 2013 4 18)]
   [13 56 (timestamp 2014 7 19)]
   [9 66 (timestamp 2013 6 14)]
   [9 57 (timestamp 2014 7 29)]
   [5 91 (timestamp 2014 4 4)]
   [10 46 (timestamp 2015 6 8)]
   [10 97 (timestamp 2014 8 1)]
   [2 53 (timestamp 2014 7 4)]
   [14 54 (timestamp 2015 7 27)]
   [2 81 (timestamp 2013 8 17)]
   [11 77 (timestamp 2015 7 12)]
   [13 39 (timestamp 2013 8 3)]
   [7 86 (timestamp 2014 1 16)]
   [14 68 (timestamp 2014 5 7)]
   [13 61 (timestamp 2014 5 29)]
   [6 90 (timestamp 2015 9 16)]
   [11 59 (timestamp 2014 10 13)]
   [11 41 (timestamp 2015 11 7)]
   [12 2 (timestamp 2015 4 23)]
   [10 76 (timestamp 2013 10 18)]
   [14 77 (timestamp 2014 2 4)]
   [2 80 (timestamp 2014 1 4)]
   [3 65 (timestamp 2015 8 15)]
   [9 59 (timestamp 2013 4 3)]
   [11 6 (timestamp 2015 11 10)]
   [9 29 (timestamp 2013 6 30)]
   [10 37 (timestamp 2014 6 27)]
   [2 26 (timestamp 2013 12 11)]
   [3 28 (timestamp 2013 3 5)]
   [2 94 (timestamp 2015 3 13)]
   [11 72 (timestamp 2015 10 5)]
   [7 39 (timestamp 2014 8 15)]
   [9 6 (timestamp 2014 5 18)]
   [10 98 (timestamp 2013 4 26)]
   [9 92 (timestamp 2014 2 18)]
   [13 39 (timestamp 2014 8 9)]
   [9 21 (timestamp 2014 8 12)]
   [2 60 (timestamp 2014 1 27)]
   [6 58 (timestamp 2013 7 22)]
   [8 41 (timestamp 2014 5 16)]
   [6 15 (timestamp 2014 8 30)]
   [12 7 (timestamp 2015 4 21)]
   [7 14 (timestamp 2014 9 1)]
   [10 43 (timestamp 2014 11 27)]
   [14 22 (timestamp 2014 5 22)]
   [2 48 (timestamp 2015 11 22)]
   [9 92 (timestamp 2014 2 12)]
   [8 48 (timestamp 2015 10 26)]
   [13 97 (timestamp 2015 5 9)]
   [6 12 (timestamp 2014 7 14)]
   [11 22 (timestamp 2013 6 17)]
   [4 23 (timestamp 2013 3 23)]
   [10 68 (timestamp 2014 6 22)]
   [5 78 (timestamp 2014 7 16)]
   [4 32 (timestamp 2015 2 29)]
   [10 33 (timestamp 2014 5 23)]
   [10 6 (timestamp 2013 7 7)]
   [7 98 (timestamp 2015 4 4)]
   [14 29 (timestamp 2015 2 3)]
   [2 53 (timestamp 2014 9 8)]
   [9 43 (timestamp 2014 7 30)]
   [14 74 (timestamp 2015 11 1)]
   [3 94 (timestamp 2014 9 27)]
   [11 86 (timestamp 2015 9 27)]
   [1 50 (timestamp 2014 11 7)]
   [4 43 (timestamp 2013 6 19)]
   [2 85 (timestamp 2015 7 28)]
   [5 24 (timestamp 2014 11 9)]
   [14 88 (timestamp 2014 8 26)]
   [6 61 (timestamp 2014 8 9)]
   [2 83 (timestamp 2015 12 19)]
   [1 38 (timestamp 2015 7 25)]
   [6 49 (timestamp 2015 1 25)]
   [12 31 (timestamp 2015 2 9)]
   [6 61 (timestamp 2014 11 28)]
   [5 50 (timestamp 2013 6 12)]
   [7 81 (timestamp 2014 11 3)]
   [9 48 (timestamp 2014 3 27)]
   [6 72 (timestamp 2014 9 24)]
   [4 59 (timestamp 2013 10 6)]
   [8 48 (timestamp 2014 4 18)]
   [11 88 (timestamp 2015 4 10)]
   [10 67 (timestamp 2014 2 28)]
   [2 74 (timestamp 2014 1 18)]
   [10 70 (timestamp 2014 12 7)]
   [4 53 (timestamp 2014 11 7)]
   [8 81 (timestamp 2015 2 18)]
   [3 72 (timestamp 2014 5 5)]
   [15 72 (timestamp 2014 6 17)]
   [4 8 (timestamp 2015 6 13)]
   [8 73 (timestamp 2014 11 30)]
   [8 93 (timestamp 2014 9 20)]
   [14 44 (timestamp 2014 1 21)]
   [8 68 (timestamp 2014 6 5)]
   [5 94 (timestamp 2013 5 20)]
   [3 7 (timestamp 2015 5 29)]
   [7 49 (timestamp 2013 9 10)]
   [7 49 (timestamp 2013 7 26)]
   [15 74 (timestamp 2015 10 26)]
   [7 66 (timestamp 2015 7 29)]
   [8 93 (timestamp 2015 7 7)]
   [13 79 (timestamp 2014 11 12)]
   [6 7 (timestamp 2014 12 27)]
   [3 80 (timestamp 2015 6 22)]
   [13 6 (timestamp 2014 9 9)]
   [3 82 (timestamp 2015 6 27)]
   [12 13 (timestamp 2013 6 29)]
   [14 86 (timestamp 2014 1 7)]
   [5 66 (timestamp 2014 5 26)]
   [14 62 (timestamp 2013 8 18)]
   [10 97 (timestamp 2013 11 19)]
   [6 94 (timestamp 2013 4 19)]
   [2 41 (timestamp 2014 2 31)]
   [13 74 (timestamp 2014 5 26)]
   [7 63 (timestamp 2014 5 28)]
   [14 31 (timestamp 2013 12 4)]
   [13 41 (timestamp 2013 6 15)]
   [12 51 (timestamp 2015 12 26)]
   [4 65 (timestamp 2015 12 18)]
   [5 64 (timestamp 2013 8 2)]
   [12 18 (timestamp 2013 10 24)]
   [4 38 (timestamp 2014 4 26)]
   [7 30 (timestamp 2014 9 18)]
   [5 17 (timestamp 2014 5 18)]
   [2 76 (timestamp 2015 9 4)]
   [13 42 (timestamp 2015 5 26)]
   [9 74 (timestamp 2014 8 1)]
   [7 42 (timestamp 2013 6 21)]
   [3 26 (timestamp 2015 9 28)]
   [4 27 (timestamp 2013 5 14)]
   [12 21 (timestamp 2013 5 26)]
   [13 20 (timestamp 2015 7 15)]
   [2 85 (timestamp 2014 5 2)]
   [7 52 (timestamp 2014 10 21)]
   [5 3 (timestamp 2014 5 4)]
   [5 79 (timestamp 2014 7 11)]
   [3 10 (timestamp 2014 5 31)]
   [9 2 (timestamp 2015 1 28)]
   [3 85 (timestamp 2013 11 13)]
   [5 40 (timestamp 2015 9 11)]
   [11 70 (timestamp 2015 9 20)]
   [5 86 (timestamp 2014 12 5)]
   [3 86 (timestamp 2014 4 24)]
   [5 52 (timestamp 2014 11 5)]
   [9 72 (timestamp 2013 11 22)]
   [8 27 (timestamp 2015 9 28)]
   [8 48 (timestamp 2014 8 2)]
   [1 35 (timestamp 2014 5 26)]
   [11 6 (timestamp 2014 10 16)]
   [1 58 (timestamp 2013 11 18)]
   [8 90 (timestamp 2014 8 3)]
   [5 47 (timestamp 2013 9 2)]
   [11 88 (timestamp 2013 12 11)]
   [3 71 (timestamp 2014 9 26)]
   [14 66 (timestamp 2015 6 13)]
   [6 27 (timestamp 2015 8 16)]
   [4 42 (timestamp 2015 1 30)]
   [10 67 (timestamp 2014 12 9)]
   [3 75 (timestamp 2015 10 8)]
   [9 68 (timestamp 2013 11 9)]
   [9 87 (timestamp 2014 11 8)]
   [5 12 (timestamp 2014 2 5)]
   [13 87 (timestamp 2013 4 23)]
   [3 72 (timestamp 2015 5 25)]
   [3 95 (timestamp 2015 12 18)]
   [4 43 (timestamp 2013 4 14)]
   [6 17 (timestamp 2014 6 28)]
   [12 32 (timestamp 2014 1 5)]
   [14 96 (timestamp 2013 4 13)]
   [1 76 (timestamp 2015 10 29)]
   [5 93 (timestamp 2014 8 21)]
   [14 53 (timestamp 2013 11 18)]
   [14 20 (timestamp 2014 10 25)]
   [3 91 (timestamp 2015 10 19)]
   [8 8 (timestamp 2015 11 21)]
   [13 34 (timestamp 2013 8 20)]
   [2 54 (timestamp 2014 5 8)]
   [3 66 (timestamp 2014 10 16)]
   [3 57 (timestamp 2014 9 16)]
   [10 12 (timestamp 2015 4 12)]
   [10 93 (timestamp 2014 1 4)]
   [6 20 (timestamp 2014 3 18)]
   [14 50 (timestamp 2015 8 20)]
   [7 35 (timestamp 2014 7 24)]
   [9 25 (timestamp 2014 7 8)]
   [13 43 (timestamp 2014 12 23)]
   [3 43 (timestamp 2014 10 6)]
   [3 58 (timestamp 2014 6 10)]
   [8 59 (timestamp 2013 7 5)]
   [8 9 (timestamp 2014 3 2)]
   [12 11 (timestamp 2013 11 12)]
   [8 82 (timestamp 2014 12 19)]
   [3 88 (timestamp 2014 3 23)]
   [10 81 (timestamp 2015 6 31)]
   [4 31 (timestamp 2014 5 1)]
   [1 10 (timestamp 2013 3 12)]
   [7 98 (timestamp 2015 4 21)]
   [10 69 (timestamp 2013 5 3)]
   [4 7 (timestamp 2014 11 9)]
   [11 57 (timestamp 2014 6 5)]
   [4 75 (timestamp 2013 8 20)]
   [10 8 (timestamp 2014 10 6)]
   [9 48 (timestamp 2015 10 6)]
   [14 38 (timestamp 2013 4 14)]
   [6 41 (timestamp 2014 10 25)]
   [5 14 (timestamp 2013 5 7)]
   [11 38 (timestamp 2015 5 13)]
   [3 33 (timestamp 2014 11 8)]
   [1 72 (timestamp 2013 7 25)]
   [10 84 (timestamp 2013 4 7)]
   [10 24 (timestamp 2014 6 25)]
   [3 50 (timestamp 2013 2 6)]
   [14 18 (timestamp 2015 10 28)]
   [7 95 (timestamp 2014 10 15)]
   [13 86 (timestamp 2014 5 5)]
   [14 72 (timestamp 2015 8 5)]
   [13 24 (timestamp 2015 10 22)]
   [10 19 (timestamp 2014 7 6)]
   [1 26 (timestamp 2014 12 31)]
   [9 12 (timestamp 2014 6 29)]
   [8 32 (timestamp 2013 8 4)]
   [3 28 (timestamp 2015 9 19)]
   [15 37 (timestamp 2014 10 23)]
   [8 8 (timestamp 2014 9 16)]
   [7 100 (timestamp 2014 1 19)]
   [8 85 (timestamp 2014 3 31)]
   [8 23 (timestamp 2014 2 18)]
   [4 95 (timestamp 2015 3 3)]
   [11 93 (timestamp 2013 10 28)]
   [6 75 (timestamp 2014 7 25)]
   [10 18 (timestamp 2013 8 27)]
   [14 68 (timestamp 2013 2 20)]
   [12 13 (timestamp 2015 2 14)]
   [4 2 (timestamp 2013 2 27)]
   [7 81 (timestamp 2013 4 16)]
   [3 21 (timestamp 2013 4 7)]
   [6 43 (timestamp 2014 9 30)]
   [5 73 (timestamp 2014 11 29)]
   [2 38 (timestamp 2014 8 9)]
   [14 60 (timestamp 2014 4 29)]
   [10 90 (timestamp 2015 12 29)]
   [7 3 (timestamp 2015 6 27)]
   [2 18 (timestamp 2014 10 14)]
   [4 95 (timestamp 2013 5 27)]
   [4 65 (timestamp 2014 6 24)]
   [10 32 (timestamp 2014 8 2)]
   [13 72 (timestamp 2013 2 22)]
   [4 9 (timestamp 2014 2 7)]
   [12 49 (timestamp 2014 11 18)]
   [11 99 (timestamp 2014 6 29)]
   [10 30 (timestamp 2014 4 21)]
   [12 5 (timestamp 2014 3 26)]
   [7 56 (timestamp 2014 1 4)]
   [9 16 (timestamp 2013 10 11)]
   [6 44 (timestamp 2013 11 11)]
   [2 27 (timestamp 2015 3 18)]
   [12 25 (timestamp 2014 11 8)]
   [1 7 (timestamp 2015 5 29)]
   [7 91 (timestamp 2015 6 18)]
   [6 89 (timestamp 2015 11 16)]
   [8 12 (timestamp 2013 10 1)]
   [5 9 (timestamp 2013 4 18)]
   [3 81 (timestamp 2014 4 31)]
   [7 53 (timestamp 2013 3 26)]
   [6 45 (timestamp 2014 2 13)]
   [8 84 (timestamp 2015 4 20)]
   [5 2 (timestamp 2013 10 2)]
   [8 7 (timestamp 2014 9 10)]
   [15 41 (timestamp 2013 7 19)]
   [13 18 (timestamp 2014 7 24)]
   [14 54 (timestamp 2015 9 18)]
   [11 84 (timestamp 2014 8 13)]
   [7 56 (timestamp 2014 3 29)]
   [13 37 (timestamp 2014 5 21)]
   [4 96 (timestamp 2014 4 30)]
   [6 76 (timestamp 2014 9 16)]
   [5 21 (timestamp 2014 7 8)]
   [8 61 (timestamp 2014 3 10)]
   [5 26 (timestamp 2014 9 5)]
   [8 100 (timestamp 2013 5 29)]
   [3 47 (timestamp 2014 5 8)]
   [7 46 (timestamp 2015 10 4)]
   [5 73 (timestamp 2014 2 10)]
   [1 54 (timestamp 2014 2 8)]
   [12 46 (timestamp 2014 6 29)]
   [14 46 (timestamp 2014 10 16)]
   [10 69 (timestamp 2015 10 29)]
   [1 39 (timestamp 2013 6 3)]
   [3 23 (timestamp 2014 3 9)]
   [10 43 (timestamp 2014 7 13)]
   [14 95 (timestamp 2014 4 17)]
   [10 75 (timestamp 2014 3 17)]
   [4 50 (timestamp 2013 2 18)]
   [12 43 (timestamp 2013 11 1)]
   [9 33 (timestamp 2015 7 2)]
   [4 91 (timestamp 2013 4 2)]
   [15 16 (timestamp 2014 4 12)]
   [3 42 (timestamp 2014 2 10)]
   [12 65 (timestamp 2014 3 20)]
   [13 72 (timestamp 2015 7 22)]
   [13 86 (timestamp 2015 4 31)]
   [13 93 (timestamp 2013 3 19)]
   [10 49 (timestamp 2013 12 19)]
   [13 8 (timestamp 2014 12 5)]
   [15 52 (timestamp 2015 8 9)]
   [7 95 (timestamp 2013 12 11)]
   [9 90 (timestamp 2014 10 10)]
   [8 50 (timestamp 2015 3 5)]
   [6 11 (timestamp 2014 1 12)]
   [13 26 (timestamp 2014 8 25)]
   [3 39 (timestamp 2014 10 14)]
   [8 36 (timestamp 2015 11 13)]
   [5 97 (timestamp 2014 5 20)]
   [10 35 (timestamp 2014 5 7)]
   [11 74 (timestamp 2015 4 6)]
   [15 75 (timestamp 2013 4 28)]
   [2 88 (timestamp 2014 1 18)]
   [9 58 (timestamp 2014 4 16)]
   [6 41 (timestamp 2014 11 5)]
   [10 44 (timestamp 2015 4 11)]
   [10 64 (timestamp 2013 7 20)]
   [10 19 (timestamp 2014 2 12)]
   [4 13 (timestamp 2014 2 29)]
   [13 27 (timestamp 2014 4 2)]
   [15 33 (timestamp 2013 3 28)]
   [3 6 (timestamp 2015 9 5)]
   [7 63 (timestamp 2014 3 8)]
   [12 94 (timestamp 2014 9 23)]
   [7 38 (timestamp 2014 4 3)]
   [11 85 (timestamp 2014 2 17)]
   [9 76 (timestamp 2014 7 13)]
   [8 83 (timestamp 2014 5 28)]
   [14 42 (timestamp 2015 2 3)]
   [4 35 (timestamp 2014 3 25)]
   [7 58 (timestamp 2014 3 25)]
   [3 54 (timestamp 2014 2 25)]
   [5 60 (timestamp 2014 12 16)]
   [9 100 (timestamp 2014 5 20)]
   [12 6 (timestamp 2014 4 9)]
   [3 76 (timestamp 2013 7 29)]
   [8 73 (timestamp 2013 4 26)]
   [13 33 (timestamp 2014 11 3)]
   [6 45 (timestamp 2014 5 17)]
   [5 87 (timestamp 2014 10 7)]
   [5 90 (timestamp 2015 7 21)]
   [9 36 (timestamp 2015 8 26)]
   [7 57 (timestamp 2015 5 21)]
   [9 20 (timestamp 2013 10 3)]
   [4 13 (timestamp 2013 5 18)]
   [13 63 (timestamp 2014 3 22)]
   [5 42 (timestamp 2015 8 22)]
   [9 49 (timestamp 2015 3 2)]
   [6 15 (timestamp 2014 10 2)]
   [7 17 (timestamp 2013 7 18)]
   [11 63 (timestamp 2014 2 17)]
   [3 90 (timestamp 2013 2 26)]
   [13 90 (timestamp 2013 6 8)]
   [6 46 (timestamp 2014 3 24)]
   [15 91 (timestamp 2014 2 19)]
   [10 65 (timestamp 2014 10 10)]
   [3 76 (timestamp 2014 5 8)]
   [13 43 (timestamp 2014 2 11)]
   [7 15 (timestamp 2015 7 9)]
   [1 36 (timestamp 2014 2 31)]
   [9 59 (timestamp 2014 8 3)]
   [5 86 (timestamp 2015 4 2)]
   [14 63 (timestamp 2014 7 11)]
   [5 94 (timestamp 2013 11 24)]
   [14 54 (timestamp 2014 8 3)]
   [2 37 (timestamp 2014 8 2)]
   [4 62 (timestamp 2015 11 8)]
   [7 17 (timestamp 2013 9 31)]
   [13 59 (timestamp 2014 1 3)]
   [4 22 (timestamp 2013 3 14)]
   [3 94 (timestamp 2015 12 16)]
   [14 89 (timestamp 2014 6 6)]
   [15 23 (timestamp 2015 8 19)]
   [8 12 (timestamp 2015 3 17)]
   [8 93 (timestamp 2015 5 29)]
   [3 20 (timestamp 2013 5 20)]
   [9 2 (timestamp 2013 4 3)]
   [13 73 (timestamp 2014 6 30)]
   [10 5 (timestamp 2015 5 4)]
   [4 98 (timestamp 2014 8 29)]
   [5 38 (timestamp 2015 4 15)]
   [3 41 (timestamp 2014 10 19)]
   [2 53 (timestamp 2013 6 21)]
   [12 97 (timestamp 2015 11 3)]
   [15 68 (timestamp 2013 5 6)]
   [15 22 (timestamp 2013 8 16)]
   [11 57 (timestamp 2013 5 1)]
   [6 91 (timestamp 2015 2 22)]
   [2 63 (timestamp 2014 4 22)]
   [13 70 (timestamp 2013 3 6)]
   [11 86 (timestamp 2013 11 2)]
   [13 23 (timestamp 2015 5 26)]
   [12 5 (timestamp 2013 11 17)]
   [5 43 (timestamp 2015 12 2)]
   [11 96 (timestamp 2014 3 26)]
   [2 90 (timestamp 2013 12 3)]
   [10 21 (timestamp 2014 8 24)]
   [11 20 (timestamp 2014 10 28)]
   [13 44 (timestamp 2015 9 11)]
   [11 57 (timestamp 2014 8 2)]
   [6 45 (timestamp 2014 9 29)]
   [13 68 (timestamp 2014 8 3)]
   [9 75 (timestamp 2015 7 24)]
   [7 37 (timestamp 2014 10 6)]
   [6 21 (timestamp 2014 11 6)]
   [14 49 (timestamp 2013 11 22)]
   [7 67 (timestamp 2014 8 3)]
   [4 75 (timestamp 2014 10 20)]
   [13 13 (timestamp 2015 8 26)]
   [2 58 (timestamp 2014 9 1)]
   [2 23 (timestamp 2013 3 19)]
   [4 38 (timestamp 2014 10 3)]
   [7 26 (timestamp 2015 10 6)]
   [2 93 (timestamp 2014 10 23)]
   [2 41 (timestamp 2014 7 2)]
   [7 99 (timestamp 2014 10 18)]
   [14 64 (timestamp 2014 9 10)]
   [10 9 (timestamp 2014 10 25)]
   [6 48 (timestamp 2014 12 25)]
   [8 58 (timestamp 2014 2 18)]
   [3 35 (timestamp 2014 8 25)]
   [6 98 (timestamp 2014 6 31)]
   [8 97 (timestamp 2013 9 16)]
   [13 26 (timestamp 2014 9 22)]
   [2 91 (timestamp 2014 4 15)]
   [6 20 (timestamp 2015 6 30)]
   [15 74 (timestamp 2014 6 13)]
   [7 62 (timestamp 2014 10 13)]
   [7 95 (timestamp 2014 6 3)]
   [1 96 (timestamp 2014 10 16)]
   [9 84 (timestamp 2013 10 20)]
   [4 55 (timestamp 2014 9 24)]
   [13 86 (timestamp 2014 2 16)]
   [14 9 (timestamp 2015 2 5)]
   [9 37 (timestamp 2014 6 19)]
   [3 12 (timestamp 2015 11 13)]
   [10 91 (timestamp 2014 6 10)]
   [1 13 (timestamp 2013 10 29)]
   [4 57 (timestamp 2013 5 10)]
   [5 57 (timestamp 2014 5 28)]
   [14 31 (timestamp 2013 6 18)]
   [3 29 (timestamp 2014 6 16)]
   [7 93 (timestamp 2015 6 7)]
   [7 87 (timestamp 2015 11 21)]
   [9 53 (timestamp 2015 9 26)]
   [14 93 (timestamp 2014 10 20)]
   [14 37 (timestamp 2014 8 14)]
   [3 30 (timestamp 2013 3 21)]
   [10 82 (timestamp 2013 6 5)]
   [4 40 (timestamp 2015 7 17)]
   [8 45 (timestamp 2014 9 8)]
   [6 84 (timestamp 2013 2 15)]
   [11 87 (timestamp 2015 11 6)]
   [10 93 (timestamp 2014 12 24)]
   [2 54 (timestamp 2014 8 2)]
   [3 34 (timestamp 2014 5 7)]
   [13 48 (timestamp 2014 9 31)]
   [4 48 (timestamp 2014 10 24)]
   [1 46 (timestamp 2015 4 25)]
   [14 85 (timestamp 2015 3 15)]
   [4 37 (timestamp 2014 3 5)]
   [6 62 (timestamp 2014 2 20)]
   [2 73 (timestamp 2014 8 20)]
   [2 14 (timestamp 2013 9 29)]
   [6 83 (timestamp 2013 9 1)]
   [11 89 (timestamp 2013 10 16)]
   [3 58 (timestamp 2013 12 4)]
   [3 36 (timestamp 2014 6 22)]
   [5 96 (timestamp 2015 6 26)]
   [5 18 (timestamp 2014 4 22)]
   [4 54 (timestamp 2014 10 29)]
   [9 31 (timestamp 2013 9 29)]
   [12 49 (timestamp 2015 4 19)]
   [3 38 (timestamp 2013 1 26)]
   [4 88 (timestamp 2013 1 3)]
   [12 58 (timestamp 2015 11 25)]
   [12 58 (timestamp 2015 8 24)]
   [15 3 (timestamp 2015 5 22)]
   [10 17 (timestamp 2013 5 4)]
   [6 85 (timestamp 2013 8 10)]
   [7 18 (timestamp 2015 7 9)]
   [12 67 (timestamp 2015 6 15)]
   [8 96 (timestamp 2015 2 22)]
   [15 88 (timestamp 2015 2 13)]
   [8 70 (timestamp 2015 12 22)]
   [8 48 (timestamp 2014 10 4)]
   [3 91 (timestamp 2013 6 5)]
   [8 83 (timestamp 2014 11 6)]
   [12 5 (timestamp 2013 11 28)]
   [13 88 (timestamp 2014 3 29)]
   [2 73 (timestamp 2014 11 2)]
   [7 13 (timestamp 2013 10 22)]
   [13 17 (timestamp 2015 6 16)]
   [7 11 (timestamp 2014 3 9)]
   [2 84 (timestamp 2014 3 6)]
   [8 79 (timestamp 2014 6 13)]
   [2 77 (timestamp 2014 4 10)]
   [3 40 (timestamp 2014 5 11)]
   [8 30 (timestamp 2013 3 6)]
   [1 47 (timestamp 2014 12 7)]
   [11 49 (timestamp 2014 12 21)]
   [5 39 (timestamp 2014 10 31)]
   [3 98 (timestamp 2014 10 22)]
   [9 20 (timestamp 2015 4 9)]
   [13 66 (timestamp 2013 7 23)]
   [15 18 (timestamp 2013 4 26)]
   [9 37 (timestamp 2013 2 6)]
   [12 79 (timestamp 2014 9 7)]
   [8 49 (timestamp 2014 4 26)]
   [6 87 (timestamp 2015 6 31)]
   [2 70 (timestamp 2015 9 27)]
   [7 44 (timestamp 2014 11 5)]
   [6 65 (timestamp 2014 11 27)]
   [8 51 (timestamp 2015 9 7)]
   [6 11 (timestamp 2015 8 21)]
   [11 76 (timestamp 2014 5 21)]
   [5 94 (timestamp 2014 9 20)]
   [1 97 (timestamp 2015 4 5)]
   [2 20 (timestamp 2014 11 21)]
   [9 25 (timestamp 2014 6 3)]
   [4 10 (timestamp 2013 9 21)]
   [14 78 (timestamp 2013 9 14)]
   [6 34 (timestamp 2014 5 30)]
   [1 16 (timestamp 2014 3 30)]
   [15 36 (timestamp 2014 9 23)]
   [8 5 (timestamp 2013 8 21)]
   [11 39 (timestamp 2014 10 10)]
   [4 66 (timestamp 2014 3 16)]
   [12 74 (timestamp 2014 10 7)]
   [6 76 (timestamp 2015 8 9)]
   [14 62 (timestamp 2015 7 22)]
   [14 98 (timestamp 2015 8 13)]
   [8 40 (timestamp 2014 4 3)]
   [3 33 (timestamp 2014 11 13)]
   [12 42 (timestamp 2014 5 9)]
   [8 77 (timestamp 2015 9 24)]
   [2 16 (timestamp 2014 12 9)]
   [4 29 (timestamp 2015 5 29)]
   [11 49 (timestamp 2014 3 5)]
   [13 58 (timestamp 2014 4 29)]
   [9 34 (timestamp 2014 5 4)]
   [12 5 (timestamp 2015 4 16)]
   [7 67 (timestamp 2015 2 7)]
   [2 92 (timestamp 2014 6 3)]])

(defonce test-data
  {:users {:fields [[:name "VARCHAR(254)"] ; fields are pairs of [field-name h2-sql-type]
                    [:last_login "TIMESTAMP"]]
           :rows users}
   :categories {:fields [[:name "VARCHAR(254)"]]
                :rows categories}
   :venues {:fields [[:name "VARCHAR(254)"]
                     [:latitude "DOUBLE"]
                     [:longitude "DOUBLE"]
                     [:price "INTEGER"]
                     [:category_id "INTEGER"]]
            :rows venues}
   :checkins {:fields [[:user_id "INTEGER"]
                       [:venue_id "INTEGER"]
                       [:date "DATE"]]
              :rows checkins}})
