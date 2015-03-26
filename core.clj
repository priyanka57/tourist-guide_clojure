
(ns tourist-guide.core
  (:gen-class)
  (:use clojure.repl)
  (:use seesaw.core)
  (:use clj-pdf.core)
  (:use evaljs.core)
  (:use evaljs.rhino)
  (:use clojure.java.browse)
  )
  (native!)

(defn -main [& args]

  (defn button_format [button]
    (config! button :size [120 :by 35] :background :black :foreground :saddlebrown :font "Cambria-BOLD-16") button)

  (defn icon_format [label]
    (config! label :size [150 :by 150] :border 2 :background :black) label)

  ;-------------------------------------------- Berlin-PDF ----------------------------------------------- 
  (defn Berlin_Gen_PDF[]
    (pdf 
    [{}

    [:heading {:style {:align :center}} "Berlin"]
    [:spacer ]
    [:line]
    [:spacer ]
    [:heading "Hotels:"]
    [:spacer ]
    ;----------------------- Hotel1 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** The Westin Grand *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Berlin-h1.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Friedrichstr. 158-164 Berlin BE 10117 Germany 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
      "5.0 out of 5 stars. In Mitte, Berlin's historic district, the hotel is located where boulevard Unter den Linden meets Friedrichstrasse and is close to Brandenburg Gate, Gendarmenmarkt, the Guggenheim Museum, and Potsdamer Platz.

The Westin Grand, Berlin features a spacious lobby, on-site dining, a spa and wellness center with indoor pool, and a 3,000-square-meter garden.

With views of Berlin or the garden, guestrooms at the Westin Grand mix historic décor with modern amenities including Heavenly Beds and LED televisions with satellite channels."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- Hotel2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Kempinski Hotel *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Berlin-h2.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Kurfuerstendamm 27 Berlin BE 10719 Germany 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
      "5.0 out of 5 stars. Located on the Ku'damm shopping strip, the hotel is within a half-kilometer (a quarter-mile) of the Tiergarten and a U-bahn station, providing links to the rest of Berlin.
      
Decorated in the luxurious Roman Empire style, the indoor pool and fitness area has steam rooms and massage service; on-site shops include internationally known designer names.
    
Kempinski Hotel Bristol Berlin's 246 elegant guestrooms and 55 suites feature views of the busy shopping strip or an inner courtyard; all have minibars and high-speed Internet access."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- Hotel3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Sofitel Berlin Kurfürstendamm *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Berlin-h3.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Augsburger Str. 41 Berlin BE 10789 Germany 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
      "5.0 out of 5 stars. Located at the legendary Kurfürstendamm, opposite the Café Kranzler, close to the Memorial Church, the KaDeWe and the Berlin Zoo and in an ideal location for shopping and sightseeing.
 
      ”Savoir-vivre”: the Brasserie Le Faubourg with terrace and Le Faubourg Lounge, the Lutèce Bar and the breakfast restaurant St.Germain. More features: Club Etoile, Fitness- und Wellness Area, Business Center.
      
      All rooms and suites are puristic yet extravagant in style, whilst also offering the latest, cutting-edge technology. Each room is equipped with a flat-screen TV and complimentary high-speed internet access."]
    [:spacer ][:spacer ][:spacer ]
    [:pagebreak]
    ;----------------------- att1 ----------------------------
    [:heading "Attractions:"][:spacer ]
    [:heading {:style {:size 15 :align :center}} "***** Brandenburg Gate *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Berlin-A1.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Pariser Platz, 10117 Berlin, Germany"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
      "Built in the late 1700s, the Brandenburg gate is the only surviving city gate of Berlin. The gate is in the western part of Berlin and marks the entrance to Unter den Linden.Used as one of the Berlin Wall crossings, the gate became a site of protest during the division of Germany and a place of celebration when the wall fell in 1989.The gate was severely damaged in World War II and underwent extensive renovation in the early 2000s. Today it is fully restored and is the symbol of not only the turbulent history of the region, but also the reunification of East and West Berlin."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- att2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Reichstag *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Berlin-A2.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Platz der Republik 1, 11011 Berlin, Germany"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
      "The Reichstag is the seat of the German Parliament and an historic landmark. A fire in 1933 and air raids during the Battle of Berlin in 1945 caused a great deal of damage. The Reichstag sits near the Brandenburg Gate and was not fully restored until after the deconstruction of the Berlin Wall and the German reunification. Some historical scars, such as graffiti left by Soviet soldiers, were left as a tribute to the building’s difficult past. The original building was designed by several architects and the mix of styles in the completed structure was somewhat controversial at the time, but now is appreciated by thousands of visitors each year. The glass dome at the top of the building provides a magnificent view of the city and visitors must register in advance to enter it."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- att3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** East Side Gallery *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Berlin-A3.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Muehlen St, 10243 Berlin, Germany"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
      "The East Side Gallery is the longest stretch of the Berlin Wall still in existence. Often described as a memorial to freedom, it showcases paintings of artists from around the world. The artwork, which began appearing in 1990, documents the changing time after the fall of the Berlin Wall as well as expressing hope for the future. Sections of the wall have been moved to facilitate construction and other portions have been damaged by erosion and vandalism."]
    [:spacer ][:spacer ][:spacer ]
    [:pagebreak]
    ;----------------------- rest1 ----------------------------
    [:heading "Resturants:"][:spacer ]
    [:heading {:style {:size 15 :align :center}} "***** Cruise-In American Diner *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Berlin-r1.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Päwesiner Weg 25a Berlin, Germany"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
      "If you miss the typical American bars from the 1950s movie, it is time for a time journey. The food is affordable and tasty, the service is good and the same can be said about the prices. The only regret is that it is not open the whole day, as it used to be in America of the beginning of the 20th century. Very very american, cool and very tasty!

To the west lies the Americas, in the west of Berlin, the Cruise-In Diners. Who wants a change in Spandau times to burgers and burritos, may also wonderful brunch on the weekend here. On the buffet's Bacon & Beans, Scrambled Eggs and Pancakes filled. The best: € 5.50 per person for the hot drinks are already included. "]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- rest2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Don Camillo *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Berlin-r2.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Schloßstraße 7, 14059 Berlin, Germany"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
      "Don Camillo has no menu; instead the waiter will bring out a cart where you can choose different ingredients to create your own appetizers and mains. It's a small quaint restaurant with a high-quality feel. It is a really classy establishment. The prices at this highly-thought-of restaurant will leave you satisfied as much as the mood, though it can tend towards the more expensive. The atmosphere is very quiet and calming, especially in the summer where one can sit out on their cosy garden. The menu offers traditional, expertly prepared Italian dishes. Reservations are definitely recommended. The closest S-Bahn station is at Sophie-Charlotte-Platz. You will receive a menu containing letters only if you specifically ask for one. This is because, contrary to fancy designer-styled Italian restaurants, our maître d’s will present to you directly at your table, if required in five different languages, the various imaginative combinations of fresh ingredients that make up our delicious dishes."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- rest3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Aroma *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Berlin-r3.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Kantstraße 35, 10625 Berlin, Germany"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
      "Aroma had a great selection of coffee drinks  pastries, soups and sandwiches, and they were quick with the orders. That second part was surprising because almost everyone ordered the same drink-a blended frozen coffee drink with or without ice cream. Since they have to blend those drinks, it can take a long time, and as a former barista, i can attest that it's very annoying when one customer after another after another orders frozen drinks. Phenomenal food and outstanding service. Large portions filled us up and the staff couldn't have been friendlier to foreigners. Great place! Not far from Good Friends and also located on Kantstraße is Aroma. They have one of the tastiest and largest selections of Dim Sum in the city -- if one is craving Dim Sum, this is apparently the place to go. (Interesting fun fact: Dim Sum in Cantonese literally translates to A Little Bit of Heart. Adorable.) Aroma reminds me of Chinese restaurants that I used to frequent in the States: those with thick carpets, an all-male wait staff, and high prices."]
    [:spacer ]

    ]
    "Berlin.pdf") 
  )
;-------------------------------------------- Dubai-PDF -----------------------------------------------
 (defn Dubai_Gen_PDF[]
    (pdf 
    [{}

    [:heading {:style {:align :center}} "Dubai"]
    [:spacer ]
    [:line]
    [:spacer ]
    [:heading "Hotels:"]
    [:spacer ]
    ;----------------------- Hotel1 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Burj Al Arab *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Dubai-h1.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Jumeirah Beach Road Po Box 74147 Dubai United Arab Emirates 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "5.0 out of 5 stars. Burj Al Arab rises out of its own man-made island off the Jumeirah coast, south of the city and 15 miles (25 km) from Dubai International Airport. Visible from almost everywhere in the city, it is linked to the shore by a gently curving causeway.

With its distinctively high, sail-inspired exterior, this resort hotel has a private beach, an outdoor pool, 2 indoor pools, and a full-service spa. 6 restaurants and several bars are located on site.

Boasting views of the ocean and Jumeirah Beach, these rooms feature extensive technology including free WiFi, a 21-inch iMac, 2 HDTVs, Bose iPod/iPhone docking station and media hub, and an all-in-one printer/copier/scanner/fax.
"]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- Hotel2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Sofitel Dubai Downtown *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Dubai-h2.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Sheihk Zayed Road Downtown Dubai Dubai United Arab Emirates 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "5.0 out of 5 stars. Situated near the airport, in the city center, this luxury hotel is close to Burj Khalifa, The Dubai Fountain, and KidZania. Also nearby are Dubai Mall and Dubai International Financial Centre.

At Sofitel Dubai Downtown, recreational amenities include an outdoor pool and a spa tub. The hotel also features a full-service spa and a complimentary children's club.

Flat-screen televisions include premium satellite channels. Guestrooms also feature deep soaking bathtubs, private spa tubs, and complimentary wireless Internet access.
"]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- Hotel3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Atlantis The Palm *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Dubai-h3.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Crescent Road The Palm Dubai United Arab Emirates 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "5.0 out of 5 stars. Offering 1.5 km (0.9 mi) of beach access, this lavish resort is located on Palm Island, a palm-tree-shaped artificial island just off Dubai's Jumeira coast. Dubai Marina Mall is 6.5 km (4 mi) away.

Atlantis The Palm features the Aquaventure waterpark, dolphin encounters, the underwater Lost Chambers, and 2 outdoor pools. Other highlights include luxury boutiques and a spa.

Spacious guestrooms have balconies or patios with views of Palm Island and/or the Arabian Gulf. Rooms also offer flat-panel TVs, iPod docks, and Internet access (surcharge). Bathrooms come with separate showers and tubs.
"]
    [:spacer ][:spacer ][:spacer ]
    [:pagebreak]
    ;----------------------- att1 ----------------------------
    [:heading "Attractions:"][:spacer ]
    [:heading {:style {:size 15 :align :center}} "***** Dubai Mall *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Dubai-A1.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "DownTown Dubai, Near Souk Al Bahar Bridge - United Arab Emirates"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "The Dubai Mall is part of the Burj Khalifa complex, the tallest man-made structure ever built. At over 12 million square feet (equivalent in size to more than 50 soccer fields), the Dubai Mall is the largest shopping mall in the world based on total area but about the same size as the West Edmonton Mall if based on leasable space. The mall contains more than 1,200 shops including the world’s largest candy store, an ice rink, a SEGA game center (featuring a 3D bowling game), a 5 star luxury hotel, 22 cinema screens plus 120 restaurants and cafes. The mall also contains one of the largest aquariums in the world."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- att2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Burj Al Arab *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Dubai-A2.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Jumeirah 3, Jumeirah Road, Near to Jumeirah Beach Hotel - United Arab Emirates"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
      "At 321 meters (1,050 ft), the Burj Al Arab is the second tallest building in the world used exclusively as a hotel. However, the Ryugyong Hotel in Pyongyang North Korea (unfinished for over 20 years), is 9 meters (30 ft) taller, and the Rose Tower, also in Dubai, topped Burj Al Arab’s height at 333 meters (1,090 ft), becoming the world’s tallest hotel. One of its restaurants is located 200 meters (660 ft) above the Persian Gulf, offering spectacular views of Dubai. The Burj Al Arab stands on an artificial island and is connected to the mainland by a private curving bridge. It is an iconic tower, designed to symbolize Dubai’s urban transformation and to mimic the sail of a boat."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- att3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Jumeirah Beach *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Dubai-A3.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Jumeirah Rd - Dubai - United Arab Emirates"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Jumeirah Beach is the most popular beach in Dubai and probably best known for the Burj Al Arab 7 Star Hotel and Jumeirah Beach Hotel that both rise high above the sand. Other attractions here are the warm turquoise waters of the Arabian Gulf and the soft white sand. Unfortunately, as a result of rapid expansion and poor planning Dubai’s beaches have been contaminated with raw sewage in recent months, leading doctors to warn of health risks. This has prompted Dubai to use the international ‘blue flag’ system in the future to signify to bathers that their swimming spot is eco-friendly."]
    [:spacer ][:spacer ][:spacer ]
    [:pagebreak]
    ;----------------------- rest1 ----------------------------
    [:heading "Resturants:"][:spacer ]
    [:heading {:style {:size 15 :align :center}} "***** Italian: Armani/Ristorante *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Dubai-r2.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Lobby Level - Armani Hotel Dubai, 1 Sheikh Mohammed bin Rashid Boulevard - United Arab Emirates"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Even the entrance and reception is an experience ! so here everything begins... The great staff and service is the opening of a special world of italian taste ! Try the mushroom Risotto with black tartufo or the Fisch, something you never forget !!! Going to Dubai without visiting Armani ristorante is like you've never been in Dubai "]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- rest2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** American: JW’s Steakhouse *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Dubai-r1.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "JW Marriott Dubai - Abu Baker Al Siddique Rd - Dubai - United Arab Emirates"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "very good food, excellent service, Steak 'on the point' as ordered. not cheap, though- but good things can't be cheap. "]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- rest3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Chinese: Royal China *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Dubai-r3.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "4L2-011 The Balcony, Precinct Bldg. 4 DIFC - United Arab Emirates"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Royal China has great food, good ambience and varied/unique dishes.  Whether its soups, dimsums, or main dishes, food is done tastefully.  The quality of service is good, but the staff could engage a bit better with the guest. A good place for a business meal! "]
    [:spacer ]

    ]
    "Dubai.pdf") 
  )
 
 ;-------------------------------------------- CapeTown-PDF -----------------------------------------------
 (defn CapeTown_Gen_PDF[]
    (pdf 
    [{}

    [:heading {:style {:align :center}} "CapeTown"]
    [:spacer ]
    [:line]
    [:spacer ]
    [:heading "Hotels:"]
    [:spacer ]
    ;----------------------- Hotel1 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** One & Only Cape Town *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/CapeTown-h1.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Dock Road, V & A Waterfront Cape Town Western Cape 8002 South Africa 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "5.0 out of 5 stars. Situated in the city center, this luxury hotel is close to Two Oceans Aquarium, Victoria and Alfred Waterfront, and Cape Town Stadium. Also nearby are Cape Town International Convention Centre and Greenmarket Square.

In addition to 4 restaurants, One&Only Cape Town features an outdoor pool. Other amenities include a full-service spa and a marina.

LCD televisions include premium satellite channels. Guestrooms also feature beds with pillowtop mattresses, complimentary wireless Internet access, and complimentary high-speed (wired) Internet access.
"]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- Hotel2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** The Table Bay Hotel *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/CapeTown-h2.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Quay 6 Victoria & Alfred Cape Town Western Cape 8001 South Africa 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "5.0 out of 5 stars. Situated on the boardwalk, this luxury hotel is close to Victoria and Alfred Waterfront, Two Oceans Aquarium, and Cape Town Stadium. Also nearby are Cape Town International Convention Centre and Greenmarket Square.

In addition to 3 restaurants, The Table Bay Hotel features an outdoor pool. Other amenities include a full-service spa and a marina.

LCD televisions include premium satellite channels. Guestrooms also feature complimentary wireless Internet access and bathrooms with separate bathtubs and showers and designer toiletries.
"]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- Hotel3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Cape Grace Hotel *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/CapeTown-h3.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "West Quay Road Victoria And Alfred Waterfront Cape Town Western Cape 8001 South Africa 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "5.0 out of 5 stars. Situated on the waterfront, this luxury hotel is close to Clock Tower, Victoria and Alfred Waterfront, and Two Oceans Aquarium. Also nearby are Cape Town International Convention Centre and Cape Town Stadium.

In addition to a restaurant, Cape Grace Hotel features an outdoor pool. Other amenities include a full-service spa and a marina.

Plasma televisions include premium cable channels. Guestrooms also feature deep soaking bathtubs, complimentary wireless Internet access, and complimentary high-speed (wired) Internet access.
"]
    [:spacer ][:spacer ][:spacer ]
    [:pagebreak]
    ;----------------------- att1 ----------------------------
    [:heading "Attractions:"][:spacer ]
    [:heading {:style {:size 15 :align :center}} "***** Robben Island *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/CapeTown-A1.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Robben Island, Cape Town, 7400, South Africa"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Located just off the coast of Cape Town, Robben Island is not a place to go if visitors are looking only for a good time. Over a span of three centuries, Robben Island was used as a military base, a hospital for those with socially unacceptable diseases such as lepers and as a prison for political prisoners. Its most famous prisoner was undoubtedly Nelson Mandela, who was imprisoned here for 18 years; he went on to become president of South Africa following his release. Today Robben Island is one of the most popular tourist attractions in Cape Town and can be reached by ferry from the V&A Waterfront."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- att2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** 2 Boulders Beach Penguin Colony *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/CapeTown-A2.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Kleintuin Rd, Cape Town, 7995, South Africa"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
      "There aren’t too many places in the world where one can walk on the beach, sunbathe or swim with penguins as companions, but Boulders Beach is one of them. Two penguins settled on this beach, an hour’s drive from Cape Town, in 1982. Now more than 2,000 penguins call this beach home. These are African penguins, sometimes called “jackass” penguins because their chirps sound more like a donkey’s bray than a bird tweet. The path to the penguin area is wheel-chair accessible and allows visitors to get within a few feet of the penguins. While the penguins are used to humans, visitors should look, but not touch them, as they may bite if they get scared."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- att3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** 3 Cape Point *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/CapeTown-A3.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Table Mountain National Park, Cape Peninsula, Cape Town, South Africa"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Spectacular scenery is a good reason to visit Cape Point, located at the very end of the Cape Peninsula. Less than 65 km (40 miles) from Cape Town, Cape Point is extremely picturesque with high boulders and stunning ocean views. Part of the Table Mountain National Park, Cape Point is home to about 250 species of birds as well as baboons and zebra. Its tremendous variety of plant life helps make Cape Point a photographer’s paradise. Visitors have a choice of walking a steep path or taking a funicular to the light house atop the boulders."]
    [:spacer ][:spacer ][:spacer ]
    [:pagebreak]
    ;----------------------- rest1 ----------------------------
    [:heading "Resturants:"][:spacer ]
    [:heading {:style {:size 15 :align :center}} "***** American: The Sticky Fingers BBQ *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/CapeTown-r1.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "96 Station Rd, Observatory, Cape Town, 7925, South Africa"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Vibrant atmosphere serving a variety of jaw dropping multi-flavoured and sized ribs, burgers and chicken "]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- rest2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Italian: Ristorante Posticino *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/CapeTown-r2.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "323 Main Rd, Sea Point, Cape Town, 8060, South Africa"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Over the years the cosy little establishment has expanded to twice its size, right in the heart of Main Road, Sea Point, one of Cape Town’s most established and iconic suburbs. The restaurant quickly established itself as a local favourite, bursting at the seams night after night.
With relentlessly innovative, fresh ideas, the food has always been outstanding, with simple, fresh ingredients used to simply get the best from the dish, all in more than generous portions, and never at a premium.
"]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- rest3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Chinese: Jackie’s Chinese  *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/CapeTown-r3.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Rothchild Rd, Panorama, Cape Town, 7500, South Africa"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "This Chinese restaurant with a difference offers gorgeous, authentic Asian flavours buffet style. The quality ingredients used shine through in the food and with warm, attentive service and a relaxed yet stylish setting you are sure to have a memorable evening.

Regular specials are on offer and the all-you-can-eat buffet is a favourite. Dishes include assorted sushi, maki and California rolls, spring rolls, sesame chicken tempra, roasted baby potatoes, prawn flavoured chips, sweet and sour salad and chicken sweet corn soup.

For the more ravenous diner, traditional Chinese dishes like chow mein, chop suey, sweet and sour pork and Shangai steak are the order of the day. Thai flavours are not forgotten and Thai sweet chilli chicken and Thai chicken curry are both winners.

Apart from the buffet menu, an a la carte option, as well as a take-away option are provided. Here you can kick back, relax and enjoy a taste of Asia. 
"]
    [:spacer ]

    ]
    "CapeTown.pdf") 
  )

;-------------------------------------------- Istanbul-PDF -----------------------------------------------
 (defn Istanbul_Gen_PDF[]
    (pdf 
    [{}

    [:heading {:style {:align :center}} "Istanbul"]
    [:spacer ]
    [:line]
    [:spacer ]
    [:heading "Hotels:"]
    [:spacer ]
    ;----------------------- Hotel1 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Best Western Premier Senator Hotel *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Istanbul-h1.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Gencturk Cd. Sirvanizade Sk. No 5 Sehzadebasi,-Fatih Istanbul Istanbul 34470 Turkey 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "4.5 out of 5 stars. This luxury hotel is located in Istanbul (Laleli), close to Sehzade Mosque, Suleymaniye Mosque, and Grand Bazaar. Also nearby are Hippodrome and Basilica Cistern.

In addition to a restaurant, Best Western Premier Senator Hotel features a health club. Other amenities include a bar/lounge and a coffee shop/café.

LCD televisions include premium satellite channels. Guestrooms also feature beds with Select Comfort mattresses, complimentary wireless Internet access, and complimentary high-speed (wired) Internet access.
"]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- Hotel2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** CVK Hotels & Resorts Park Bosphorus Istanbul *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Istanbul-h2.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Gümüssuyu Mah. Inönü Cad. No:8 Istanbul Istanbul 34437 Turkey 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "5.0 out of 5 stars. This luxury hotel is located in Istanbul (Taksim), close to Ataturk Cultural Center, Taksim Square, and Dolmabahce Palace. Also nearby are Topkapi Palace and Suleymaniye Mosque.

In addition to a restaurant, CVK Hotels & Resorts Park Bosphorus Istanbul features an indoor pool. Other amenities include a full-service spa and a bar/lounge.

Flat-screen televisions include satellite channels. Guestrooms also feature deep soaking bathtubs, complimentary wireless Internet access, and air conditioning.
"]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- Hotel3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Elite World Business Hotel *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Istanbul-h3.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Gültepe Mah. Sehit Zafer Kiziltas Sk. No: 1, Küçükçekmece Istanbul Istanbul Turkey 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "5.0 out of 5 stars. This luxury hotel is located in Istanbul (Kucukcekmece), near the airport, Florya Beach, CNR Expo Center, and TurkuaZoo. Nearby attractions also include Menekse Beach.

In addition to 3 restaurants, Elite World Business Hotel features an indoor pool. Other amenities include a full-service spa and a bar/lounge.

In addition to cable television, guestrooms include jetted bathtubs, complimentary wireless Internet access, and high-speed (wired) Internet access (surcharge).
"]
    [:spacer ][:spacer ][:spacer ]
    [:pagebreak]
    ;----------------------- att1 ----------------------------
    [:heading "Attractions:"][:spacer ]
    [:heading {:style {:size 15 :align :center}} "***** Hagia Sophia *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Istanbul-A1.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Ayasofya Meydanı, Sultanahmet Fatih, Turkey"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "The Hagia Sophia was once a house of worship that served several religions well over the centuries. It started out as a Greek Eastern Orthodox basilica that was home to the Patriarch of Constantinople when it was built in 537. For almost six decades in the 12th century it was a Roman Catholic Church. It became a mosque in 1453, remaining that way until 1931, when it was closed. It reopened as a museum in 1935. At one time, it was the largest cathedral in the world at one time, and served as the inspiration for other mosques, including the Blue Mosque, as it was such a great example of Byzantine architecture. It is most famous for its mosaics depicting various religious scenes."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- att2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Blue Mosque *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Istanbul-A2.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Sultan Ahmet Mh., Torun Sk No:19, 34400 Istanbul, Turkey"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
      "The Blue Mosque, built in the early 17th century, remains an active house of worship today. This means visitors need to time their visits carefully, as the mosque is closed to sightseers during the five daily prayer times for Muslims. All visitors must remove their shoes and women must cover their hair. This is a small price to pay for seeing its priceless treasures that include 20,000 ceramic tiles in various tulip designs and 200 stained glass windows, all with intricate designs. The mosque, built by Sultan Ahmet, takes its name from the blue tiles on the dome and the upper levels of the interior."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- att3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** 3 Grand Bazaar *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Istanbul-A3.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Beyazit/Istanbul, Turkey"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Travelers who love to shop shouldn’t miss out on a visit to the Grand Bazaar, with 5,000 shops making it one of the largest indoor marketplaces in the world. Receiving more than a quarter-million visitors a day, the bazaar features such items as jewelry, carpets that may or may not fly, spices, antiques and hand-painted ceramics. The bazaar dates back to 1461 and today is home to two mosques, four fountains, two hammams or steam baths, and the Cevahir Bedesten, where the rarest and most valuable items have been found traditionally. Here is where shoppers will find old coins, jewelry with precious gems, inlaid weapons and antique furniture."]
    [:spacer ][:spacer ][:spacer ]
    [:pagebreak]
    ;----------------------- rest1 ----------------------------
    [:heading "Resturants:"][:spacer ]
    [:heading {:style {:size 15 :align :center}} "***** American: Egg&Burger Diner Tesvikiye *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Istanbul-r1.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Teşvikiye Mh., Ahmet Fetgari Sk No:38, 34365 Teşvikiye, Turkey"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  { :indent 25}  
    "Egg&Burger is a local restaurant chain focused on Diner-Style burgers, hot dogs and homemade curly fries with 50's Diner-Style interior decorating. "]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- rest2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Italian: Faros Dine & Wine *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Istanbul-r2.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    " Cumhuriyet Caddesi, NO : 31 / A Taksim, 34437 Istanbul, Turkey"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Faros Restaurant starts the day with open breakfast, launched at 07. 30 in the morning and goes on until 11.00 am. during weekdays, and until 12.00am on weekends.
Delicious wood- fried pizzas and home made pastas follow. Rendering service until 01.00 am every night, Faros Restaurant gives you a chance to taste savory examples of world cuisine.
Faros Bar, where you can listen to live DJ music on Thursday, Friday and Saturday, will become the focal point with its import drinks,rich local and import wine menu, and coctails prepared with special sauces. 
"]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- rest3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Chinese: Çin Büfe *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Istanbul-r3.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Kuloğlu Mh., Turnacıbaşı Cd No:6, 34420 İstanbul, Turkey"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "It's true. In Istanbul, if you feel like eating Chinese food, Çin Büfe is probably the only place to eat affordably. You can either eat-in or order to your place.
When Çin Büfe first opened their doors in Beyoğlu, the food was better and the prices were much better. Still, If I am craving for Chinese food, Çin büfe is my only option considering the budget at that time. If not, Dragon is a good restaurant(used to be better).

Çin Büfe newly started to serve Edamame which is great! But I have to say that the noodles kind of taste like pasta. I wish they would taste more like chinese tasting noodles! 
"]
    [:spacer ]

    ]
    "Istanbul.pdf") 
  )

;-------------------------------------------- London-PDF -----------------------------------------------
 (defn London_Gen_PDF[]
    (pdf 
    [{}

    [:heading {:style {:align :center}} "London"]
    [:spacer ]
    [:line]
    [:spacer ]
    [:heading "Hotels:"]
    [:spacer ]
    ;----------------------- Hotel1 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Corinthia Hotel London *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/London-h1.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Whitehall Place London England SW1A 2BD United Kingdom 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "5.0 out of 5 stars. This luxury hotel is located in the heart of London, walking distance from Benjamin Franklin House, Trafalgar Square, and Nelson's Column. Also nearby are London Eye and Big Ben.

At Corinthia Hotel London, recreational amenities include an indoor pool and a sauna. The hotel also features a full-service spa and a conference center.

LCD televisions include premium satellite channels. Guestrooms also feature deep soaking bathtubs, complimentary wireless Internet access, and complimentary high-speed (wired) Internet access.
"]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- Hotel2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Sloane Square Hotel *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/London-h2.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "7-12 Sloane Square London England SW1 W8EG United Kingdom 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "5.0 out of 5 stars. This traditional London hotel is located in the London's city centre, 20 metres from Sloane Square Tube Station, 50 metres from trendy King's Road, and one mile from Harrods.

Guests can enjoy a range of traditional French and classic British food at the informal Cote Brasserie, and ask the multilingual concierge service for help booking tours and tickets.

Sloane Square Hotel's 102 guestrooms mix traditional architectural features with sleek, modern decor; all include free wired and wireless Internet access, satellite television, and minibars
"]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- Hotel3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** The Ritz *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/London-h3.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "150 Piccadilly London England W1J 9BR United Kingdom 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "5.0 out of 5 stars. This seven-story London hotel is centrally located in the West End near Hyde Park, 500 yards from Buckingham Palace, 3 blocks from Piccadilly Circus, and near the exclusive Knightsbridge area.

Stately columns and Belle Époque decor exemplify this palatial hotel, which offers afternoon tea, formal dining room, Art-Deco bar, fitness center, and beauty salon.

The Ritz London has 134 guestrooms furnished in Louis XVI style, with gilded details; amenities include heated towel racks, desks, complimentary wireless Internet access and satellite TV.
"]
    [:spacer ][:spacer ][:spacer ]
    [:pagebreak]
    ;----------------------- att1 ----------------------------
    [:heading "Attractions:"][:spacer ]
    [:heading {:style {:size 15 :align :center}} "***** Big Ben *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/London-A1.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Westminster, London SW1A 0AA, United Kingdom "]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "The 150 year old Big Ben Clock Tower is one of the top tourist attractions in London. The name Big Ben actually refers not to the clock tower itself, but to the 13 ton bell housed within the tower and takes its name from the man who first ordered the bell, Sir Benjamin Hall. The present-day Big Ben bell was constructed in 1858 after a first bell of 16 tons cracked irreparably two years prior. The clock has become a popular attraction and has appeared in many films. In the movie Mars Attacks! For example the Big Ben is destroyed by a UFO attack."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- att2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Buckingham Palace *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/London-A2.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "London SW1A 1AA, United Kingdom"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
      "Buckingham Palace is the main residence of Queen Elizabeth II although it is owned by the British state and is not the monarch’s personal property. The Forecourt of Buckingham Palace is used for Changing of the Guard, a major ceremony and tourist attraction. Between May and July the guard changes each morning and on alternate days the rest of the year. Since 1993, the palace’s state rooms have been open to the public during August and September."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- att3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** 3 Trafalgar Square *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/London-A3.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Trafalgar Square, Westminster, London WC2N 5DN, United Kingdom"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Trafalgar Square is a large city square commemorating Lord Horatio Nelson’s victory against Napoleon’s navy at the Battle of Trafalgar in 1805. The central monument within the square is a single tall column on which the figure of Nelson stands gazing over London. His monument is surrounded by four colossal lions and a series of large fountains. Much more than just an open plaza, Trafalgar Square is one of the most famous city squares in the world and has become a social and political location for tourists and Londoners alike."]
    [:spacer ][:spacer ][:spacer ]
    [:pagebreak]
    ;----------------------- rest1 ----------------------------
    [:heading "Resturants:"][:spacer ]
    [:heading {:style {:size 15 :align :center}} "***** American: Mash *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/London-r1.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "77 Brewer St, London W1F 9ZN, United Kingdom"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Inspired by traditional American steakhouses, with all meat imported from the US, Uruguay, Australia and Denmark, there is ample choice on offer. Pair this with an extensive wine list produced by an award-winning sommelier and it is clear why the MASH experience is not one to be overlooked. The Pre & Post Theatre Menu comprises 3 courses for £25 or 2 for £22, including options of Caesar Salad, Charcuterie, Danish sirloin, side orders and a selection of desserts. The atmosphere is one of sophistication and refined selection, contained within architecturally historic and stunning surroundings. This 350 cover restaurant and bar is an exceptional dining choice when visiting London."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- rest2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Italian: Riccardo's Italian Restaurant  *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/London-r2.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "126 Fulham Rd, Chelsea, London SW3 6HU, United Kingdom"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Riccardo’s restaurant is a godsend! I was recently put on a wheat-free diet and I didn’t think I’d ever be able to eat pasta outside my own kitchen again. Not so – Riccardo’s offers several truly delicious wheat-free versions of classic dishes alongside the regular kind (linguine vongole’s my favourite).The mint tea made with real mint leaves is fabulous too. But don’t get the impression that this is some kind of ‘holier than thou’ place for wearers of sandals and hair-shirts. All the food, wheat-free or not, is delicious and the atmosphere is pure Chelsea"]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- rest3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Chinese: Maximini *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/London-r3.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "31-33 Sussex Pl, London W2 2TH, United Kingdom"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Like shoe designing, whipping up a great dish is an art”, says Jimmy Choo who has ventured into the world of food with Maximini, an oriental restaurant near Hyde Park where the celebrity shoe smith is bringing a slice of his Malaysian home to Britain. As beautifully dressed as any of Jimmy’s A-list clients, Maximini is simplistic and chic with a hint of old fashioned colonial style which perfectly suits it’s fabulous Bayswater address."]
    [:spacer ]

    ]
    "London.pdf") 
  )

;-------------------------------------------- Rome-PDF -----------------------------------------------
 (defn Rome_Gen_PDF[]
    (pdf 
    [{}

    [:heading {:style {:align :center}} "Rome"]
    [:spacer ]
    [:line]
    [:spacer ]
    [:heading "Hotels:"]
    [:spacer ]
    ;----------------------- Hotel1 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Hotel Majestic *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Rome-h1.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Via Vittorio Veneto 50 Rome RM 00187 Italy 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "5.0 out of 5 stars. The neoclassical Hotel Majestic is located less than 1 km (0.6 mi) from the Borghese Art Gallery, Villa Borghese gardens, Trevi Fountain, and the Spanish Steps.

Offering panoramic views of the Via Veneto and nearby Villa Borghese park, the Hotel Majestic's 2 terraces tempt guests with Sicilian cuisine and cocktails.

Individually decorated with a balance between modern and traditional styles, climate-controlled guestrooms overlook Via Veneto or St Isidore convent's garden.
"]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- Hotel2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Boscolo Exedra Roma, Autograph Collection *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Rome-h2.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Piazza Della Republica 47 Rome RM 00185 Italy 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "5.0 out of 5 stars. A regal showcase of Neo Classical architecture, this Rome hotel is located directly on the Piazza della Repubblica across from the Repubblica Metro station.

The bubbly flows over ancient ruins, while other modern offerings include a business center, concierge, rooftop pool, garden, and ground-floor bistro.

The guestrooms of the Exedra, A Boscolo Luxury Hotel has high ceilings which top an infusion of floral-brocades, crocodile leathers and marble; all have minibars.
"]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- Hotel3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Ambasciatori Palace Hotel *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Rome-h3.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Via V. Veneto 62 Rome RM 00187 Italy 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "5.0 out of 5 stars. Set on one of the most well-known streets in the world, Via Veneto, the Ambasciatori Palace Hotel is an elegant choice for those wishing to truly experience La Dolce Vita in Rome.

The Embassy bar stays open until late and is the ideal place in which to enjoy cocktails and drinks.
At the restaurant 'La Terrazza' you can also taste our special menu for celiacs. 

The elegantly furnished and upholstered 152 rooms have all comforts. There are many special touches such as marble fireplaces, Murano lamps and period furnishings.
"]
    [:spacer ][:spacer ][:spacer ]
    [:pagebreak]
    ;----------------------- att1 ----------------------------
    [:heading "Attractions:"][:spacer ]
    [:heading {:style {:size 15 :align :center}} "***** Colosseum *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Rome-A1.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Piazza del Colosseo, 1, 00184 Rome, Italy"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "The Colosseum is the largest and most famous amphitheater in the Roman world. Its construction was started by Emperor Vespasian of the Flavian dynasty in 72 AD and was finished by his son Titus in 80 AD. The Colosseum was capable of holding some 50,000 spectators who could enter the building through no less than 80 entrances. The Colosseum today is a major "]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- att2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** St. Peter's Basilica *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Rome-A2.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Piazza San Pietro, 00120 Vatican City"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
      "The center of the Catholic world and a major tourist attraction, the Basilica of St. Peter is a huge church: with an interior height of 120m, the space shuttle, together with its booster rockets, could fit inside, as could the Statue of Liberty. The basilica stands on the traditional site where Peter, the apostle who is considered the first pope, was crucified and buried. Construction on the current building began in 1506 and was completed in 1615. Many famous artists worked on the complex and its surroundings: Michelangelo designed the dome while Bernini designed the great St. Peter’s Square."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- att3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Trevi Fountain *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Rome-A3.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Piazza di Trevi, 00187 Rome, Italy"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Completed in 1762 to a design by Nicola Salvi, this world famous Baroque fountain features a mythological sculptural composition of Neptune, god of the sea, flanked by two Tritons. The location of the Trevi fountain marks the terminus of the ancient Aqua Virgo aqueduct and is so named on account of its position at the junction of three roads (tre vie). The fountain was the setting for an iconic scene in Fellini’s film Dolce Vita starring Anita Ekberg and Marcello Mastroianni. Since then, it has become one of the most popular Rome tourist attractions"]
    [:spacer ][:spacer ][:spacer ]
    [:pagebreak]
    ;----------------------- rest1 ----------------------------
    [:heading "Resturants:"][:spacer ]
    [:heading {:style {:size 15 :align :center}} "***** American: L'Hamburgeria di Eataly *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Rome-r1.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Via Vittorio Veneto, 11, 00187 Roma, Italy"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Newly opened in Rome by the folks who developed Eataly, after the success of their burger joints in Turin, Bergamo and Rende, the restaurant boasts organic ingredients including Slow Food-approved beef from La Granda in Piedmont, bread made from stone-ground flour and sauces from Cereal Terra. The burgers are Italian-style — pancetto in place of bacon, good Italian cheeses, extra virgin olive oil. A few miles up the ladder from a Big Mac. They offer artiginal beers to wash down your burgers and gelato to top off the meal. Free WiFi, a space to entertain the kids. "]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- rest2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Italian: Ditirambo *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Rome-r2.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Piazza della Cancelleria, 74-75, 00186 Roma RM, Italy"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Don't let the country-kitchen ambience fool you. At this little spot off Campo de' Fiori, the constantly changing selection of offbeat takes on Italian classics is a step beyond ordinary Roman fare. Antipasti can be delicious and unexpected, like Gorgonzola-pear soufflé drizzled with aged balsamic vinegar, or a mille-feuille of mozzarella, sundried tomatoes, and fresh mint. But people really love this place for rustic dishes like roast lamb, suckling pig, and hearty pasta."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- rest3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Chinese: Green T *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Rome-r3.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Via del Piè di Marmo, 28, 00186 Roma, Italy"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "It’s unusual to find good Chinese food in Rome, and this five-room feng shui-designed restaurant is something entirely different: a tearoom and boutique, serving street food, meat and fish dishes, as well as a selection of sushi and dim sum. Save money at lunch by opting for one of the daily fixed-price menus."]
    [:spacer ]

    ]
    "Rome.pdf") 
  )

;-------------------------------------------- Paris-PDF -----------------------------------------------
 (defn Paris_Gen_PDF[]
    (pdf 
    [{}

    [:heading {:style {:align :center}} "Paris"]
    [:spacer ]
    [:line]
    [:spacer ]
    [:heading "Hotels:"]
    [:spacer ]
    ;----------------------- Hotel1 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** La Maison Favart *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Paris-h1.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "5 Rue Marivaux Paris Paris 75002 France 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "4.0 out of 5 stars. Located in the heart of Paris, this hotel is within walking distance of Grevin Museum, place Vendome, the department stores and Paris Opera. The hotel is in front of The Opera Comic.

Recreational amenities at La Maison Favart include a sauna, a relaxing pool (not a swimming pool) and a fitness facility. We offer you a high-speed (wired) Internet access and wireless Internet acces, both free

In addition to flat-panel televisions with satellite channels, guestrooms include iPod docking stations. Bathrooms come with rainfall showerheads and makeup/shaving mirrors.
"]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- Hotel2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** L'Hotel du Collectionneur Arc de Triomphe *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Paris-h2.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "51-57 rue de Courcelles Paris Paris 75008 France 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "5.0 out of 5 stars. A modern seven-storey Paris hotel inspired by the Art Deco style, overlooking Parc de Monceau, one kilometre from the Champs-Élysées.

Hotel guests can work out with personal trainers and unwind with a hydrotonic bath, a massage and a range of beauty treatments.

Hotel du Collectionneur Arc de Triomphe Paris guestrooms feature 1930s-influenced decor and come equipped with high-speed Internet, minibars and air conditioning.
"]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- Hotel3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Hôtel du Louvre, a Hyatt hotel *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Paris-h3.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Place Andre Malraux Paris Paris 75001 France 1-855-296-5764"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "5.0 out of 5 stars. Situated in the heart of the Paris, between the Louvre Museum, the Opera Garnier and the Palais Royal. Place de la Concorde, Notre-Dame Cathedral and shopping district are a few steps away.

This 5-star hotel features free services as wireless, fitness room, and golden keys concierges.

Sleep comes easy in soundproof guestrooms with 2 sets of double-glazed windows. All Hotel du Louvre rooms feature views of the inner courtyard or boulevards facing the historical monuments.
"]
    [:spacer ][:spacer ][:spacer ]
    [:pagebreak]
    ;----------------------- att1 ----------------------------
    [:heading "Attractions:"][:spacer ]
    [:heading {:style {:size 15 :align :center}} "***** Eiffel Tower *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Paris-A1.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Champ de Mars, 5 Anatole France Ave, 75007 Paris, France"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Visiting the iconic symbol of Paris usually ranks as the number one thing to do for most tourists. Towering more than 1,000 feet (300 meters) high in the Champ de Mars park, this iron structure was constructed for the 1889 World Exposition. One of the world’s most photographed tourist attractions, the Eiffel Tower presents an excellent photography opportunity for both day and night times. Visitors can ride the elevator to see incredible views of the "]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- att2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Louvre *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Paris-A2.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "75001 Paris, France"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
      "Topping the list of the world’s most visited museums, the Louvre Museum is located in the Louvre Palace with its signature glass pyramid marking its entrance. Housing a collection of more than 1 million objects, the Louvre boasts some of the world’s most famous art works such as Leonardo da Vinci’s “Mona Lisa,” Michelangelo’s “Dying Slave” and the Greek statue, “Venus of Milo.” Other popular exhibits include the extravagant apartments of Napoleon III, the ancient Code of Hammurabi, Egyptian antiquities and paintings by masters like Rembrandt and Rubens."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- att3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Notre Dame de Paris *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Paris-A3.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "6 Parvis Notre-Dame - Place Jean-Paul II, 75004 Paris, France"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "No trip to Paris could be complete without a visit to the world famous Notre Dame cathedral. Standing more than 400 feet (120 meters) high with two lofty towers and a spire, this marvelous church is considered a supreme example of French Gothic architecture. A tour of this 13th century masterpiece allows visitors to admire the awe-inspiring rose windows, Gothic carvings, beautiful sculptures and a collection of relics."]
    [:spacer ][:spacer ][:spacer ]
    [:pagebreak]
    ;----------------------- rest1 ----------------------------
    [:heading "Resturants:"][:spacer ]
    [:heading {:style {:size 15 :align :center}} "***** American: Breakfast in America *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Paris-r1.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "4 Rue Malher, 75004 Paris, France"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "It doesn’t get more literal than this. Breakfast in America is a staple in the expat world here in Paris. The little breakfast restaurant with toasters on the tables, a cozy, yet hopping atmosphere that makes you feel like you’re in a diner in Brooklyn. They’ve got delicious burgers, impeccable breakfast and heaps of delicious syrup. Breakfast is served all day long, from 8:30am to 11:00pm."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- rest2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Italian: Ristorante Al Caratello *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Paris-r2.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "5 Rue Audran, 75018 Paris, France"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Recommended place its close to sacre cour and likes a hidden treasure.. we ordered pizza,lasagna and ravioli.. All was delicious...dont hesitate to go...Wonderful pizza and pasta, very reasonable prices and wonderful, very good looking service."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- rest3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Chinese: Chez Vong  *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Paris-r3.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "10 Rue de la Grande Truanderie, 75001 Paris, France"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "At 'Chez Vong', you'll appreciate dozens of meals from Cantonese and Vietnamese gastronomic traditions, classics but executed with talent. A perfect example of architectural integration: In the rooms of this old neighborhood house of the Halles, the original stones live with the Buddhas and bamboos in a quite unrealistic atmosphere."]
    [:spacer ]

    ]
    "Paris.pdf") 
  )

;-------------------------------------------- NewYork-PDF -----------------------------------------------
 (defn NewYork_Gen_PDF[]
    (pdf 
    [{}

    [:heading {:style {:align :center}} "NewYork"]
    [:spacer ]
    [:line]
    [:spacer ]
    [:heading "Hotels:"]
    [:spacer ]
    ;----------------------- Hotel1 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Westin New York at Times Square *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/NewYork-h1.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "W 43rd Street New York NY 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "4.0 out of 5 stars. Located in New York's Theater District, this glass tower rises between West 42nd and West 43rd streets, 1 block from the actual Times Square at Seventh and Broadway.

Guests can dine at Shula's Steak House and No Name Bar, as well as socialize over cocktails and light fare in a street-view lounge. The Westin also features a fitness center and a business center.

Nonsmoking guestrooms offer Westin's signature Heavenly Beds and Heavenly Baths, with bathrobes. Large desks with ergonomic chairs are equipped with two-line speakerphones and high-speed Internet connections.
"]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- Hotel2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** The New York Palace *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/NewYork-h2.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Madison Ave New York NY 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "4.5 out of 5 stars. Built in 1882 by railroad baron Henry Villard and luxuriously renovated in 2013, the grand entrance of this hotel is right across Madison Avenue from majestic St. Patrick's Cathedral.

Guests can work out in a 7,000-square-foot health club with views of St. Patrick's. The hotel also features a full-service spa and 6 restaurants and bars, 2 of which are run by chef Michel Richard.

Spacious guestrooms, some with views of the New York skyline or St. Patrick's, feature plasma TVs, full-size desks and high-speed Internet access. Marble baths come with plush robes.
"]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- Hotel3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Sheraton New York Times Square Hotel *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/NewYork-h3.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "7th Ave New York NY 1-855-873-6559"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "4.0 out of 5 stars. Located in the heart of New York, this hotel is within walking distance of Ed Sullivan Theater, Rockefeller Center, and Radio City Music Hall. Also nearby are Broadway and Times Square.

In addition to a restaurant, Sheraton New York Times Square Hotel features a health club. Other amenities include a bar/lounge and complimentary wireless Internet access.

All guestrooms feature beds with pillowtop mattresses, wireless Internet access (surcharge), and air conditioning. Other amenities include climate control and video-game consoles.
"]
    [:spacer ][:spacer ][:spacer ]
    [:pagebreak]
    ;----------------------- att1 ----------------------------
    [:heading "Attractions:"][:spacer ]
    [:heading {:style {:size 15 :align :center}} "***** Statue of Liberty *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/NewYork-A1.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Liberty Island, New York, NY"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "The Statue of Liberty, a gift from France to the United States, has welcomed new arrivals to the shores of America for over a hundred years. Lady Liberty on her pedestal stands at an impressive 93 meters (305 feet), which visitors can climb for views of Brooklyn and Gustave Eiffel’s supportive framework. For those who choose not to climb the 154 steps to the crown, the pedestal offers panoramic views of the harbor and downtown New York City. Guided tours of Liberty Island are offered throughout the day by Park Rangers and a "]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- att2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Central Park *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/NewYork-A2.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Central Park, New York, NY"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
      "Located in the center of Manhattan, Central Park is a sprawling 840 acres and home to Belvedere Castle, the Central Park Zoo among many other attractions. For naturalists looking to take a break from the big city, relaxing in the Great Lawn or a walk along the extensive paths throughout the park can offer a much needed respite. There are also plenty of outdoor activities to entertain visitors including catch and release fishing at the Dana Discovery Center, rowboat rentals from the Loeb Boathouse. The park boasts six miles of paved roads open only to joggers, bicyclists as well as skateboarders and inline skaters. Central Park is also especially friendly for families with playgrounds and the Tisch Children’s Zoo."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- att3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Times Square *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/NewYork-A3.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Manhattan, NY 10036"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "With over 39 million visitors annually, Times Square is the world’s most visited tourist attraction. The bright lights and big city feel of this commercial intersection have iconified this spot as “The Crossroad of the World.” Today, Times Square is a major center of the world’s entertainment industry. The annual New Year’s Eve ball drop, which began in 1907, has been a staple of the square’s allure. The shopping, entertainment and plethora of restaurants offer many activities and options for every type of visitor. It’s an area not to be missed on a trip to New York City."]
    [:spacer ][:spacer ][:spacer ]
    [:pagebreak]
    ;----------------------- rest1 ----------------------------
    [:heading "Resturants:"][:spacer ]
    [:heading {:style {:size 15 :align :center}} "***** American: Narcissa  *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/NewYork-r1.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "21 Cooper Square, New York, NY 10003"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "It’s hard to believe that a few short years ago, meathead chefs ruled the day, pushing gout-baiting, nose-to-tail feasts and plundering pork-belly reserves into short supply. In those go-go times of beast worship, the seasonal-vegetable gospel played more humming background note than rip-roaring solo. That is, until a worldwide foraging craze made field pickings cool again and signature vegetable dishes became the new reputation makers."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- rest2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Italian: Torrisi Italian Specialties *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/NewYork-r2.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "250 Mulberry St, New York, NY 10012"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Dinner at Torrisi, you see, is quite unlike any other Italian experience in town. It’s even, perplexingly for some, quite unlike lunch, when the handsome, grocery-store-style shop (salamis in the window, Progresso bread crumbs on the shelves) traffics in credible counter-service chicken parm and Italian combo heros, plus hefty slabs of lasagne or eggplant parm (all made as a kind of high-concept gimmick, with American ingredients and nary a hunk of Parmigiano-Reggiano or an imported San Marzano in sight). But then, at 6 p.m., the identity shifts, a culinary conversion that causes some confusion among potential customers dropping in for a turkey hero. Instead, they’re met with a chalkboard menu that lists the night’s prix fixe repast and a pyrotechnic kitchen with something to prove. At $45, dinner’s a tremendous bargain, and a serious delight. In the realm of red-sauce cooking, it’s nothing short of revolutionary."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- rest3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Chinese: China Restaurant *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/NewYork-r3.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "937 Utica Ave, Brooklyn, NY 11203"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Lunch specials include curry chicken, pork lo mein, mixed vegetables and Kung Pao chicken and are $4.95. Bump up to the $5.25 lunch specials for choices like General Tso's chicken, beef with broccoli and shrimp with lobster sauce. Dinner items include orange chicken for $8.25, Hunan shrimp for $8.95 and Mongolian beef for $8.25.
Combination dinners offer a choice of egg flower soup, hot and sour soup, egg roll, crab Rangoon and a choice of pork fried rice, brown rice or steamed rice. Combination dinners include entrees like chicken chop suey, sesame chicken and shrimp broccoli. They start at $7.25."]
    [:spacer ]

    ]
    "NewYork.pdf") 
  )

;-------------------------------------------- Sydney-PDF -----------------------------------------------
 (defn Sydney_Gen_PDF[]
    (pdf 
    [{}

    [:heading {:style {:align :center}} "Sydney"]
    [:spacer ]
    [:line]
    [:spacer ]
    [:heading "Hotels:"]
    [:spacer ]
    ;----------------------- Hotel1 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Shangri-La Hotel *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Sydney-h1.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "176 Cumberland Street The Rocks NSW 2000 Australia 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "5.0 out of 5 stars. Standing in the historic Rocks district of cobbled laneways and designer boutiques, the Shangri-La Hotel, Sydney is less than 500 meters from ferries and trains, Sydney's central business district, shopping, and Sydney Harbor foreshores.

The Altitude Restaurant and Blu Bar on 36 of the hotel offer sweeping views of Sydney Harbor and the Opera House. The hotel also has extensive conference facilities, and CHI, The Spa with swimming pool.

All guestrooms have expansive water views. In addition to premium bedding such as down quilts and silk throws, guestrooms also offer marble bathrooms with bathrobes and slippers.
"]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- Hotel2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** The Westin *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Sydney-h2.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "159 Pitt Street Sydney NSW 2000 Australia 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "5.0 out of 5 stars. Located on Sydney's Martin Place, this central business district hotel is less than 1 kilometer from Sydney Tower, Sydney Parliament House, and Darling Harbour.

The hotel is part of the restored, historic General Post Office. Amenities include extensive meeting facilities, Mosaic Restaurant, Endota Spa, a health club, and retailers.

Westin Sydney guestrooms feature signature Heavenly Beds, 37-inch LCD TVs with premium channels, and deep soaking bathtubs with separate showers.
"]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- Hotel3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Marriott Sydney Harbour *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Sydney-h3.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "30 Pitt Street Sydney NSW 2000 Australia 1-855-873-6560"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "5.0 out of 5 stars. One block from Circular Quay, the world famous Sydney Harbour Bridge and Sydney Opera House, this CBD hotel is a short walk to uptown shopping and downtown business offices, as well as the Royal Botanical Gardens, museums and parks.

The Sydney Harbour Marriott has a business center, high-speed Internet, and comprehensive conference space. Recreation is provided in the fitness center, adjacent indoor swimming pool with spa tub, and a day spa with a sauna.

All guest rooms feature high-speed Internet access and flat-screen TV with premium channels and in-house movies. Catering to business as well as leisure guests, the rooms feature armchairs, writing desks and laptop-size safes.
"]
    [:spacer ][:spacer ][:spacer ]
    [:pagebreak]
    ;----------------------- att1 ----------------------------
    [:heading "Attractions:"][:spacer ]
    [:heading {:style {:size 15 :align :center}} "***** Sydney Opera House *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Sydney-A1.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Bennelong Point, Sydney NSW 2000, Australia"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Perched on the waterfront of Bennelong Point, the Sydney Opera House is one of the world’s most famous buildings. Designed by Danish architect Jørn Utzon, the structure’s sloping white roofs make the performing arts center appear as if it’s a giant ship setting out to sea. The complex was completed in 1973 after 16 years of construction and a cost of more than $100 million. A 2004 renovation added walls of glass to the reception hall, offering visitors views of the harbor. In addition to the 1,500-seat opera house, the center features a concert hall and three other theaters as well as multiple bars and restaurants."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- att2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Queen Victoria Building *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Sydney-A2.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "455 George St, Sydney NSW 2000, Australia"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
      "More commonly referred to as the QVB, the Queen Victoria Building is a five-story shopping center that fills an entire city block and houses nearly 200 retailers. Built by architect George McRae in 1898, the building was designed as a marketplace and concert hall. Later tenants used the building for office space, and the structure began to fall into decay during the Great Depression. QVB has now been restored to its original glory and purpose. A beautiful example of the Romanesque Revival style popularized during Queen Victoria’s reign, the QVB features a large glass dome sheathed in copper, ornamental cast-iron railings and numerous stained glass windows."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- att3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** 3 Sydney Harbour Bridge *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Sydney-A3.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Sydney Harbour Bridge, Sydney NSW, Australia"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "The iconic Sydney Harbour Bridge is both the main method of crossing the harbor and a travel destination for adventurous visitors. Completed in 1932, the bridge features an arch that stands 134 meters (440 feet) above sea level and spans 503 meters (1,654 feet). In 1998, the city opened a Bridge Climb attraction that allows hardy visitors to ascend to the top of the arch. Participants are equipped with protective clothing and secured to a wire lifeline during the three-and-a-half hour climb and descent. For those who want a less-adventurous view from the bridge, the Pylon Lookout Museum is a popular attraction. The museum is accessed from the footpath that runs along the eastern side of the bridge."]
    [:spacer ][:spacer ][:spacer ]
    [:pagebreak]
    ;----------------------- rest1 ----------------------------
    [:heading "Resturants:"][:spacer ]
    [:heading {:style {:size 15 :align :center}} "***** American: Hartsyard *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Sydney-r1.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "33 Enmore Rd, Newtown NSW 2042, Australia"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "There is no denying Hartsyard's heritage; it is palpably American in taste, substance and style. As soon as you push open the glass door, the smell of hickory smoked pork greets you with open arms. You'd be forgiven for thinking you had mistakenly stumbled across a classic American backyard cook-out, but that's what’s beautiful about this Newtown newcomer. You never know what to expect. Start with the poutine ($23) for a no-holds-barred introduction to American cuisine that borrows generously from the Bible Belt, French Canada and the friction between urban and rural dining."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- rest2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Italian: Jamie’s Italian *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Sydney-r2.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "107 Pitt St, Sydney NSW 2000, Australia"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Jamie's Italian was founded in Oxford just four years ago. Since then it has grown to more than 30 restaurants worldwide, and there are already plans for even more in new towns, counties and continents around the world."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- rest3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Chinese: Palace Chinese Restaurant *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Sydney-r3.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "133/143-145 Castlereagh St, Sydney NSW 2000, Australia"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "At the Palace Chinese Restaurant, you no longer have to settle for the same kind of Cantonese Cuisine. Explore the exciting menu that offers you the variety that fine Cantonese cooking will give you, in both traditional and modern Cantonese cuisine that best suits the mood and occasion, be it business or pleasure.
You will find not just one delectable dish but many equally fantastic dishes to entice you palates, with choices of live lobster, fish, mud crab and abalone straight from the tank, to the wok and to the table.
"]
    [:spacer ]

    ]
    "Sydney.pdf") 
  )

;-------------------------------------------- Shanghai-PDF -----------------------------------------------
 (defn Shanghai_Gen_PDF[]
    (pdf 
    [{}

    [:heading {:style {:align :center}} "Shanghai"]
    [:spacer ]
    [:line]
    [:spacer ]
    [:heading "Hotels:"]
    [:spacer ]
    ;----------------------- Hotel1 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Regal Shanghai East Asia Hotel *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Shanghai-h1.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "800 Ling Ling Road Shanghai Shanghai 200030 China 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "4.0 out of 5 stars. Set in the Xu Jia Hui commercial district, this Shanghai Stadium hotel is 15 minutes from the Heng Shan Road entertainment area and downtown, walking distance to the Metro station, and convenient to Shanghai's industrial zones.

A 661-square-meter (7,114-square-foot) conference hall is complemented by a full business center. Wireless Internet access covers the conference rooms, restaurants, and all other public areas; a pool, spa tub, and fitness center are also on site.

Both wireless and wired high-speed Internet access are available in the guest rooms, which, owing to the circular shape of the stadium into which they are built, vary in size and outlook.
"]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- Hotel2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Grand Kempinski Hotel Shanghai *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Shanghai-h2.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "1288 Lujiazui Ring Road Shanghai Shanghai 200120 China 1-866-599-6674"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "5.0 out of 5 stars. This luxury hotel is located in Shanghai (Lujiazui), close to Shanghai Ocean Aquarium, Oriental Pearl Tower, and Jin Mao Tower. Also nearby are The Bund and Pudong Riverside Promenade and Park.

Recreational amenities at Grand Kempinski Hotel Shanghai include an indoor pool and a health club. Other amenities include a full-service spa and a poolside bar.

LCD televisions include premium satellite channels. Guestrooms also feature deep soaking bathtubs, iPod docking stations, and sofa beds.
"]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- Hotel3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Grand Hyatt Shanghai *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Shanghai-h3.png"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "88 Century Avenue Pudong New Area Shanghai Shanghai 200121 China 1-855-296-5764"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "4.0 out of 5 stars. This luxury hotel is located in the heart of Shanghai, steps from Shanghai World Financial Center and Jin Mao Tower. Also nearby are Oriental Pearl Tower and The Bund.

In addition to 7 restaurants, Grand Hyatt Shanghai features an indoor pool. Other amenities include a full-service spa and a bar/lounge.

Televisions come with premium cable channels. Guestrooms also feature air conditioning, climate control, and premium bedding.
"]
    [:spacer ][:spacer ][:spacer ]
    [:pagebreak]
    ;----------------------- att1 ----------------------------
    [:heading "Attractions:"][:spacer ]
    [:heading {:style {:size 15 :align :center}} "***** Pudong Skyline *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Shanghai-A1.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "China, Shanghai, Pudong, Xuehai Rd"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  { :indent 25}  
    "Pudong is a district in Shanghai on the eastern side of the Huangpu River that has emerged as China’s financial and commercial hub. A skyline of gleaming skyscrapers rises out of what was mere farmland only 20 years ago. Skyscrapers includes the symbolic Oriental Pearl Tower, the Shanghai World Financial Center, the Jin Mao Building and the Shanghai Tower that should be finished in 2014."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- att2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Shanghai Exhibition Center *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Shanghai-A2.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "Nanjing West Rd, Jing'an, Shanghai, China"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
      "Housed in a modern five-story building, The Shanghai Urban Planning Exhibition Center displays Shanghai’s urban planning and development. The centerpiece of the exhibition is a huge scale model of the city of Shanghai as it will look in 2020. The clear plastic models indicate structures yet to be built, and there are many of them. Visitors can view the miniature city from alongside or ascend to a gallery running around it for views from above."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- att3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** 3 Shanghai World Financial Center *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Shanghai-A3.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "100 Century Ave, Pudong, Shanghai, China"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Located in Pudong, Shanghai, the Shanghai World Financial Center is a mixed use skyscraper which consists of offices, hotels, conference rooms, observation decks, and shopping malls. The Park Hyatt Shanghai Hotel contains 174 rooms and suites. In 2007 the skyscraper was topped out at 492 meters (1,614.2 ft) and became the tallest structure in the China, including Hong Kong. The most distinctive feature in the design of the building is the hole at the top. The original circular design received protests from some Chinese who considered it too similar to the rising sun of the Japanese flag. An alternative design replaced the circle with a trapezoidal hole, which, according to some, makes the building look like a giant bottle opener."]
    [:spacer ][:spacer ][:spacer ]
    [:pagebreak]
    ;----------------------- rest1 ----------------------------
    [:heading "Resturants:"][:spacer ]
    [:heading {:style {:size 15 :align :center}} "***** American:Malone's *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Shanghai-r1.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "255 Tongren Rd, Jing'an, Shanghai, China"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Specialties: Malone's is an old American cafe in Shanghai. Its big hamburger is the signature dish. Besides having delicious food, diners can also play darts, billiards or watch televised sports games in the restaurant."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- rest2 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Italian: Da Marco *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Shanghai-r2.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "103 Dongzhu'anbang Rd, Changning, Shanghai, China"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "The bright and cheery palette of citrus hues welcomes you before even taking a seat in this comfortable and classic restaurant. Decadent desserts, plentiful pastas, pizzas, carne and gnocchi galore will make for a bella noche in jovial, convivial surroundings. Set lunches are also available."]
    [:spacer ][:spacer ][:spacer ]

     ;----------------------- rest3 ----------------------------
    [:heading {:style {:size 15 :align :center}} "***** Chinese: Lost Heaven *****"]
    [:image   {:xscale     0.5
    :yscale     0.5
    :align      :center
    :pad-left   100
    :pad-right  100}
    "resources/Shanghai-r3.jpg"]

    [:spacer ]
    [:phrase {:style :bold} "Location: "]
    [:paragraph {:indent 25} 
    "38 Gaoyou Rd, Xuhui, Shanghai, China"]
    [:spacer ]

    [:phrase {:style :bold}  "Description: "]
    [:paragraph  {:indent 25}  
    "Specializing in the tribal cuisine of China's Yunnan province, Lost Heaven has all the makings of a proper date restaurant: exotic cuisine, enchanted decor, atmospheric music and dim, flickering candlelight. "]
    [:spacer ]

    ]
    "Shanghai.pdf") 
  )
;-------------------------------------------- Berlin-Attraction1 -----------------------------------------------
  (defn Berlin-A1_frame []
    (frame :title "Berlin's 1st Attraction"
      :on-close :hide :size [640 :by 480]
      :content (vertical-panel :background :moccasin :items [
                                                              (flow-panel :align :center :background :moccasin
                                                                :items [(label :text "***** Brandenburg Gate *****" :font "Cambria-BOLD-24")])
                                                              (flow-panel :align :center :background :moccasin
                                                                :items [(invoke-now (label :icon "Berlin-A1.jpg" :border 3 :background :black))])
                                                              (grid-panel :border "" :hgap 10
                                                                :columns 2 :background :moccasin
                                                                :items [(border-panel :vgap 5 :background :moccasin
                                                                          :north (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                          :center (text :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                                        :foreground :saddlebrown :background :moccasin :text "
      Built in the late 1700s, the Brandenburg gate is the only surviving
      city gate of Berlin. The gate is in the western part of Berlin and
      marks the entrance to Unter den Linden.Used as one of the Berlin Wall
      crossings, the gate became a site of protest during the division of
      Germany and a place of celebration when the wall fell in 1989.The gate
      was severely damaged in World War II and underwent extensive renovation
      in the early 2000s. Today it is fully restored and is the symbol of not
      only the turbulent history of the region, but also the reunification of
      East and West Berlin."
                                                                                                                     ))
                                                              (scrollable (border-panel :vgap 5 :background :moccasin
                                                                             :north (flow-panel :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                        (label :text "Pariser Platz, 10117 Berlin, Germany"
                                                                                               :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                             :center (flow-panel :align :center :background :moccasin
                                                                                       :items [(button_format (button :text "Google Map"
                                                                                                                :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Brandenburg+Gate/@52.516275,13.377704,17z/data=!3m1!4b1!4m2!3m1!1s0x47a851c655f20989:0x26bbfb4e84674c63")))]))])
                                                                                                                      ))])])))

  ;-------------------------------------------- Berlin-Attraction2 -----------------------------------------------
  (defn Berlin-A2_frame []
    (frame :title "Berlin's 2nd Attraction"
      :on-close :hide :size [640 :by 480]
      :content (vertical-panel :background :moccasin :items [
                                                              (flow-panel :align :center :background :moccasin
                                                                :items [(label :text "***** Reichstag *****" :font "Cambria-BOLD-24")])
                                                              (flow-panel :align :center :background :moccasin
                                                                :items [(invoke-now (label :icon "Berlin-A2.jpg" :border 3 :background :black))])
                                                              (grid-panel :border "" :hgap 10
                                                                :columns 2 :background :moccasin
                                                                :items [(border-panel :vgap 5 :background :moccasin
                                                                          :north (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                          :center (text :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                                        :foreground :saddlebrown :background :moccasin :text "
      The Reichstag is the seat of the German Parliament and an historic landmark.
      A fire in 1933 and air raids during the Battle of Berlin in 1945 caused a great
      deal of damage. The Reichstag sits near the Brandenburg Gate and was not fully
      restored until after the deconstruction of the Berlin Wall and the German
      reunification. Some historical scars, such as graffiti left by Soviet soldiers,
      were left as a tribute to the building’s difficult past. The original building
      was designed by several architects and the mix of styles in the completed
      structure was somewhat controversial at the time, but now is appreciated by
      thousands of visitors each year. The glass dome at the top of the building
      provides a magnificent view of the city and visitors must register in advance
      to enter it."
                                                                                                                     ))
                                                                   (scrollable (border-panel :vgap 5 :background :moccasin
                                                                                 :north (flow-panel :align :center :background :moccasin
                                                                                          :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                                  (label :text "Platz der Republik 1, 11011 Berlin, Germany"
                                                                                                         :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                                 :center (flow-panel :align :center :background :moccasin
                                                                                           :items [(button_format (button :text "Google Map"
                                                                                                                    :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Reichstag+Building/@52.51862,13.376187,17z/data=!3m1!4b1!4m2!3m1!1s0x47a851c741ee506d:0x641b52d3abf17de5")))]))])
                                                                                                                       ))])])))

  ;-------------------------------------------- Berlin-Attraction3 -----------------------------------------------
  (defn Berlin-A3_frame []
    (frame :title "Berlin's 3rd Attraction"
      :on-close :hide :size [640 :by 480]
      :content (vertical-panel :background :moccasin :items [
                                                              (flow-panel :align :center :background :moccasin
                                                                :items [(label :text "***** East Side Gallery *****" :font "Cambria-BOLD-24")])
                                                              (flow-panel :align :center :background :moccasin
                                                                :items [(invoke-now (label :icon "Berlin-A3.jpg" :border 3 :background :black))])
                                                              (grid-panel :border "" :hgap 10
                                                                :columns 2 :background :moccasin
                                                                :items [(border-panel :vgap 5 :background :moccasin
                                                                          :north (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                          :center (text :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                                        :foreground :saddlebrown :background :moccasin :text "
      The East Side Gallery is the longest stretch of the Berlin Wall still in existence.
      Often described as a memorial to freedom, it showcases paintings of artists from
      around the world. The artwork, which began appearing in 1990, documents the changing
      time after the fall of the Berlin Wall as well as expressing hope for the future.
      Sections of the wall have been moved to facilitate construction and other portions
      have been damaged by erosion and vandalism."
                                                                                                                     ))
                                                                (scrollable (border-panel :vgap 5 :background :moccasin
                                                                              :north (flow-panel :align :center :background :moccasin
                                                                                       :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                               (label :text "Muehlen St, 10243 Berlin, Germany"
                                                                                                      :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                                       :center (flow-panel :align :center :background :moccasin
                                                                                                 :items [(button_format (button :text "Google Map"
                                                                                                                          :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/East+Side+Gallery/@52.505022,13.439695,17z/data=!3m1!4b1!4m2!3m1!1s0x47a847a6f5edaf4b:0xde9be97b4a912818")))]))])
                                                                                                                       ))])])))

  ;-------------------------------------------- Berlin-Hotel1 -----------------------------------------------
  (defn Berlin-h1_frame []
    (frame :title "Berlin's 1st Hotel"
      :on-close :hide :size [640 :by 480]
      :content (vertical-panel :background :moccasin :items [
                                                              (flow-panel :align :center :background :moccasin
                                                                :items [(label :text "***** The Westin Grand *****" :font "Cambria-BOLD-24")])
                                                              (flow-panel :align :center :background :moccasin
                                                                :items [(invoke-now (label :icon "Berlin-h1.png" :border 3 :background :black))])
                                                              (grid-panel :border "" :hgap 10
                                                                :columns 2 :background :moccasin
                                                                :items [(border-panel :vgap 5 :background :moccasin
                                                                          :north (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                          :center (text :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                                        :foreground :saddlebrown :background :moccasin :text "
      5.0 out of 5 stars. In Mitte, Berlin's historic district, the
      hotel is located where boulevard Unter den Linden meets
      Friedrichstrasse and is close to Brandenburg Gate,
      Gendarmenmarkt, the Guggenheim Museum, and Potsdamer Platz.

      The Westin Grand, Berlin features a spacious lobby, on-site
      dining, a spa and wellness center with indoor pool, and
      a 3,000-square-meter garden.

      With views of Berlin or the garden, guestrooms at the Westin
      Grand mix historic décor with modern amenities including
      Heavenly Beds and LED televisions with satellite channels."
                                                                                                                     ))
                                                                   (scrollable (border-panel :vgap 5 :background :moccasin
                                                                                 :north (flow-panel :align :center :background :moccasin
                                                                                          :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                                  (label :text "Friedrichstr. 158-164 Berlin BE 10117 Germany 1-866-599-6674"
                                                                                                         :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                                 :center (flow-panel :align :center :background :moccasin
                                                                                           :items [(button_format (button :text "Google Map"
                                                                                                                    :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/The+Westin+Grand+Berlin/@52.515747,13.388699,17z/data=!3m1!4b1!4m2!3m1!1s0x47a851c4d28db1db:0x51ad8937178453a9")))]))])
                                                                                                                     ))])])))
  ;-------------------------------------------- Berlin-Hotel2 -----------------------------------------------
  (defn Berlin-h2_frame []
    (frame :title "Berlin's 2nd Hotel"
      :on-close :hide :size [640 :by 480]
      :content (vertical-panel :background :moccasin :items [
                                                              (flow-panel :align :center :background :moccasin
                                                                :items [(label :text "***** Kempinski Hotel *****" :font "Cambria-BOLD-24")])
                                                              (flow-panel :align :center :background :moccasin
                                                                :items [(invoke-now (label :icon "Berlin-h2.png" :border 3 :background :black))])
                                                              (grid-panel :border "" :hgap 10
                                                                :columns 2 :background :moccasin
                                                                :items [(border-panel :vgap 5 :background :moccasin
                                                                          :north (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                          :center (text :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                                        :foreground :saddlebrown :background :moccasin :text "
      5.0 out of 5 stars. Located on the Ku'damm shopping strip, the
      hotel is within a half-kilometer (a quarter-mile) of the
      Tiergarten and a U-bahn station, providing links to the rest of
      Berlin.

      Decorated in the luxurious Roman Empire style, the indoor pool
      and fitness area has steam rooms and massage service; on-site
      shops include internationally known designer names.

      Kempinski Hotel Bristol Berlin's 246 elegant guestrooms and 55
      suites feature views of the busy shopping strip or an inner
      courtyard; all have minibars and high-speed Internet access."
                                                                                                                     ))
                                                              (scrollable (border-panel :vgap 5 :background :moccasin
                                                                            :north (flow-panel :align :center :background :moccasin
                                                                                     :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                             (label :text "Kurfuerstendamm 27 Berlin BE 10719 Germany 1-866-599-6674"
                                                                                                    :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Bristol+Bar/@52.503136,13.327174,17z/data=!3m1!4b1!4m2!3m1!1s0x47a850fb6d55078b:0x10307faba4b4552b")))]))])
                                                                                                                     ))])])))
  ;-------------------------------------------- Berlin-Hotel3 -----------------------------------------------
  (defn Berlin-h3_frame []
    (frame :title "Berlin's 3rd Hotel"
      :on-close :hide :size [640 :by 480]
      :content (vertical-panel :background :moccasin :items [
                                                              (flow-panel :align :center :background :moccasin
                                                                :items [(label :text "***** Sofitel Berlin Kurfürstendamm *****" :font "Cambria-BOLD-24")])
                                                              (flow-panel :align :center :background :moccasin
                                                                :items [(invoke-now (label :icon "Berlin-h3.png" :border 3 :background :black))])
                                                              (grid-panel :border "" :hgap 10
                                                                :columns 2 :background :moccasin
                                                                :items [(border-panel :vgap 5 :background :moccasin
                                                                          :north (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                          :center (text :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                                        :foreground :saddlebrown :background :moccasin :text "
      5.0 out of 5 stars. Located at the legendary Kurfürstendamm,
      opposite the Café Kranzler, close to the Memorial Church, the
      KaDeWe and the Berlin Zoo and in an ideal location for shopping
      and sightseeing

      ”Savoir-vivre”: the Brasserie Le Faubourg with terrace and Le
      Faubourg Lounge, the Lutèce Bar and the breakfast restaurant
      St.Germain. More features: Club Etoile, Fitness- und Wellness
      Area, Business Center.

      All rooms and suites are puristic yet extravagant in style,
      whilst also offeringthe latest, cutting-edge technology.
      Each room is equipped with a flat-screen TV and complimentary
      high-speed internet access."
                                                                                                                     ))
                                                                  (scrollable (border-panel :vgap 5 :background :moccasin
                                                                                :north (flow-panel :align :center :background :moccasin
                                                                                         :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                                 (label :text "Augsburger Str. 41 Berlin BE 10789 Germany 1-866-599-6674"
                                                                                                        :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                                :center (flow-panel :align :center :background :moccasin
                                                                                          :items [(button_format (button :text "Google Map"
                                                                                                                   :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Hotel+Concorde+Berlin/@52.502854,13.33163,17z/data=!3m1!4b1!4m2!3m1!1s0x47a850fed4d3b0a7:0x16e12bd9a5af6d1f")))]))])
                                                                                                                     ))])])))


  ;-------------------------------------------- Berlin-Restaurant1 -----------------------------------------------
  (defn Berlin-r1_frame []
    (frame :title "Berlin's Best American Restaurant"
      :on-close :hide :size [640 :by 480]
      :content (vertical-panel :background :moccasin :items [
                                                              (flow-panel :align :center :background :moccasin
                                                                :items [(label :text "***** Cruise-In American Diner *****" :font "Cambria-BOLD-24")])
                                                              (flow-panel :align :center :background :moccasin
                                                                :items [(invoke-now (label :icon "Berlin-r1.jpg" :border 3 :background :black))])
                                                              (grid-panel :border "" :hgap 10
                                                                :columns 2 :background :moccasin
                                                                :items [(border-panel :vgap 5 :background :moccasin
                                                                          :north (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                          :center (text :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                                        :foreground :saddlebrown :background :moccasin :text "
      If you miss the typical American bars from the 1950s movie,
      it is time for a time journey. The food is affordable and tasty,
      the service is good and the same can be said about the prices.
      The only regret is that it is not open the whole day,
      as it used to be in America of the beginning of the 20th century.
      Very very american, cool and very tasty!

      To the west lies the Americas, in the west of Berlin, the Cruise-In Diners.
      Who wants a change in Spandau times to burgers and burritos, may also
      wonderful brunch on the weekend here. On the buffet's Bacon & Beans,
      Scrambled Eggs and Pancakes filled. The best: € 5.50 per person
      for the hot drinks are already included. "

                                                                                                                     ))
                                                                  (scrollable (border-panel :vgap 5 :background :moccasin
                                                                                :north (flow-panel :align :center :background :moccasin
                                                                                         :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                                 (label :text "Päwesiner Weg 25a Berlin, Germany"
                                                                                                        :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                                :center (flow-panel :align :center :background :moccasin
                                                                                          :items [(button_format (button :text "Google Map"
                                                                                                                   :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Cruise-In+American+Diner/@52.532657,13.178672,17z/data=!3m1!4b1!4m2!3m1!1s0x47a8562e477a0ce7:0x612a868e6bbebe14")))]))])
                                                                                                                     ))])])))
  ;-------------------------------------------- Berlin-Restaurant2 -----------------------------------------------
  (defn Berlin-r2_frame []
    (frame :title "Berlin's Best Italian Restaurant"
      :on-close :hide :size [640 :by 480]
      :content (vertical-panel :background :moccasin :items [
                                                              (flow-panel :align :center :background :moccasin
                                                                :items [(label :text "***** Don Camillo *****" :font "Cambria-BOLD-24")])
                                                              (flow-panel :align :center :background :moccasin
                                                                :items [(invoke-now (label :icon "Berlin-r2.jpg" :border 3 :background :black))])
                                                              (grid-panel :border "" :hgap 10
                                                                :columns 2 :background :moccasin
                                                                :items [(border-panel :vgap 5 :background :moccasin
                                                                          :north (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                          :center (text :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                                        :foreground :saddlebrown :background :moccasin :text "
      Don Camillo has no menu; instead the waiter will bring out a cart
      where you can choose different ingredients to create your own
      appetizers and mains. It's a small quaint restaurant with a high-quality feel.
      It is a really classy establishment.
      The prices at this highly-thought-of restaurant will leave you satisfied
      as much as the mood, though it can tend towards the more expensive.
      The atmosphere is very quiet and calming, especially in the summer where
      one can sit out on their cosy garden. The menu offers traditional, expertly
      prepared Italian dishes. Reservations are definitely recommended.
      The closest S-Bahn station is at Sophie-Charlotte-Platz.
      You will receive a menu containing letters only if you specifically ask for one.
      This is because, contrary to fancy designer-styled Italian restaurants,
      our maître d’s will present to you directly at your table,
      if required in five different languages, the various imaginative
      combinations of fresh ingredients that make up our delicious dishes."
                                                                                                                     ))
                                                               (scrollable (border-panel :vgap 5 :background :moccasin
                                                                             :north (flow-panel :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Schloßstraße 7, 14059 Berlin, Germany"
                                                                                                     :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                             :center (flow-panel :align :center :background :moccasin
                                                                                       :items [(button_format (button :text "Google Map"
                                                                                                                :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Don+Camillo/@52.516664,13.295466,17z/data=!3m1!4b1!4m2!3m1!1s0x47a85128a65d5b51:0x2557533985137ba1")))]))])
                                                                                                                     ))])])))
  ;-------------------------------------------- Berlin-Restaurant3 -----------------------------------------------
  (defn Berlin-r3_frame []
    (frame :title "Berlin's Best Chinese Restaurant"
      :on-close :hide :size [640 :by 480]
      :content (vertical-panel :background :moccasin :items [
                                                              (flow-panel :align :center :background :moccasin
                                                                :items [(label :text "***** Aroma *****" :font "Cambria-BOLD-24")])
                                                              (flow-panel :align :center :background :moccasin
                                                                :items [(invoke-now (label :icon "Berlin-r3.jpg" :border 3 :background :black))])
                                                              (grid-panel :border "" :hgap 10
                                                                :columns 2 :background :moccasin
                                                                :items [(border-panel :vgap 5 :background :moccasin
                                                                          :north (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                          :center (text :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                                        :foreground :saddlebrown :background :moccasin :text "
      Aroma had a great selection of coffee drinks  pastries, soups and sandwiches, and they were
      quick with the orders. That second part was surprising because almost everyone ordered the
      same drink-a blended frozen coffee drink with or without ice cream. Since they have to blend
      those drinks, it can take a long time, and as a former barista, i can attest that it's very
      annoying when one customer after another after another orders frozen drinks. Phenomenal food
      and outstanding service. Large portions filled us up and the staff couldn't have been friendlier
      to foreigners. Great place! Not far from Good Friends and also located on Kantstraße is Aroma.
      They have one of the tastiest and largest selections of Dim Sum in the city
      -- if one is craving Dim Sum, this is apparently the place to go. "
                                                                                                                     ))
                                                               (scrollable (border-panel :vgap 5 :background :moccasin
                                                                             :north (flow-panel :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Kantstraße 35, 10625 Berlin, Germany"
                                                                                                     :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                             :center (flow-panel :align :center :background :moccasin
                                                                                       :items [(button_format (button :text "Google Map"
                                                                                                                :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Aroma/@52.506372,13.315576,17z/data=!3m1!4b1!4m2!3m1!1s0x47a850e3c55aec37:0xb5520e4f3641de65")))]))])
                                                                                                                     ))])])))

  ;--------------------------------------------------- Berlin ------------------------------------------------------
  (defn Berlin_frame []
    (frame :title "Berlin Guide"
      :on-close :hide :size [640 :by 480]
      :content (scrollable (vertical-panel :items [
                    (grid-panel :border "BERLIN'S TOP ATTRACTIONS" :hgap 20
                                :columns 3 :background :moccasin
                                :items [(border-panel :vgap 3 :background :moccasin
                                          :center (invoke-now (icon_format (label :icon "iBerlin-A1.jpg")))
                                          :south (button_format (button :text "Brandenburg Gate"
                                                        :listen [:action (fn [e] (-> (Berlin-A1_frame) show!))])))
                                        (border-panel :vgap 3 :background :moccasin
                                          :center (invoke-now (icon_format (label :icon "iBerlin-A2.jpg")))
                                          :south (button_format (button :text "Reichstag"
                                                        :listen [:action (fn [e] (-> (Berlin-A2_frame) show!))])))
                                        (border-panel :vgap 3 :background :moccasin
                                          :center (invoke-now (icon_format (label :icon "iBerlin-A3.jpg")))
                                          :south (button_format (button :text "East Side Gallery"
                                                        :listen [:action (fn [e] (-> (Berlin-A3_frame) show!))])))])
                    (grid-panel :border "BERLIN'S TOP HOTELS" :hgap 20
                                :columns 3 :background :moccasin
                                :items [(border-panel :vgap 3 :background :moccasin
                                          :center (invoke-now (icon_format (label :icon "iBerlin-h1.png")))
                                          :south (button_format (button :text "The Westin Grand"
                                                        :listen [:action (fn [e] (-> (Berlin-h1_frame) show!))])))
                                        (border-panel :vgap 3 :background :moccasin
                                          :center (invoke-now (icon_format (label :icon "iBerlin-h2.png")))
                                          :south (button_format (button :text "Kempinski Hotel"
                                                        :listen [:action (fn [e] (-> (Berlin-h2_frame) show!))])))
                                        (border-panel :vgap 3 :background :moccasin
                                          :center (invoke-now (icon_format (label :icon "iBerlin-h3.png")))
                                          :south (button_format (button :text "Sofitel Berlin Kurfürstendamm"
                                                       :listen [:action (fn [e] (-> (Berlin-h3_frame) show!))])))])
                    (grid-panel :border "BERLIN'S TOP RESTAURANTS" :hgap 20
                                :columns 3 :background :moccasin
                                :items [(border-panel :vgap 3 :background :moccasin
                                          :center (invoke-now (icon_format (label :icon "iBerlin-r1.jpg")))
                                          :south (button_format (button :text "Cruise-In American Diner"
                                                        :listen [:action (fn [e] (-> (Berlin-r1_frame) show!))])))
                                        (border-panel :vgap 3 :background :moccasin
                                          :center (invoke-now (icon_format (label :icon "iBerlin-r2.jpg")))
                                          :south (button_format (button :text "Don Camillo"
                                                        :listen [:action (fn [e] (-> (Berlin-r2_frame) show!))])))
                                        (border-panel :vgap 3 :background :moccasin
                                          :center (invoke-now (icon_format (label :icon "iBerlin-r3.jpg")))
                                          :south (button_format (button :text "Aroma"
                                                        :listen [:action (fn [e] (-> (Berlin-r3_frame) show!))])))])

                    (flow-panel :align :center :background :moccasin
                                :items [(button_format (button :text "Generate a PDF report"
                                                         :listen [:action (fn [e] (->(Berlin_Gen_PDF) show!))]))])]))))

;-------------------------------------------- CapeTown-Attraction1 -----------------------------------------------
  (defn CapeTown-A1_frame []
    (frame :title "CapeTown's 1st Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Robben Island *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "CapeTown-A1.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Located just off the coast of Cape Town, Robben Island is not
      a place to go if visitors are looking only for a good time.
      Over a span of three centuries, Robben Island was used as a military base,
      a hospital for those with socially unacceptable diseases such as lepers
      and as a prison for political prisoners. Its most famous prisoner was undoubtedly
      Nelson Mandela, who was imprisoned here for 18 years; he went on to become
      president of South Africa following his release. Today Robben Island is one
      of the most popular tourist attractions in Cape Town and can be reached by
      ferry from the V&A Waterfront."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Robben Island, Cape Town, 7400, South Africa"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Robben+Island+Museum/@-33.799754,18.372283,17z/data=!3m1!4b1!4m2!3m1!1s0x1dcc8a6545f4ca5f:0x977bb6cc232872e6")))]))])
                                                                            ))])])))

  ;-------------------------------------------- CapeTown-Attraction2 -----------------------------------------------
  (defn CapeTown-A2_frame []
    (frame :title "CapeTown's 2nd Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Boulders Beach Penguin Colony *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "CapeTown-A2.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      There aren’t too many places in the world where one can walk on the beach, sunbathe or swim
      with penguins as companions, but Boulders Beach is one of them. Two penguins settled on this
      beach, an hour’s drive from Cape Town, in 1982. Now more than 2,000 penguins call this beach
      home. These are African penguins, sometimes called “jackass” penguins because their chirps
      sound more like a donkey’s bray than a bird tweet. The path to the penguin area is wheel-chair
      accessible and allows visitors to get within a few feet of the penguins. While the penguins
      are used to humans, visitors should look, but not touch them, as they may bite if they get scared."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Kleintuin Rd, Cape Town, 7995, South Africa"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Boulders+Beach/@-34.197116,18.451423,17z/data=!3m1!4b1!4m2!3m1!1s0x1dcc3e360872e029:0x7cbce00180f42910")))]))])
                                                                            ))])])))

  ;-------------------------------------------- CapeTown-Attraction3 -----------------------------------------------
  (defn CapeTown-A3_frame []
    (frame :title "CapeTown's 3rd Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Cape Point *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "CapeTown-A3.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Spectacular scenery is a good reason to visit Cape Point, located at the very end of
      the Cape Peninsula. Less than 65 km (40 miles) from Cape Town, Cape Point is extremely
      picturesque with high boulders and stunning ocean views. Part of the Table Mountain
      National Park, Cape Point is home to about 250 species of birds as well as baboons and
      zebra. Its tremendous variety of plant life helps make Cape Point a photographer’s
      paradise. Visitors have a choice of walking a steep path or taking a funicular to the
      light house atop the boulders."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Table Mountain National Park, Cape Peninsula, Cape Town, South Africa"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Cape+Point,+Table+Mountain+National+Park,+Cape+Peninsula,+Cape+Town,+South+Africa/@-34.35684,18.4969599,17z/data=!3m1!4b1!4m2!3m1!1s0x1dcc23a04226551b:0x4c00435a90458a41")))]))])
                                                                            ))])])))

  ;-------------------------------------------- CapeTown-Hotel1 -----------------------------------------------
  (defn CapeTown-h1_frame []
    (frame :title "CapeTown's 1st Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** One & Only Cape Town *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "CapeTown-h1.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      5.0 out of 5 stars. Situated in the city center, this luxury hotel is close
      to Two Oceans Aquarium, Victoria and Alfred Waterfront, and Cape Town Stadium.
      Also nearby are Cape Town International Convention Centre and Greenmarket Square.

      In addition to 4 restaurants, One&Only Cape Town features an outdoor pool. Other
      amenities include a full-service spa and a marina.

      LCD televisions include premium satellite channels. Guestrooms also feature beds
      with pillowtop mattresses, complimentary wireless Internet access, and complimentary
      high-speed (wired) Internet access."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Dock Road, V & A Waterfront Cape Town Western Cape 8002 South Africa 1-866-599-6674"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/One%26Only+Cape+Town/@-33.908629,18.416446,17z/data=!3m1!4b1!4m2!3m1!1s0x1dcc675b39ed6e6f:0xe5de8ba08d3c1f32")))]))])
                                                                            ))])])))
  ;-------------------------------------------- CapeTown-Hotel2 -----------------------------------------------
  (defn CapeTown-h2_frame []
    (frame :title "CapeTown's 2nd Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** The Table Bay Hotel *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "CapeTown-h2.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      5.0 out of 5 stars. Situated on the boardwalk, this luxury hotel is close to
      Victoria and Alfred Waterfront, Two Oceans Aquarium, and Cape Town Stadium.
      Also nearby are Cape Town International Convention Centre and Greenmarket Square.

      In addition to 3 restaurants, The Table Bay Hotel features an outdoor pool.
      Other amenities include a full-service spa and a marina.

      LCD televisions include premium satellite channels. Guestrooms also feature
      complimentary wireless Internet access and bathrooms with separate bathtubs
      and showers and designer toiletries."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Quay 6 Victoria & Alfred Cape Town Western Cape 8001 South Africa 1-866-599-6674"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/The+Table+Bay+Hotel/@-33.90282,18.422047,17z/data=!3m2!4b1!5s0x1dcc6750c71e8ca3:0xae90d9bf0e7b6780!4m2!3m1!1s0x1dcc6757301d79a5:0xe24f6ba1ad1f0dfd")))]))])
                                                                            ))])])))
  ;-------------------------------------------- CapeTown-Hotel3 -----------------------------------------------
  (defn CapeTown-h3_frame []
    (frame :title "CapeTown's 3rd Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Cape Grace Hotel *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "CapeTown-h3.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      5.0 out of 5 stars. Situated on the waterfront, this luxury hotel is close
      to Clock Tower, Victoria and Alfred Waterfront, and Two Oceans Aquarium.
      Also nearby are Cape Town International Convention Centre and Cape Town Stadium.

      In addition to a restaurant, Cape Grace Hotel features an outdoor pool.
      Other amenities include a full-service spa and a marina.

      Plasma televisions include premium cable channels. Guestrooms also feature deep
      soaking bathtubs, complimentary wireless Internet access, and complimentary
      high-speed (wired) Internet access."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "West Quay Road Victoria And Alfred Waterfront Cape Town Western Cape 8001 South Africa 1-866-599-6674"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Signal+Restaurant/@-33.90876,18.420577,17z/data=!3m1!4b1!4m2!3m1!1s0x1dcc67594ff6590d:0x73a408bce3028add")))]))])
                                                                            ))])])))

  ;-------------------------------------------- CapeTown-Restaurant1 -----------------------------------------------
  (defn CapeTown-r1_frame []
    (frame :title "Cape Town's Best American Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** The Sticky Fingers BBQ *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Capetown-r1.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Vibrant atmosphere serving a variety of jaw dropping
      multi-flavoured and sized ribs, burgers and chicken.
      Grill House elect! Every meal provides is a new twist
      on familiar options. Try it ASAP. Really it is that good!
      The menu is interactice allowing customers to periodically
      create burgers that get put on the menu and named after them!
      Very nice trendy restaurant with three outlets in Obs,Rondebosch
      and off longstreet. Amazin Full ribs special on Thuesday.
      With their Salads and chicken wings you can never go wrong.
      Really good food. Burgers and onion rings were very good.
      Interesting combinations on different burgers."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "96 Station Rd, Observatory, Cape Town, 7925, South Africa"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Sticky+Fingers+BBQ/@-33.938187,18.468436,17z/data=!3m1!4b1!4m2!3m1!1s0x1dcc5d0488057d6b:0x2d805277d3bcceaa")))]))])
                                                                            ))])])))
  ;-------------------------------------------- CapeTown-Restaurant2 -----------------------------------------------
  (defn CapeTown-r2_frame []
    (frame :title "Cape Town's Best Italian Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Ristorante Posticino *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Capetown-r2.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Over the years the cosy little establishment has expanded
      to twice its size, right in the heart of Main Road, Sea Point,
      one of Cape Town’s most established and iconic suburbs.
      The restaurant quickly established itself as a local favourite,
      bursting at the seams night after night. With relentlessly innovative,
      fresh ideas, the food has always been outstanding, with simple,
      fresh ingredients used to simply get the best from the dish,
      all in more than generous portions, and never at a premium..
      Great restaurant! Delicious food, great service and
      Jack the owner is a tremendously wonderful person.
      Pizzas are the best..also has a few great wines to
      compliment not only the meals, the experience as well."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "323 Main Rd, Sea Point, Cape Town, 8060, South Africa"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Posticino+Italian+Restaurant/@-33.913768,18.391745,17z/data=!3m1!4b1!4m2!3m1!1s0x1dcc6724ba1a8b91:0xbaa79b543ba464df")))]))])
                                                                            ))])])))
  ;-------------------------------------------- Capetown-Restaurant3 -----------------------------------------------
  (defn CapeTown-r3_frame []
    (frame :title "Cape Town's Best Chinese Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Jackie’s Chinese  *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Capetown-r3.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      This Chinese restaurant with a difference offers gorgeous,
      authentic Asian flavours buffet style. The quality ingredients
      used shine through in the food and with warm, attentive service
      and a relaxed yet stylish setting you are sure to have
      a memorable evening. Regular specials are on offer and the
      all-you-can-eat buffet is a favourite. Dishes include assorted sushi,
      maki and California rolls, spring rolls, sesame chicken tempra,
      roasted baby potatoes, prawn flavoured chips, sweet and sour
      salad and chicken sweet corn soup. Jacky Chinese Restaurant
      offers an exceptional tasting Asian buffet menu,
      a la carte and take-away menu evoking the bountiful
      flavours of authentic Asian recipes. Due to the promising
      quality of our food and services, offered by our hosts
      and chiefs since 1999, we never have any other branch in other area. "
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Rothchild Rd, Panorama, Cape Town, 7500, South Africa"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Jackie%27s+Chinese+Restaurant/@-33.87593,18.57573,17z/data=!3m1!4b1!4m2!3m1!1s0x1dcc5a2c0117bd8d:0xe0ab1a84baa8f112")))]))])
                                                                            ))])])))

  ;----------------------------------------------- CapeTown ------------------------------------------------------
  (defn CapeTown_frame []
    (frame :title "CapeTown Guide"
      :on-close :hide
      :size [640 :by 480]
      :content
      (scrollable(vertical-panel :items [
           (grid-panel :border "CAPE TOWN'S TOP ATTRACTIONS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iCapeTown-A1.jpg" )))
                                 :south  (button_format (button :text "Robben Island"
                                               :listen [:action (fn [e](->(CapeTown-A1_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iCapeTown-A2.jpg" )))
                                 :south  (button_format (button :text "Boulders Beach Penguin Colony"
                                               :listen [:action (fn [e](->(CapeTown-A2_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iCapeTown-A3.jpg" )))
                                 :south  (button_format (button :text "Cape Point"
                                               :listen [:action (fn [e](->(CapeTown-A3_frame) show!))])))])
           (grid-panel :border "CAPE TOWN'S TOP HOTELS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iCapeTown-h1.png" )))
                                 :south  (button_format (button :text "One & Only Cape Town"
                                               :listen [:action (fn [e](->(CapeTown-h1_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iCapeTown-h2.png" )))
                                 :south  (button_format (button :text "The Table Bay Hotel"
                                               :listen [:action (fn [e](->(CapeTown-h2_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iCapeTown-h3.png" )))
                                 :south  (button_format (button :text "Cape Grace Hotel"
                                               :listen [:action (fn [e](->(CapeTown-h3_frame) show!))])))])
           (grid-panel :border "CAPE TOWN'S TOP RESTAURANTS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iCapeTown-r1.jpg" )))
                                 :south  (button_format (button :text "The Sticky Fingers BBQ"
                                               :listen [:action (fn [e](->(CapeTown-r1_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iCapeTown-r2.jpg")))
                                 :south  (button_format (button :text "Ristorante Posticino"
                                               :listen [:action (fn [e](->(CapeTown-r2_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iCapeTown-r3.jpg" )))
                                 :south  (button_format (button :text "Jackie’s Chinese"
                                               :listen [:action (fn [e](->(CapeTown-r3_frame) show!))])))])
           (flow-panel :align :center :background :moccasin
             :items [(button_format (button :text "Generate a PDF report"
                                      :listen [:action (fn [e] (->(CapeTown_Gen_PDF) show!))]))])]))))


;-------------------------------------------- Dubai-Attraction1 -----------------------------------------------
  (defn Dubai-A1_frame []
    (frame :title "Dubai's 1st Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Dubai Mall *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Dubai-A1.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      The Dubai Mall is part of the Burj Khalifa complex, the tallest man-made structure
      ever built. At over 12 million square feet (equivalent in size to more than 50 soccer
      fields), the Dubai Mall is the largest shopping mall in the world based on total area
      but about the same size as the West Edmonton Mall if based on leasable space. The mall
      contains more than 1,200 shops including the world’s largest candy store, an ice rink,
      a SEGA game center (featuring a 3D bowling game), a 5 star luxury hotel, 22 cinema
      screens plus 120 restaurants and cafes. The mall also contains one of the largest
      aquariums in the world."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "DownTown Dubai, Near Souk Al Bahar Bridge - United Arab Emirates"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/The+Dubai+Mall/@25.196356,55.278059,17z/data=!3m1!4b1!4m2!3m1!1s0x3e5f68282fe3dbb1:0xc9a673f9ef407801")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Dubai-Attraction2 -----------------------------------------------
  (defn Dubai-A2_frame []
    (frame :title "Dubai's 2nd Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Burj Al Arab *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Dubai-A2.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      At 321 meters (1,050 ft), the Burj Al Arab is the second tallest building in the wor
      used exclusively as a hotel. However, the Ryugyong Hotel in Pyongyang North Korea
      (unfinished for over 20 years), is 9 meters (30 ft) taller, and the Rose Tower, also
      in Dubai, topped Burj Al Arab’s height at 333 meters (1,090 ft), becoming the world’s
      tallest hotel. One of its restaurants is located 200 meters (660 ft) above the Persian
      Gulf, offering spectacular views of Dubai. The Burj Al Arab stands on an artificial
      island and is connected to the mainland by a private curving bridge.It is an iconic tower,
      designed to symbolize Dubai’s urban transformation and to mimic the sail of a boat."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Jumeirah 3, Jumeirah Road, Near to Jumeirah Beach Hotel - United Arab Emirates"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Burj+Al+Arab/@25.141306,55.185464,17z/data=!3m1!4b1!4m2!3m1!1s0x3e5f6a576f598405:0xabe5256bfa2c9b2d")))]))])
                                                                            ))])])))


  ;-------------------------------------------- Dubai-Attraction3 -----------------------------------------------
  (defn Dubai-A3_frame []
    (frame :title "Dubai's 3rd Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Jumeirah Beach *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Dubai-A3.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Jumeirah Beach is the most popular beach in Dubai and probably best known for the Burj
      Al Arab 7 Star Hotel and Jumeirah Beach Hotel that both rise high above the sand. Other
      attractions here are the warm turquoise waters of the Arabian Gulf and the soft white sand.
      Unfortunately, as a result of rapid expansion and poor planning Dubai’s beaches have been
      contaminated with raw sewage in recent months, leading doctors to warn of health risks.
      This has prompted Dubai to use the international ‘blue flag’ system in the future to signify
      to bathers that their swimming spot is eco-friendly."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text " Jumeirah Rd - Dubai - United Arab Emirates"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Jumeirah+Beach+Hotel/@25.141584,55.191278,17z/data=!3m1!4b1!4m2!3m1!1s0x3e5f6a540d69b295:0x47f78c4e394a2976")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Dubai-Hotel1 -----------------------------------------------
  (defn Dubai-h1_frame []
    (frame :title "Dubai's 1st Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Burj Al Arab *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Dubai-h1.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      5.0 out of 5 stars. Burj Al Arab rises out of its own man-made island off
      the Jumeirah coast, south of the city and 15 miles (25 km) from Dubai
      International Airport. Visible from almost everywhere in the city, it is
      linked to the shore by a gently curving causeway.

      With its distinctively high, sail-inspired exterior, this resort hotel
      has a private beach, an outdoor pool, 2 indoor pools, and a full-service
      spa. 6 restaurants and several bars are located on site.

      Boasting views of the ocean and Jumeirah Beach, these rooms feature
      extensive technology including free WiFi, a 21-inch iMac, 2 HDTVs, Bose
      iPod/iPhone docking station and media hub, and an all-in-one printer/
      copier/scanner/fax."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Jumeirah Beach Road Po Box 74147 Dubai United Arab Emirates 1-866-599-6674"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Burj+Al+Arab/@25.141306,55.185464,17z/data=!3m1!4b1!4m2!3m1!1s0x3e5f6a576f598405:0xabe5256bfa2c9b2d")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Dubai-Hotel2 -----------------------------------------------
  (defn Dubai-h2_frame []
    (frame :title "Dubai's 2nd Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Sofitel Dubai Downtown *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Dubai-h2.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      5-star luxury hotel in Dubai near Burj Khalifa. Situated near the airport, in
      the city center, this luxury hotel is close to Burj Khalifa, The Dubai Fountain,
      and KidZania. Also nearby are Dubai Mall and Dubai International Financial Centre.

      At Sofitel Dubai Downtown, recreational amenities include an outdoor pool and a
      spa tub. The hotel also features a full-service spa and a complimentary children's
      club.

      Flat-screen televisions include premium satellite channels. Guestrooms also feature
      deep soaking bathtubs, private spa tubs, and complimentary wireless Internet access."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Sheihk Zayed Road Downtown Dubai Dubai United Arab Emirates 1-866-599-6674"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Sofitel+Dubai+The+Palm+Luxury+Apartments/@25.131265,55.116935,13z/data=!4m5!1m2!2m1!1sSofitel+Dubai+Downtown!3m1!1s0x3e5f154a3af8b24f:0x6607557459d2717c")))]))])
                                                                            ))])])))
  ;-------------------------------------------- Dubai-Hotel3 -----------------------------------------------
  (defn Dubai-h3_frame []
    (frame :title "Dubai's 3rd Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Atlantis The Palm *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Dubai-h3.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      5.0 out of 5 stars. Offering 1.5 km (0.9 mi) of beach access, this lavish
      resort is located on Palm Island, a palm-tree-shaped artificial island just
      off Dubai's Jumeira coast. Dubai Marina Mall is 6.5 km (4 mi) away.

      Atlantis The Palm features the Aquaventure waterpark, dolphin encounters,
      the underwater Lost Chambers, and 2 outdoor pools. Other highlights include
      luxury boutiques and a spa.

      Spacious guestrooms have balconies or patios with views of Palm Island and/or
      the Arabian Gulf. Rooms also offer flat-panel TVs, iPod docks, and Internet
      access (surcharge). Bathrooms come with separate showers and tubs."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Crescent Road The Palm Dubai United Arab Emirates 1-866-599-6674"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Atlantis+The+Palm/@25.131265,55.116935,17z/data=!3m1!4b1!4m2!3m1!1s0x3e5f153e3609c979:0x5945a418a804ac5")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Dubai-Restaurant1 -----------------------------------------------
  (defn Dubai-r1_frame []
    (frame :title "Dubai's Best American Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "*****  JW’s Steakhouse *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Dubai-r1.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      very good food, excellent service, Steak 'on the point' as ordered.
      Not cheap, though- but good things can't be cheap.
      From the comfortable overstuffed armchairs to the lengthy mahogany bar,
      the award-winning JW’s Steakhouse exudes masculinity with an emphasis on
      inventive entrées and steaks that cut like butter. While the main reason
      people come here is the steak, which is undeniably good, aged just so, served
      rare and accompanied by two dainty sauces on the side– it is the foie gras
      that is most memorable. Sure, your conscience may hurt a bit afterwards, but boy
      is it worth it for this unctuous little pile of seared goose liver, silkily rare
      in the middle, melt-in-the-mouth velvety on the outside, sitting on a dollop of
      onion marmalade and a sticky criss-cross of balsamic reduction."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "JW Marriott Dubai - Abu Baker Al Siddique Rd, Dubai - United Arab Emirates"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/JW%27s+Steakhouse/@25.2681,55.3296,17z/data=!3m1!4b1!4m2!3m1!1s0x3e5f436ae7a97b57:0x780ab8f28e9dc6d9")))]))])
                                                                            ))])])))
  ;-------------------------------------------- Dubai-Restaurant2 -----------------------------------------------
  (defn Dubai-r2_frame []
    (frame :title "Dubai's Best Italian Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Armani/Ristorante *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Dubai-r2.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Even the entrance and reception is an experience !so here everything begins...
      The great staff and service is the opening of a special world of italian taste !
      Try the mushroom Risotto with black tartufo or the Fisch,something you never forget !!!
      Going to Dubai without visiting Armani ristorante is like you've never been in Dubai
      Visiting the Armani hotel is a study in slickness.However, the signature restaurant is so
      polished it ends up having soul. The oatmeal interiors are certainly a statement, but the
      Armani neutrals appear awesome, turning the palate cold. The food is as beige as the interiors –
      pastas are hand rolled and delectably fresh, but mains like monkfish are woefully
      under-seasoned and the burratta mozzarella starter is served cold."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Lobby Level - Armani Hotel Dubai, 1 Sheikh Mohammed bin Rashid Boulevard - United Arab Emirates"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Armani+%2F+Ristorante/@25.1982275,55.274894,17z/data=!4m5!1m2!2m1!1sArmani%2FRistorante+dubai!3m1!1s0x3e5f4281e9f11a23:0x82874fc8d3fd1f52")))]))])
                                                                            ))])])))
  ;-------------------------------------------- Dubai-Restaurant3 -----------------------------------------------
  (defn Dubai-r3_frame []
    (frame :title "Dubai's Best Chinese Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Royal China *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Berlin-r3.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Royal China has great food, good ambience and varied/unique dishes.
      Whether its soups, dimsums, or main dishes, food is done tastefully.
      The quality of service is good, but the staff could engage a bit better with the guest.
      A good place for a business meal! The Chinese restaurant's recently started its weekend
      brunch, meaning you get to indulge in a selection of the yummy and authentic fare they're
      known for on the best days of the week. Perfect place for dimsum.
      Great food, great service, & great atmosphere. Definitely one of my favorite restaurants.
      Authentic Chinese restaurant, located in the heart of DIFC Dubai,
      renowned for our dim sum and speciality teas,as well as our large private dining room."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "4L2-011 The Balcony, Precinct Bldg, 4 DIFC - United Arab Emirates"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Sticky+Fingers+BBQ/@-33.938187,18.468436,17z/data=!3m1!4b1!4m2!3m1!1s0x1dcc5d0488057d6b:0x2d805277d3bcceaa")))]))])
                                                                            ))])])))

  ;-------------------------------------------------- Dubai ------------------------------------------------------
  (defn Dubai_frame []
    (frame :title "Dubai Guide"
      :on-close :hide
      :size [640 :by 480]
      :content
      (scrollable(vertical-panel :items [
           (grid-panel :border "DUBAI'S TOP ATTRACTIONS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iDubai-A1.jpg" )))
                                 :south  (button_format (button :text "Dubai Mall"
                                               :listen [:action (fn [e](->(Dubai-A1_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iDubai-A2.jpg" )))
                                 :south  (button_format (button :text "Burj Al Arab"
                                               :listen [:action (fn [e](->(Dubai-A2_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iDubai-A3.jpg" )))
                                 :south  (button_format (button :text "Jumeirah Beach"
                                               :listen [:action (fn [e](->(Dubai-A3_frame) show!))])))])
           (grid-panel :border "DUBAI'S TOP HOTELS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iDubai-h1.png" )))
                                 :south  (button_format (button :text "Burj Al Arab"
                                               :listen [:action (fn [e](->(Dubai-h1_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iDubai-h2.png" )))
                                 :south  (button_format (button :text "Sofitel Dubai Downtown"
                                               :listen [:action (fn [e](->(Dubai-h2_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iDubai-h3.png" )))
                                 :south  (button_format (button :text "Atlantis The Palm"
                                               :listen [:action (fn [e](->(Dubai-h3_frame) show!))])))])
           (grid-panel :border "DUBAI'S TOP RESTAURANTS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iDubai-r1.jpg" )))
                                 :south  (button_format (button :text "JW’s Steakhouse"
                                               :listen [:action (fn [e](->(Dubai-r1_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iDubai-r2.jpg" )))
                                 :south  (button_format (button :text "Armani/Ristorante"
                                               :listen [:action (fn [e](->(Dubai-r2_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iDubai-r3.jpg")))
                                 :south  (button_format (button :text "Royal China"
                                               :listen [:action (fn [e](->(Dubai-r3_frame) show!))])))])
           (flow-panel :align :center :background :moccasin
             :items [(button_format (button :text "Generate a PDF report"
                                      :listen [:action (fn [e] (->(Dubai_Gen_PDF) show!))]))])]))))


  ;-------------------------------------------- Istanbul-Attraction1 -----------------------------------------------
  (defn Istanbul-A1_frame []
    (frame :title "Istanbul's 1st Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Hagia Sophia *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Istanbul-A1.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      The Hagia Sophia was once a house of worship that served several religions well over
      the centuries.It started out as a Greek Eastern Orthodox basilica that was home to the
      Patriarch of Constantinople when it was built in 537. For almost six decades in the 12th
      century it was a Roman Catholic Church. It became a mosque in 1453, remaining that way
      until 1931, when it was closed. It reopened as a museum in 1935. At one time, it was the
      largest cathedral in the world at one time, and served as the inspiration for other mosques,
      including the Blue Mosque, as it was such a great example of Byzantine architecture.It is
      most famous for its mosaics depicting various religious scenes."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Ayasofya Meydanı, Sultanahmet Fatih, Turkey"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Hagia+Sophia/@41.008583,28.980173,17z/data=!3m1!4b1!4m2!3m1!1s0x14cab9be92011c27:0x236e6f6f37444fae")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Istanbul-Attraction2 -----------------------------------------------
  (defn Istanbul-A2_frame []
    (frame :title "Istanbul's 2nd Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Blue Mosque *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Istanbul-A2.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      The Blue Mosque, built in the early 17th century, remains an active house of worship
      today. This means visitors need to time their visits carefully, as the mosque is closed
      to sightseers during the five daily prayer times for Muslims. All visitors must remove
      their shoes and women must cover their hair. This is a small price to pay for seeing its
      priceless treasures that include 20,000 ceramic tiles in various tulip designs and 200
      stained glass windows, all with intricate designs. The mosque, built by Sultan Ahmet,
      takes its name from the blue tiles on the dome and the upper levels of the interior."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Sultan Ahmet Mh., Torun Sk No:19, 34400 Istanbul, Turkey"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Boukoleon+Palace/@41.005963,28.975868,17z/data=!3m1!4b1!4m2!3m1!1s0x14cab9bd6570f4e1:0xe52df7368a157ca4")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Istanbul-Attraction3 -----------------------------------------------
  (defn Istanbul-A3_frame []
    (frame :title "Istanbul's 3rd Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Grand Bazaar *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Istanbul-A3.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Travelers who love to shop shouldn’t miss out on a visit to the Grand Bazaar,with 5,000
      shops making it one of the largest indoor marketplaces in the world.Receiving more than
      a quarter-million visitors a day, the bazaar features such items as jewelry, carpets that
      may or may not fly, spices, antiques and hand-painted ceramics. The bazaar dates back to
      1461 and today is home to two mosques,four fountains,two hammams or steam baths, and the
      Cevahir Bedesten, where the rarest and most valuable items have been found traditionally.
      Here is where shoppers will find old coins, jewelry with precious gems, inlaid weapons and
      antique furniture."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Beyazit/Istanbul, Turkey"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Grand+Bazaar/@41.010685,28.968068,17z/data=!3m1!4b1!4m2!3m1!1s0x14cab99162d70527:0x64c8680b5ac198ab")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Istanbul-Hotel1 -----------------------------------------------
  (defn Istanbul-h1_frame []
    (frame :title "Istanbul's 1st Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Best Western Premier Senator Hotel *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Istanbul-h1.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      4.5 out of 5 stars.This luxury hotel is located in Istanbul (Laleli), close to
      Sehzade Mosque, Suleymaniye Mosque, and Grand Bazaar. Also nearby are Hippodrome
      and Basilica Cistern.

      In addition to a restaurant, Best Western Premier Senator Hotel features a health
      club. Other amenities include a bar/lounge and a coffee shop/café.

      LCD televisions include premium satellite channels. Guestrooms also feature beds
      with Select Comfort mattresses, complimentary wireless Internet access, and
      complimentary high-speed (wired) Internet access."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Gencturk Cd. Sirvanizade Sk. No 5 Sehzadebasi,-Fatih Istanbul Istanbul 34470 Turkey 1-866-599-6674"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Istanbul+Hotels+Senator+Laleli+Istanbul,+istanbul+hotels/@41.012076,28.955014,17z/data=!3m1!4b1!4m2!3m1!1s0x14cab9884d2f8d85:0x532f77b3a13b09a")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Istanbul-Hotel2 -----------------------------------------------
  (defn Istanbul-h2_frame []
    (frame :title "Istanbul's 2nd Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** CVK Hotels & Resorts Park *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Istanbul-h2.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      5.0 out of 5 stars. This luxury hotel is located in Istanbul (Taksim), close
      to Ataturk Cultural Center, Taksim Square, and Dolmabahce Palace. Also nearby
      are Topkapi Palace and Suleymaniye Mosque.

      In addition to a restaurant, CVK Hotels & Resorts Park Bosphorus Istanbul
      features an indoor pool. Other amenities include a full-service spa and
      a bar/lounge.

      Flat-screen televisions include satellite channels. Guestrooms also feature
      deep soaking bathtubs, complimentary wireless Internet access, and air
      conditioning."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Gümüssuyu Mah. Inönü Cad. No:8 Istanbul Istanbul 34437 Turkey 1-866-599-6674"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/CVK+Hotels+%26+Resorts+Park+Bosphorus+Istanbul/@41.035442,28.987679,17z/data=!3m1!4b1!4m2!3m1!1s0x14cab764d31a18ad:0x9a6fe6bc4e9bd99f")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Istanbul-Hotel3 -----------------------------------------------
  (defn Istanbul-h3_frame []
    (frame :title "Istanbul's 3rd Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Elite World Business Hotel *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Istanbul-h3.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      5.0 out of 5 stars. This luxury hotel is located in Istanbul (Kucukcekmece),
      near the airport, Florya Beach, CNR Expo Center, and TurkuaZoo. Nearby
      attractions also include Menekse Beach.

      In addition to 3 restaurants, Elite World Business Hotel features an indoor
      pool. Other amenities include a full-service spa and a bar/lounge.

      In addition to cable television, guestrooms include jetted bathtubs,
      complimentary wireless Internet access, and high-speed (wired) Internet
      access (surcharge)."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Gültepe Mah. Sehit Zafer Kiziltas Sk. No: 1, Küçükçekmece Istanbul Istanbul Turkey 1-866-599-6674"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Jazz+Company/@41.040596,28.98357,17z/data=!3m1!4b1!4m2!3m1!1s0x14cab761487f0be5:0xde5eb1c88a8a983c")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Instanbul-Restaurant1 -----------------------------------------------
  (defn Istanbul-r1_frame []
    (frame :title "Istanbul's Best American Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Egg&Burger Diner Tesvikiye *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Istanbul-r1.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Egg&Burger is a local restaurant chain focused on Diner-Style burgers, hot dogs and homemade
      curly fries with 50's Diner-Style interior decorating. The menu offers a large variety of food,
      including salads, pastas, breakfast dishes and hamburgers. The breakfast and hamburger selections
      make you feel as if you are in America because there are options with bacon as well as ones for
      vegetarians. Egg&Burger offers eight different types of hamburgers. If you want good burger with
      a diner experience this is the place to go. It beats all of the so called burgerhouses in istanbul
      with its unique burgers and friendly service. Two thumbs up. Their branch in etiler also rocks.
      At 20 TL per cheeseburger, this place is pricing itself well beyond any diner we’ve been to and into
      the league of the boutique burger."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Teşvikiye Mh., Ahmet Fetgari Sk No:38, 34365 Teşvikiye, Turkey"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Egg%26Burger+Te%C5%9Fvikiye/@41.049194,28.995022,17z/data=!3m1!4b1!4m2!3m1!1s0x14cab70be9e3a10d:0x509e24447e5130ea")))]))])
                                                                            ))])])))
  ;-------------------------------------------- Istanbul-Restaurant2 -----------------------------------------------
  (defn Istanbul-r2_frame []
    (frame :title "Istanbul's Best Italian Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Faros Dine & Wine *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Istanbul-r2.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Faros Restaurant starts the day with open breakfast,
      launched at 07. 30 in the morning and goes on until 11.00 am.
      during weekdays, and until 12.00am on weekends. Delicious food-
      fried pizzas and home made pastas follow. Rendering service
      until 01.00 am every night, Faros Restaurant gives you a chance
      to taste savory examples of world cuisine. aros Bar, where you
      can listen to live DJ music on Thursday, Friday and Saturday,
      will become the focal point with its import drinks, rich local
      and import wine menu, and coctails prepared with special sauces.
      with a small walk from the aya sophia you can get to faros,
      in a busy street, sitting out- or inside The food is great ,
      quickly cooked and fast served Starter main course and
      coffee for 85 t lira Really something to try out "
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Cumhuriyet Caddesi, NO : 31 / A Taksim, 34437 Istanbul, Turkey"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Faros+Restaurant+Taksim/@41.04071,28.986159,17z/data=!3m1!4b1!4m2!3m1!1s0x14cab76fb6ebe5b5:0xa561a06055fc4ecd")))]))])
                                                                            ))])])))
  ;-------------------------------------------- Istanbul-Restaurant3 -----------------------------------------------
  (defn Istanbul-r3_frame []
    (frame :title "Istanbul's Best Chinese Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Çin Büfe *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Istanbul-r3.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      It's true. In Istanbul, if you feel like eating Chinese food,
      Çin Büfe is probably the only place to eat affordably.
      You can either eat-in or order to your place.
      When Çin Büfe first opened their doors in Beyoğlu,
      the food was better and the prices were much better.
      Still, If I am craving for Chinese food,
      Çin büfe is my only option considering the budget at that time.
      If not, Dragon is a good restaurant(used to be better).
      Very nice Chinese food in a nice area in the Taksim area.
      The food we had was good and came at a reasonable price.
      The staff was friendly.
      Only small minus are the chairs that do not really sit comfortably.
      Its usually crowded and may need a little bit of waiting
      for a proper seating at night but when you get a seat ,
      you are served fast with delicious , fresh food prepared by chinese chefs"


                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Kuloğlu Mh., Turnacıbaşı Cd No:6, 34420 İstanbul, Turkey"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/%C3%87in+B%C3%BCfe/@41.0340978,28.9788506,15z/data=!4m5!1m2!2m1!1zw4dpbiBCw7xmZQ!3m1!1s0x0000000000000000:0x8b2680edffed5870")))]))])
                                                                            ))])])))

  ;-------------------------------------------------- Istanbul ------------------------------------------------------

  (defn Istanbul_frame []
    (frame :title "Istanbul Guide"
      :on-close :hide
      :size [640 :by 480]
      :content
      (scrollable(vertical-panel :items [
           (grid-panel :border "ISTANBUL'S TOP ATTRACTIONS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iIstanbul-A1.jpg" )))
                                 :south  (button_format (button :text "Hagia Sophia"
                                               :listen [:action (fn [e](->(Istanbul-A1_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iIstanbul-A2.jpg")))
                                 :south  (button_format (button :text "Blue Mosque"
                                               :listen [:action (fn [e](->(Istanbul-A2_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iIstanbul-A3.jpg" )))
                                 :south  (button_format (button :text "Grand Bazaar"
                                               :listen [:action (fn [e](->(Istanbul-A3_frame) show!))])))])
           (grid-panel :border "ISTANBUL'S TOP HOTELS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iIstanbul-h1.png" )))
                                 :south  (button_format (button :text "Best Western Premier Senator Hotel"
                                               :listen [:action (fn [e](->(Istanbul-h1_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iIstanbul-h2.png")))
                                 :south  (button_format (button :text "CVK Hotels & Resorts Park"
                                               :listen [:action (fn [e](->(Istanbul-h2_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "Istanbul-h3.png" )))
                                 :south  (button_format (button :text "Elite World Business Hotel"
                                               :listen [:action (fn [e](->(Istanbul-h3_frame) show!))])))])
           (grid-panel :border "ISTANBUL'S TOP RESTAURANTS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iIstanbul-r1.jpg" )))
                                 :south  (button_format (button :text "Egg&Burger Diner Tesvikiye"
                                               :listen [:action (fn [e](->(Istanbul-r1_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iIstanbul-r2.jpg" )))
                                 :south  (button_format (button :text "Faros Dine & Wine"
                                               :listen [:action (fn [e](->(Istanbul-r2_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iIstanbul-r3.jpg")))
                                 :south  (button_format (button :text "Çin Büfe"
                                               :listen [:action (fn [e](->(Istanbul-r3_frame) show!))])))])
           (flow-panel :align :center :background :moccasin
             :items [(button_format (button :text "Generate a PDF report"
                                      :listen [:action (fn [e] (->(Istanbul_Gen_PDF) show!))]))])]))))


 ;-------------------------------------------- London-Attraction1 -----------------------------------------------
  (defn London-A1_frame []
    (frame :title "London's 1st Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Big Ben *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "London-A1.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      The 150 year old Big Ben Clock Tower is one of the top tourist attractions in London.
      The name Big Ben actually refers not to the clock tower itself, but to the 13 ton bell
      housed within the tower and takes its name from the man who first ordered the bell,
      Sir Benjamin Hall. The present-day Big Ben bell was constructed in 1858 after a first
      bell of 16 tons cracked irreparably two years prior. The clock has become a popular
      attraction and has appeared in many films. In the movie Mars Attacks! For example the
      Big Ben is destroyed by a UFO attack."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Westminster, London SW1A 0AA, United Kingdom "
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps?newwindow=1&um=1&ie=UTF-8&q=big+ben&fb=1&gl=us&hq=big+ben&cid=13226830714359798441&sa=X&ei=Z3WHVP14zfzJBKODgsAM&ved=0CC0QrwswAA")))]))])
                                                                            ))])])))

  ;-------------------------------------------- London-Attraction2 -----------------------------------------------
  (defn London-A2_frame []
    (frame :title "London's 2nd Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Buckingham Palace *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "London-A2.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Buckingham Palace is the main residence of Queen Elizabeth II although it is owned by
      the British state and is not the monarch’s personal property. The Forecourt of Buckingham
      Palace is used for Changing of the Guard, a major ceremony and tourist attraction. Between
      May and July the guard changes each morning and on alternate days the rest of the year.
      Since 1993, the palace’s state rooms have been open to the public during August and
      September."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "London SW1A 1AA, United Kingdom"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Buckingham+Palace/@51.501364,-0.14189,17z/data=!3m1!4b1!4m2!3m1!1s0x48760520cd5b5eb5:0xa26abf514d902a7")))]))])
                                                                            ))])])))

  ;-------------------------------------------- London-Attraction3 -----------------------------------------------
  (defn London-A3_frame []
    (frame :title "London's 3rd Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Trafalgar Square *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "London-A3.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Trafalgar Square is a large city square commemorating Lord Horatio Nelson’s victory
      against Napoleon’s navy at the Battle of Trafalgar in 1805. The central monument
      within the square is a single tall column on which the figure of Nelson stands gazing
      over London. His monument is surrounded by four colossal lions and a series of large
      fountains. Much more than just an open plaza, Trafalgar Square is one of the most famous
      city squares in the world and has become a social and political location for tourists
      and Londoners alike."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Trafalgar Square, Westminster, London WC2N 5DN, United Kingdom"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Trafalgar+Square/@51.508039,-0.128069,17z/data=!3m1!4b1!4m2!3m1!1s0x487604ce3941eb1f:0x1a5342fdf089c627")))]))])
                                                                            ))])])))

  ;-------------------------------------------- London-Hotel1 -----------------------------------------------
  (defn London-h1_frame []
    (frame :title "London's 1st Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Corinthia Hotel *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "London-h1.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      5.0 out of 5 stars. This luxury hotel is located in the heart of London, walking
      distance from Benjamin Franklin House, Trafalgar Square, and Nelson's Column.
      Also nearby are London Eye and Big Ben.

      At Corinthia Hotel London, recreational amenities include an indoor pool and a sauna.
      The hotel also features a full-service spa and a conference center.

      LCD televisions include premium satellite channels. Guestrooms also feature deep
      soaking bathtubs, complimentary wireless Internet access, and complimentary high-speed
      (wired) Internet access."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Whitehall Place London England SW1A 2BD United Kingdom 1-866-599-6674"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Corinthia+Hotel+London/@51.506547,-0.124233,17z/data=!3m1!4b1!4m2!3m1!1s0x487604cf2f3ad5d1:0xc6963432e9da1b49")))]))])
                                                                            ))])])))

  ;-------------------------------------------- London-Hotel2 -----------------------------------------------
  (defn London-h2_frame []
    (frame :title "London's 2nd Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Sloane Square Hotel *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "London-h2.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      4.0 out of 5 stars. This traditional London hotel is located in the London's city
      centre, 20 metres from Sloane Square Tube Station, 50 metres from trendy King's
      Road, and one mile from Harrods.

      Guests can enjoy a range of traditional French and classic British food at the
      informal Cote Brasserie, and ask the multilingual concierge service for help booking
      tours and tickets.

      Sloane Square Hotel's 102 guestrooms mix traditional architectural features with sleek,
      modern decor; all include free wired and wireless Internet access, satellite television,
      and minibars"
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "7-12 Sloane Square London England SW1 W8EG United Kingdom 1-866-599-6674"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Sloane+Square+Hotel/@51.4926555,-0.157368,17z/data=!4m5!1m2!2m1!1sSloane+Square+Hotel!3m1!1s0x487605161411113f:0x80206ae53c1f011e")))]))])
                                                                            ))])])))

  ;-------------------------------------------- London-Hotel3 -----------------------------------------------
  (defn London-h3_frame []
    (frame :title "London's 3rd Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** The Ritz *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "London-h3.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      5.0 out of 5 stars. This seven-story London hotel is centrally located in the
      West End near Hyde Park, 500 yards from Buckingham Palace, 3 blocks from
      Piccadilly Circus, and near the exclusive Knightsbridge area.

      Stately columns and Belle Époque decor exemplify this palatial hotel, which
      offers afternoon tea, formal dining room, Art-Deco bar, fitness center, and
      beauty salon.

      The Ritz London has 134 guestrooms furnished in Louis XVI style, with gilded
      details; amenities include heated towel racks, desks, complimentary wireless
      Internet access and satellite TV."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "150 Piccadilly London England W1J 9BR United Kingdom 1-866-599-6674"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/The+Ritz+London/@51.506945,-0.141578,17z/data=!3m1!4b1!4m2!3m1!1s0x48760529d30fc857:0x596135811e044014")))]))])
                                                                            ))])])))

  ;-------------------------------------------- London-Restaurant1 -----------------------------------------------
  (defn London-r1_frame []
    (frame :title "London's Best American Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Mash *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "London-r1.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Inspired by traditional American steakhouses, with all meat imported from the US, Uruguay,
      Australia and Denmark, there is ample choice on offer. Pair this with an extensive wine
      list produced by an award-winning sommelier and it is clear why the MASH experience is not
      one to be overlooked. The Pre & Post Theatre Menu comprises 3 courses for £25 or 2 for £22,
      including options of Caesar Salad, Charcuterie, Danish sirloin, side orders and a selection
      of desserts. The atmosphere is one of sophistication and refined selection, contained within
      architecturally historic and stunning surroundings.This 350 cover restaurant and bar is an
      exceptional dining choice when visiting London."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "77 Brewer St, London W1F 9ZN, United Kingdom"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/MASH+%28Modern+American+Steak+House%29/@51.511096,-0.136292,17z/data=!3m1!4b1!4m2!3m1!1s0x487604d4392e118d:0x5e4dfdd067ae0f27")))]))])
                                                                            ))])])))
  ;-------------------------------------------- London-Restaurant2 -----------------------------------------------
  (defn London-r2_frame []
    (frame :title "London's Best Italian Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Riccardo's Italian Restaurant *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "London-r2.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Riccardo’s restaurant is a godsend! I was recently put on a wheat-free diet and I
      didn’t think I’d ever be able to eat pasta outside my own kitchen again. Not so –
      Riccardo’s offers several truly delicious wheat-free versions of classic dishes
      alongside the regular kind (linguine vongole’s my favourite). The mint tea made
      with real mint leaves is fabulous too. But don’t get the impression that this is
      some kind of ‘holier than thou’ place for wearers of sandals and hair-shirts.
      All the food, wheat-free or not, is delicious and the atmosphere is pure Chelsea.
      Food incredibly tasty and very friendly staff. Small portions to the price though
      when compared to other Italian restaurants"
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "126 Fulham Rd, Chelsea, London SW3 6HU, United Kingdom"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Riccardo%27s/@51.489037,-0.176249,17z/data=!3m1!4b1!4m2!3m1!1s0x48760568a77c4161:0x351a4285b9c38fcf")))]))])
                                                                            ))])])))
  ;-------------------------------------------- London-Restaurant3 -----------------------------------------------
  (defn London-r3_frame []
    (frame :title "London's Best Chinese Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Maximini *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "London-r3.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Like shoe designing, whipping up a great dish is an art”, says Jimmy Choo who has
      ventured into the world of food with Maximini, an oriental restaurant near Hyde Park
      where the celebrity shoe smith is bringing a slice of his Malaysian home to Britain.
      As beautifully dressed as any of Jimmy’s A-list clients, Maximini is simplistic and chic
      with a hint of old fashioned colonial style which perfectly suits it’s fabulous Bayswater
      address Superb pre theatre dinner at a lovely venue with stylish décor and many smartly
      dressed individuals that come to dine here, think VIP diners! Food is absolutely amazing
      and very competitively priced for a restaurant of this class. Service is efficient and
      friendly.Top marks!!"
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "31-33 Sussex Pl, London W2 2TH, United Kingdom"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Maximini+Chinese+Restaurant/@51.513447,-0.171207,17z/data=!3m1!4b1!4m2!3m1!1s0x4876054c96bf0989:0xfa317710fcbf52b7")))]))])
                                                                            ))])])))

  ;--------------------------------------------------- London ------------------------------------------------------
  (defn London_frame []
    (frame :title "London Guide"
      :on-close :hide
      :size [640 :by 480]
      :content
      (scrollable(vertical-panel :items [
           (grid-panel :border "LONDON'S TOP ATTRACTIONS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iLondon-A1.jpg" )))
                                 :south  (button_format (button :text "Big Ben"
                                               :listen [:action (fn [e](->(London-A1_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iLondon-A2.jpg" )))
                                 :south  (button_format (button :text "Buckingham Palace"
                                               :listen [:action (fn [e](->(London-A2_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iLondon-A3.jpg" )))
                                 :south  (button_format (button :text "Trafalgar Square"
                                               :listen [:action (fn [e](->(London-A3_frame) show!))])))])
           (grid-panel :border "LONDON'S TOP HOTELS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iLondon-h1.png" )))
                                 :south  (button_format (button :text "Corinthia Hotel"
                                               :listen [:action (fn [e](->(London-h1_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iLondon-h2.png" )))
                                 :south  (button_format (button :text "Sloane Square Hotel"
                                               :listen [:action (fn [e](->(London-h2_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iLondon-h3.png" )))
                                 :south  (button_format (button :text "The Ritz"
                                               :listen [:action (fn [e](->(London-h3_frame) show!))])))])
           (grid-panel :border "LONDON'S TOP RESTAURANTS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iLondon-r1.jpg" )))
                                 :south  (button_format (button :text "Mash"
                                               :listen [:action (fn [e](->(London-r1_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iLondon-r2.jpg" )))
                                 :south  (button_format (button :text "Riccardo's Italian Restaurant "
                                               :listen [:action (fn [e](->(London-r2_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iLondon-r3.jpg" )))
                                 :south  (button_format (button :text "Maximini"
                                               :listen [:action (fn [e](->(London-r3_frame) show!))])))])
           (flow-panel :align :center :background :moccasin
             :items [(button_format (button :text "Generate a PDF report"
                                      :listen [:action (fn [e] (->(London_Gen_PDF) show!))]))])]))))


;-------------------------------------------- NewYork-Attraction1 -----------------------------------------------
  (defn NewYork-A1_frame []
    (frame :title "NweYork's 1st Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Statue of Liberty *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "NewYork-A1.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      The Statue of Liberty, a gift from France to the United States, has welcomed new arrivals
      to the shores of America for over a hundred years. Lady Liberty on her pedestal stands at
      an impressive 93 meters (305 feet), which visitors can climb for views of Brooklyn and
      Gustave Eiffel’s supportive framework. For those who choose not to climb the 154 steps to
      the crown, the pedestal offers panoramic views of the harbor and downtown New York City.
      Guided tours of Liberty Island are offered throughout the day by Park Rangers and a self
      -guided audio, offered in nine languages, tour is included with a ferry ticket to the
      island."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Liberty Island, New York, NY"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Statue+of+Liberty+National+Monument/@40.689249,-74.0445,17z/data=!3m1!4b1!4m2!3m1!1s0x89c25090129c363d:0x40c6a5770d25022b")))]))])
                                                                            ))])])))

  ;-------------------------------------------- NewYork-Attraction2 -----------------------------------------------
  (defn NewYork-A2_frame []
    (frame :title "NweYork's 2nd Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Central Park *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "NewYork-A2.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Located in the center of Manhattan, Central Park is a sprawling 840 acres and home to
      Belvedere Castle, the Central Park Zoo among many other attractions. For naturalists
      looking to take a break from the big city, relaxing in the Great Lawn or a walk along
      the extensive paths throughout the park can offer a much needed respite. There are also
      plenty of outdoor activities to entertain visitors including catch and release fishing
      at the Dana Discovery Center, rowboat rentals from the Loeb Boathouse. Central Park is
      also especially friendly for families with playgrounds and the Tisch Children’s Zoo."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Central Park, New York, NY"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Central+Park/@40.782865,-73.965355,17z/data=!3m1!4b1!4m2!3m1!1s0x89c2589a018531e3:0xb9df1f7387a94119")))]))])
                                                                            ))])])))


  ;-------------------------------------------- NewYork-Attraction3 -----------------------------------------------
  (defn NewYork-A3_frame []
    (frame :title "NweYork's 3rd Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Times Square *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "NewYork-A3.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      With over 39 million visitors annually, Times Square is the world’s most visited tourist
      attraction. The bright lights and big city feel of this commercial intersection have
      iconified this spot as “The Crossroad of the World.” Today, Times Square is a major center
      of the world’s entertainment industry. The annual New Year’s Eve ball drop, which began in
      1907, has been a staple of the square’s allure. The shopping, entertainment and plethora of
      restaurants offer many activities and options for every type of visitor. It’s an area not
      to be missed on a trip to New York City."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Manhattan, NY 10036"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Times+Square/@40.758895,-73.985131,17z/data=!3m1!4b1!4m2!3m1!1s0x89c25855c6480299:0x55194ec5a1ae072e")))]))])
                                                                            ))])])))

  ;-------------------------------------------- NewYork-Hotel1 -----------------------------------------------
  (defn NewYork-h1_frame []
    (frame :title "NweYork's 1st Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Westin New York at Times Square *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "NewYork-h1.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      4.0 out of 5 stars. Located in New York's Theater District, this glass tower
      rises between West 42nd and West 43rd streets, 1 block from the actual Times
      Square at Seventh and Broadway.

      Guests can dine at Shula's Steak House and No Name Bar, as well as socialize
      over cocktails and light fare in a street-view lounge. The Westin also features
      a fitness center and a business center.

      Nonsmoking guestrooms offer Westin's signature Heavenly Beds and Heavenly Baths,
      with bathrobes. Large desks with ergonomic chairs are equipped with two-line
      speakerphones and high-speed Internet connections."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "W 43rd Street New York NY 1-866-599-6674"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/The+Westin+New+York/@40.757682,-73.989089,17z/data=!3m1!4b1!4m2!3m1!1s0x89c25853631aea85:0xef5da1144aeb45a6")))]))])
                                                                            ))])])))

  ;-------------------------------------------- NewYork-Hotel2 -----------------------------------------------
  (defn NewYork-h2_frame []
    (frame :title "NweYork's 2nd Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** The New York Palace *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "NewYork-h2.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      4.5 out of 5 stars. Built in 1882 by railroad baron Henry Villard and luxuriously
      renovated in 2013, the grand entrance of this hotel is right across Madison Avenue
      from majestic St. Patrick's Cathedral.

      Guests can work out in a 7,000-square-foot health club with views of St. Patrick's.
      The hotel also features a full-service spa and 6 restaurants and bars, 2 of which
      are run by chef Michel Richard.

      Spacious guestrooms, some with views of the New York skyline or St. Patrick's,
      feature plasma TVs, full-size desks and high-speed Internet access. Marble baths
      come with plush robes."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Madison Ave New York NY 1-866-599-6674"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/The+New+York+Palace/@40.757972,-73.975241,17z/data=!3m1!4b1!4m2!3m1!1s0x89c25a74e318a9bb:0xfbfb87640a33679e")))]))])
                                                                            ))])])))

  ;-------------------------------------------- NewYork-Hotel3 -----------------------------------------------
  (defn NewYork-h3_frame []
    (frame :title "NweYork's 3rd Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Sheraton New York Times Square Hotel *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "NewYork-h3.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      4.0 out of 5 stars. Located in the heart of New York, this hotel is within
      walking distance of Ed Sullivan Theater, Rockefeller Center, and Radio City
      Music Hall. Also nearby are Broadway and Times Square.

      In addition to a restaurant, Sheraton New York Times Square Hotel features
      a health club. Other amenities include a bar/lounge and complimentary wireless
      Internet access.

      All guestrooms feature beds with pillowtop mattresses, wireless Internet access
      (surcharge), and air conditioning. Other amenities include climate control and
      video-game consoles."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "7th Ave New York NY 1-855-873-6559"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Sheraton+New+York+Times+Square+Hotel/@40.76275,-73.982214,17z/data=!3m1!4b1!4m2!3m1!1s0x89c258f88254f2c3:0xc307e150c50c51f7")))]))])
                                                                            ))])])))

  ;-------------------------------------------- NYC-Restaurant1 -----------------------------------------------
  (defn NYC-r1_frame []
    (frame :title "New York City's Best American Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Narcissa *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "NewYork-r1.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      It’s hard to believe that a few short years ago, meathead chefs ruled the day, pushing
      gout-baiting, nose-to-tail feasts and plundering pork-belly reserves into short supply.
      In those go-go times of beast worship, the seasonal-vegetable gospel played more humming
      background note than rip-roaring solo. That is, until a worldwide foraging craze made field
      pickings cool again and signature vegetable dishes became the new reputation makers.

      A veg-heavy menu that leaves you wishing you were vegetarian and had a stomach twice the size!
      Honestly one of the most delicious meals I've ever had. The food is light, playful, full of
      flavour and not overly complicated. The two salads were an incredibly mix of colours and flavours
      that all blended together to create mmms and aaahs. The jerk, rotisserie yams were other-worldly.
      We did venture to some meat for the main and that was just as great as the veg. Considering the
      quality of the food and service, the prices were fair."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "21 Cooper Square, New York, NY 10003"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Narcissa/@40.727884,-73.990768,17z/data=!3m1!4b1!4m2!3m1!1s0x89c2599b3d78615f:0xb5a0ff7a3749e99e")))]))])
                                                                            ))])])))
  ;-------------------------------------------- NYC-Restaurant2 -----------------------------------------------
  (defn NYC-r2_frame []
    (frame :title "New York City's Best Italian Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Torrisi Italian Specialties *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "NewYork-r2.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Dinner at Torrisi, you see, is quite unlike any other Italian experience in town.
      It’s even, perplexingly for some, quite unlike lunch, when the handsome,
      grocery-store-style shop (salamis in the window, Progresso bread crumbs on the shelves)
      traffics in credible counter-service chicken parm and Italian combo heros, plus hefty
      slabs of lasagne or eggplant parm. But then, at 6 p.m., the identity shifts, a culinary
      conversion that causes some confusion among potential customers dropping in for a turkey
      hero. Instead, they’re met with a chalkboard menu that lists the night’s prix fixe repast
      and a pyrotechnic kitchen with something to prove. At $45, dinner’s a tremendous bargain,
      and a serious delight.In the realm of red-sauce cooking, it’s nothing short of revolutionary.
"
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "250 Mulberry St, New York, NY 10012"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Torrisi+Italian+Specialties/@40.723096,-73.995658,17z/data=!3m1!4b1!4m2!3m1!1s0x89c2598f4453c07b:0x5fea31e9fd0c981e")))]))])
                                                                            ))])])))
  ;-------------------------------------------- NYC-Restaurant3 -----------------------------------------------
  (defn NYC-r3_frame []
    (frame :title "New York City's Best Chinese Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** China Restaurant *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "NewYork-r3.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Lunch specials include curry chicken, pork lo mein, mixed vegetables and Kung Pao
      chicken and are $4.95. Bump up to the $5.25 lunch specials for choices like General
      Tso's chicken, beef with broccoli and shrimp with lobster sauce. Dinner items include
      orange chicken for $8.25, Hunan shrimp for $8.95 and Mongolian beef for $8.25. Combination
      dinners offer a choice of egg flower soup, hot and sour soup, egg roll, crab Rangoon and a
      choice of pork fried rice, brown rice or steamed rice. Combination dinners include entrees
      like chicken chop suey, sesame chicken and shrimp broccoli. They start at $7.25.They have
      the best fried chicken garnish with scallions and hot sauce. The best fried chicken in Brooklyn!"
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "937 Utica Ave, Brooklyn, NY 11203"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/China+Restaurant/@40.650259,-73.929896,17z/data=!3m1!4b1!4m2!3m1!1s0x89c25c98ccbcc419:0x6013db168077c1eb")))]))])
                                                                            ))])])))

  ;-------------------------------------------------- NewYork ------------------------------------------------------
  (defn NewYork_frame []
    (frame :title "New York Guide"
      :on-close :hide
      :size [640 :by 480]
      :content
      (scrollable(vertical-panel :items [
           (grid-panel :border "NEW YORK'S TOP ATTRACTIONS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iNewYork-A1.jpg" )))
                                 :south  (button_format (button :text "Statue of Liberty"
                                               :listen [:action (fn [e](->(NewYork-A1_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iNewYork-A2.jpg" )))
                                 :south  (button_format (button :text "Central Park"
                                               :listen [:action (fn [e](->(NewYork-A2_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iNewYork-A3.jpg")))
                                 :south  (button_format (button :text "Times Square"
                                               :listen [:action (fn [e](->(NewYork-A3_frame) show!))])))])
            (grid-panel :border "NEW YORK'S TOP Hotels" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iNewYork-h1.png" )))
                                 :south  (button_format (button :text "Westin New York at Times Square"
                                               :listen [:action (fn [e](->(NewYork-h1_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iNewYork-h2.png" )))
                                 :south  (button_format (button :text "The New York Palace"
                                               :listen [:action (fn [e](->(NewYork-h2_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iNewYork-h3.png")))
                                 :south  (button_format (button :text "Sheraton New York Times Square Hotel"
                                               :listen [:action (fn [e](->(NewYork-h3_frame) show!))])))])
           (grid-panel :border "NEW YORK'S TOP RESTAURANTS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iNewYork-r1.jpg" )))
                                 :south  (button_format (button :text "Narcissa"
                                               :listen [:action (fn [e](->(NYC-r1_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iNewYork-r2.jpg" )))
                                 :south  (button_format (button :text "Torrisi Italian Specialties"
                                               :listen [:action (fn [e](->(NYC-r2_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iNewYork-r3.jpg" )))
                                 :south  (button_format (button :text "China Restaurant"
                                               :listen [:action (fn [e](->(NYC-r3_frame) show!))])))])
           (flow-panel :align :center :background :moccasin
             :items [(button_format (button :text "Generate a PDF report"
                                      :listen [:action (fn [e] (->(NewYork_Gen_PDF) show!))]))])]))))


;-------------------------------------------- Paris-Attraction1 -----------------------------------------------
  (defn Paris-A1_frame []
    (frame :title "Paris's 1st Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Eiffel Tower *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Paris-A1.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Visiting the iconic symbol of Paris usually ranks as the number one thing to do for
      most tourists. Towering more than 1,000 feet (300 meters) high in the Champ de Mars
      park, this iron structure was constructed for the 1889 World Exposition. One of the
      world’s most photographed tourist attractions, the Eiffel Tower presents an excellent
      photography opportunity for both day and night times. Visitors can ride the elevator
      to see incredible views of the city or dine in one of the two fine restaurants that
      are situated within the tower."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Champ de Mars, 5 Anatole France Ave, 75007 Paris, France"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Eiffel+Tower/@48.85837,2.294481,17z/data=!3m1!4b1!4m2!3m1!1s0x47e66e2964e34e2d:0x8ddca9ee380ef7e0")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Paris-Attraction2 -----------------------------------------------
  (defn Paris-A2_frame []
    (frame :title "Paris's 2nd Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Louvre *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Paris-A2.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Topping the list of the world’s most visited museums, the Louvre Museum is located
      in the Louvre Palace with its signature glass pyramid marking its entrance. Housing
      a collection of more than 1 million objects, the Louvre boasts some of the world’s
      most famous art works such as Leonardo da Vinci’s “Mona Lisa,” Michelangelo’s “Dying
      Slave” and the Greek statue, “Venus of Milo.” Other popular exhibits include the
      extravagant apartments of Napoleon III, the ancient Code of Hammurabi, Egyptian
      antiquities and paintings by masters like Rembrandt and Rubens."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "75001 Paris, France"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Louvre+Museum/@48.860611,2.337644,17z/data=!3m1!4b1!4m2!3m1!1s0x47e671d877937b0f:0xb975fcfa192f84d4")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Paris-Attraction3 -----------------------------------------------
  (defn Paris-A3_frame []
    (frame :title "Paris's 3rd Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Notre Dame de Paris *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Paris-A3.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      No trip to Paris could be complete without a visit to the world famous Notre Dame
      cathedral. Standing more than 400 feet (120 meters) high with two lofty towers and
      a spire, this marvelous church is considered a supreme example of French Gothic
      architecture. A tour of this 13th century masterpiece allows visitors to admire the
      awe-inspiring rose windows, Gothic carvings, beautiful sculptures and a collection
      of relics."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "6 Parvis Notre-Dame - Place Jean-Paul II, 75004 Paris, France"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Cath%C3%A9drale+Notre-Dame+de+Paris/@48.852968,2.349902,17z/data=!3m1!4b1!4m2!3m1!1s0x47e671e19ff53a01:0x36401da7abfa068d")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Paris-Hotel1 -----------------------------------------------
  (defn Paris-h1_frame []
    (frame :title "Paris's 1st Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** ELa Maison Favart *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Paris-h1.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      4.0 out of 5 stars. Located in the heart of Paris, this hotel is within walking
      distance of Grevin Museum, place Vendome, the department stores and Paris Opera.
      The hotel is in front of The Opera Comic.

      Recreational amenities at La Maison Favart include a sauna, a relaxing pool
      (not a swimming pool) and a fitness facility. We offer you a high-speed (wired)
      Internet access and wireless Internet acces, both free

      In addition to flat-panel televisions with satellite channels, guestrooms include
      iPod docking stations. Bathrooms come with rainfall showerheads and makeup/shaving
      mirrors."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "5 Rue Marivaux Paris Paris 75002 France 1-866-599-6674"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/ADER-Nordmann/@48.8708068,2.337422,17z/data=!4m5!1m2!2m1!1sELa+Maison+Favart!3m1!1s0x47e66e3963e26a93:0x5798500ceeb1fefa")))]))])
                                                                            ))])])))
  ;-------------------------------------------- Paris-Hotel2 -----------------------------------------------
  (defn Paris-h2_frame []
    (frame :title "Paris's 2nd Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** L'Hotel du Collectionneur Arc de Triomphe *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Paris-h2.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      5.0 out of 5 stars. A modern seven-storey Paris hotel inspired by the Art Deco
      style, overlooking Parc de Monceau, one kilometre from the Champs-Élysées.

      Hotel guests can work out with personal trainers and unwind with a hydrotonic
      bath, a massage and a range of beauty treatments.

      Hotel du Collectionneur Arc de Triomphe Paris guestrooms feature 1930s-influenced
      decor and come equipped with high-speed Internet, minibars and air conditioning."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "51-57 rue de Courcelles Paris Paris 75008 France 1-866-599-6674"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/L%27Hotel+du+Collectionneur/@48.876886,2.306834,17z/data=!3m1!4b1!4m2!3m1!1s0x47e66f93eb0d3fbb:0x6437240b3623044a")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Paris-Hotel3 -----------------------------------------------
  (defn Paris-h3_frame []
    (frame :title "Paris's 3rd Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Hôtel du Louvre, a Hyatt hotel *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Paris-h3.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      5.0 out of 5 stars. Situated in the heart of the Paris, between the Louvre Museum,
      the Opera Garnier and the Palais Royal. Place de la Concorde, Notre-Dame Cathedral
      and shopping district are a few steps away.

      This 5-star hotel features free services as wireless, fitness room, and golden keys
      concierges.

      Sleep comes easy in soundproof guestrooms with 2 sets of double-glazed windows. All
      Hotel du Louvre rooms feature views of the inner courtyard or boulevards facing the
      historical monuments."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Place Andre Malraux Paris Paris 75001 France 1-855-296-5764"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/H%C3%B4tel+du+Louvre/@48.862932,2.335712,17z/data=!3m1!4b1!4m2!3m1!1s0x47e66e25b96e9151:0xb432bd0d55ee337d")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Paris-Restaurant1 -----------------------------------------------
  (defn Paris-r1_frame []
    (frame :title "Paris's Best American Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Breakfast in America *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Paris-r1.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      It doesn’t get more literal than this.Breakfast in America is a staple in the expat world
      here in Paris. The little breakfast restaurant with toasters on the tables, a cozy, yet hopping
      atmosphere that makes you feel like you’re in a diner in Brooklyn. They’ve got delicious burgers,
      impeccable breakfast and heaps of delicious syrup. Breakfast is served all day long, from 8:30am
      to 11:00pm. Pancakes and French toast were very good. Service was also very friendly. An American
      Diner in Paris - it comes close, and is pretty successful, but the prices don't really match the
      quantity or quality of the food. The queue gets big quickly and the place is clearly frequented
      by regulars. A good place for a breakfast."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "4 Rue Malher, 75004 Paris, France"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Breakfast+in+America/@48.847754,2.351112,17z/data=!3m1!4b1!4m2!3m1!1s0x47e671dde992f573:0xf09bbf7ad6454c85")))]))])
                                                                            ))])])))
  ;-------------------------------------------- Paris-Restaurant2 -----------------------------------------------
  (defn Paris-r2_frame []
    (frame :title "Paris's Best Italian Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Ristorante Al Caratello *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Paris-r2.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Recommended place its close to sacre cour and likes a hidden treasure..
      We ordered pizza,lasagna and ravioli..All was delicious...dont hesitate to go...
      Wonderful pizza and pasta, very reasonable prices and wonderful, very good looking
      service,Food (had pasta and gnocchi),wine,staff, atmosphere inside are all perfect.
      Prices are very good, around 12e for normal meal. mazing food and impressive starter
      salads as well! Rigatoni Arrabbiata was truly spectacular, the sauce was exceptional
      and the pasta was perfectly al dente. Fusilli in pesto cheese and cream was also wonderful.
      Veal Saltimbocca was very good, not classic roman style, but very good, and the veal was
      cooked perfectly. "
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "5 Rue Audran, 75018 Paris, France"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Al+Caratello/@48.885231,2.335896,17z/data=!3m1!4b1!4m2!3m1!1s0x47e66e4560e33a3f:0x40f3c95c95e0f35d")))]))])
                                                                            ))])])))
  ;-------------------------------------------- Paris-Restaurant3 -----------------------------------------------
  (defn Paris-r3_frame []
    (frame :title "Paris's Best Chinese Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Chez Vong  *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Paris-r3.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      At 'Chez Vong', you'll appreciate dozens of meals from Cantonese and Vietnamese gastronomic
      traditions, classics but executed with talent. A perfect example of architectural integration:
      In the rooms of this old neighborhood house of the Halles, the original stones live with the
      Buddhas and bamboos in a quite unrealistic atmosphere. Great: food and service. Owner still in
      kitchen since more than twenty years, and still in search of perfection. Decor a little bit Dysney,
      but clean. Smoke and Mirrors at the entrance (literally!) make for the perfect unsuspecting tourist
      heist. The venue is absent of local Parisians and sporadically frequented by innocent tourists
      misguided by the dazzling pictures and decor of a Chinese temple which can not and should not have
      anything to do with cuisine. "
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "10 Rue de la Grande Truanderie, 75001 Paris, France"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Chez+Vong/@48.86279,2.349202,17z/data=!3m1!4b1!4m2!3m1!1s0x47e66e19134dcee9:0x93d4783667d7d640")))]))])
                                                                            ))])])))

  ;--------------------------------------------------- Paris ------------------------------------------------------
  (defn Paris_frame []
    (frame :title "Paris Guide"
      :on-close :hide
      :size [640 :by 480]
      :content
      (scrollable(vertical-panel :items [
           (grid-panel :border "PARIS'S TOP ATTRACTIONS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iParis-A1.jpg" )))
                                 :south  (button_format (button :text "Eiffel Tower"
                                               :listen [:action (fn [e](->(Paris-A1_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iParis-A2.jpg" )))
                                 :south  (button_format (button :text "Louvre"
                                               :listen [:action (fn [e](->(Paris-A2_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iParis-A3.jpg" )))
                                 :south  (button_format (button :text "Notre Dame de Paris"
                                               :listen [:action (fn [e](->(Paris-A3_frame) show!))])))])
           (grid-panel :border "PARIS'S TOP HOTELS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iParis-h1.png" )))
                                 :south  (button_format (button :text "La Maison Favart"
                                               :listen [:action (fn [e](->(Paris-h1_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iParis-h2.png" )))
                                 :south  (button_format (button :text "L'Hotel du Collectionneur Arc de Triomphe"
                                               :listen [:action (fn [e](->(Paris-h2_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iParis-h3.png" )))
                                 :south  (button_format (button :text "Hôtel du Louvre, a Hyatt hotel"
                                               :listen [:action (fn [e](->(Paris-h3_frame) show!))])))])
           (grid-panel :border "PARIS'S TOP RESTAURANTS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iParis-r1.jpg" )))
                                 :south  (button_format (button :text "Breakfast in America"
                                               :listen [:action (fn [e](->(Paris-r1_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iParis-r2.jpg" )))
                                 :south  (button_format (button :text "Ristorante Al Caratello"
                                               :listen [:action (fn [e](->(Paris-r2_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iParis-r3.jpg" )))
                                 :south  (button_format (button :text "Chez Vong"
                                               :listen [:action (fn [e](->(Paris-r3_frame) show!))])))])
           (flow-panel :align :center :background :moccasin
             :items [(button_format (button :text "Generate a PDF report"
                                      :listen [:action (fn [e] (->(Paris_Gen_PDF) show!))]))])]))))


;-------------------------------------------- Rome-Attraction1 -----------------------------------------------
  (defn Rome-A1_frame []
    (frame :title "Rome's 1st Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Colosseum *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Rome-A1.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      The Colosseum is the largest and most famous amphitheater in the Roman world.
      Its construction was started by Emperor Vespasian of the Flavian dynasty in 72
      AD and was finished by his son Titus in 80 AD. The Colosseum was capable of
      holding some 50,000 spectators who could enter the building through no less
      than 80 entrances. The Colosseum today is a major tourist attraction in Rome
      with thousands of tourists paying to view, what is left of, the interior arena."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Piazza del Colosseo, 1, 00184 Rome, Italy"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Colosseum/@41.89021,12.492231,17z/data=!3m1!4b1!4m2!3m1!1s0x132f61b6532013ad:0x28f1c82e908503c4")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Rome-Attraction2 -----------------------------------------------
  (defn Rome-A2_frame []
    (frame :title "Rome's 2nd Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** St. Peter's Basilica *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Rome-A2.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      The center of the Catholic world and a major tourist attraction, the Basilica of St.
      Peter is a huge church: with an interior height of 120m, the space shuttle, together
      with its booster rockets, could fit inside, as could the Statue of Liberty. The basilica
      stands on the traditional site where Peter, the apostle who is considered the first pope,
      was crucified and buried. Construction on the current building began in 1506 and was
      completed in 1615. Many famous artists worked on the complex and its surroundings:
      Michelangelo designed the dome while Bernini designed the great St. Peter’s Square."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Piazza San Pietro, 00120 Vatican City"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/St.+Peter%27s+Basilica/@41.902167,12.453937,17z/data=!3m1!4b1!4m2!3m1!1s0x132f6061b7149b59:0x724bf077cd875283")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Rome-Attraction3 -----------------------------------------------
  (defn Rome-A3_frame []
    (frame :title "Rome's 3rd Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Trevi Fountain *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Rome-A3.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Completed in 1762 to a design by Nicola Salvi, this world famous Baroque fountain features
      a mythological sculptural composition of Neptune, god of the sea, flanked by two Tritons.
      The location of the Trevi fountain marks the terminus of the ancient Aqua Virgo aqueduct
      and is so named on account of its position at the junction of three roads (tre vie). The
      fountain was the setting for an iconic scene in Fellini’s film Dolce Vita starring Anita
      Ekberg and Marcello Mastroianni. Since then, it has become one of the most popular Rome
      tourist attractions. The legend says that one who throws a coin in the fountain shall one
      day return to Rome."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Piazza di Trevi, 00187 Rome, Italy"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Trevi+Fountain/@41.900932,12.483313,17z/data=!3m1!4b1!4m2!3m1!1s0x132f6053278340d5:0xf676f1e1cc02bbb6")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Rome-Hotel1 -----------------------------------------------
  (defn Rome-h1_frame []
    (frame :title "Rome's 1st Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Hotel Majestic *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Rome-h1.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      5.0 out of 5 stars. The neoclassical Hotel Majestic is located less than 1 km
      (0.6 mi) from the Borghese Art Gallery, Villa Borghese gardens, Trevi Fountain,
      and the Spanish Steps.

      Offering panoramic views of the Via Veneto and nearby Villa Borghese park, the
      Hotel Majestic's 2 terraces tempt guests with Sicilian cuisine and cocktails.

      Individually decorated with a balance between modern and traditional styles,
      climate-controlled guestrooms overlook Via Veneto or St Isidore convent's garden."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Via Vittorio Veneto 50 Rome RM 00187 Italy 1-866-599-6674"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Hotel+Majestic/@41.905568,12.48791,17z/data=!3m1!4b1!4m2!3m1!1s0x132f61aa39231605:0x9d92b204c5cb631b")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Rome-Hotel2 -----------------------------------------------
  (defn Rome-h2_frame []
    (frame :title "Rome's 2nd Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Boscolo Exedra Roma, Autograph Collection *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Rome-h2.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      5.0 out of 5 stars. A regal showcase of Neo Classical architecture, this Rome
      hotel is located directly on the Piazza della Repubblica across from the
      Repubblica Metro station.

      The bubbly flows over ancient ruins, while other modern offerings include a
      business center, concierge, rooftop pool, garden, and ground-floor bistro.

      The guestrooms of the Exedra, A Boscolo Luxury Hotel has high ceilings which
      top an infusion of floral-brocades, crocodile leathers and marble; all have
      minibars."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Piazza Della Republica 47 Rome RM 00185 Italy 1-866-599-6674"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Boscolo+Exedra+Roma/@41.902174,12.496082,17z/data=!4m5!1m2!2m1!1sBoscolo+Exedra+Roma,+Autograph+Collection!3m1!1s0x132f61a610627b95:0x433ffb871d795592")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Rome-Hotel3 -----------------------------------------------
  (defn Rome-h3_frame []
    (frame :title "Rome's 3rd Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Ambasciatori Palace Hotel *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Rome-h3.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      5.0 out of 5 stars. Set on one of the most well-known streets in the world, Via
      Veneto, the Ambasciatori Palace Hotel is an elegant choice for those wishing to
      truly experience La Dolce Vita in Rome.

      The Embassy bar stays open until late and is the ideal place in which to enjoy
      cocktails and drinks.At the restaurant 'La Terrazza' you can also taste our
      special menu for celiacs.

      The elegantly furnished and upholstered 152 rooms have all comforts. There are
      many special touches such as marble fireplaces, Murano lamps and period furnishings."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Via V. Veneto 62 Rome RM 00187 Italy 1-866-599-6674"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Ambasciatori/@41.906322,12.489686,17z/data=!3m1!4b1!4m2!3m1!1s0x132f61a9f5efe433:0xbdbcb379bd2cf0f5")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Rome-Restaurant1 -----------------------------------------------
  (defn Rome-r1_frame []
    (frame :title "Rome's Best American Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** L'Hamburgeria di Eataly *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Rome-r1.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Newly opened in Rome by the folks who developed Eataly, after the success of their
      burger joints in Turin, Bergamo and Rende, the restaurant boasts organic ingredients
      including Slow Food-approved beef from La Granda in Piedmont, bread made from stone-ground
      flour and sauces from Cereal Terra. The burgers are Italian-style— pancetto in place of bacon,
      good Italian cheeses, extra virgin olive oil. A few miles up the ladder from a Big Mac.

      They offer artiginal beers to wash down your burgers and gelato to top off the meal. Free WiFi,
      a space to entertain the kids. If you are in the mood for a burger or chicken sandwich, pick this
      place over McDonalds or Burger King. The food is good, sort of an Italian twist to American fast food. "
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Via Vittorio Veneto, 11, 00187 Roma, Italy"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Hamburgheria+Di+Eataly/@45.137131,7.768802,17z/data=!3m1!4b1!4m2!3m1!1s0x4788710f12332147:0x4e06b163979cb36e")))]))])
                                                                            ))])])))
  ;-------------------------------------------- Rome-Restaurant2 -----------------------------------------------
  (defn Rome-r2_frame []
    (frame :title "Rome's Best Italian Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "*****  Ditirambo *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Rome-r2.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Don't let the country-kitchen ambience fool you. At this little spot off Campo de' Fiori,
      the constantly changing selection of offbeat takes on Italian classics is a step beyond
      ordinary Roman fare. Antipasti can be delicious and unexpected, like Gorgonzola-pear soufflé
      drizzled with aged balsamic vinegar, or a mille-feuille of mozzarella, sundried tomatoes, and
      fresh mint. But people really love this place for rustic dishes like roast lamb, suckling pig,
      and hearty pasta. Great joy of traveling is finding a restaurant where you feel at home,
      comfortable to enjoy a leisurely meal, and confident enough to ask the server to choose for you.
      Such a place is Ditirambo. We have eaten 3 lunches in a row, so we could have favorites again and
      try something new. The pastas are flawless. We really enjoyed the steak and lamb."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Piazza della Cancelleria, 74-75, 00186 Roma RM, Italy"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Ditirambo/@41.896392,12.472353,17z/data=!3m1!4b1!4m2!3m1!1s0x132f6045864851bb:0x404eb1e28aa82437")))]))])
                                                                            ))])])))
  ;-------------------------------------------- Rome-Restaurant3 -----------------------------------------------
  (defn Rome-r3_frame []
    (frame :title "Rome's Best Chinese Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Green T *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Rome-r3.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      It’s unusual to find good Chinese food in Rome, and this five-room feng shui-designed restaurant
      is something entirely different: a tearoom and boutique,serving street food, meat and fish dishes,
      as well as a selection of sushi and dim sum. Save money at lunch by opting for one of the daily
      fixed-price menus.The place is small and really nice, the few tables they have are spread over 3
      small floors so you will feel private even when the place is fully packed. The food is simply
      delicious!

      I don't know if the chef is Chinese, but it tastes like a Europeanized vision of Chinese
      cuisine. You won't have much of soaked sweet and sour dishes here and the menu is unusually
      small for the Chinese place. The wonton soup was just amazing"
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Via del Piè di Marmo, 28, 00186 Roma, Italy"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Green+T/@41.897587,12.47922,17z/data=!3m1!4b1!4m2!3m1!1s0x132f604de964e559:0x222ec564d7881050")))]))])
                                                                            ))])])))

  ;--------------------------------------------------- Rome ------------------------------------------------------
  (defn Rome_frame []
    (frame :title "Rome Guide"
      :on-close :hide
      :size [640 :by 480]
      :content
      (scrollable(vertical-panel :items [
           (grid-panel :border "ROME'S TOP ATTRACTIONS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iRome-A1.jpg")))
                                 :south  (button_format (button :text "Colosseum"
                                               :listen [:action (fn [e](->(Rome-A1_frame) show!))])))
                               (border-panel :vgap 3  :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iRome-A2.jpg" )))
                                 :south  (button_format (button :text "St. Peter's Basilica"
                                               :listen [:action (fn [e](->(Rome-A2_frame) show!))])))
                               (border-panel :vgap 3  :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iRome-A3.jpg" )))
                                 :south  (button_format (button :text "Trevi Fountain"
                                               :listen [:action (fn [e](->(Rome-A3_frame) show!))])))])
           (grid-panel :border "ROME'S TOP HOTELS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iRome-h1.png")))
                                 :south  (button_format (button :text "Hotel Majestic"
                                               :listen [:action (fn [e](->(Rome-h1_frame) show!))])))
                               (border-panel :vgap 3  :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iRome-h2.png" )))
                                 :south  (button_format (button :text "Boscolo Exedra Roma"
                                               :listen [:action (fn [e](->(Rome-h2_frame) show!))])))
                               (border-panel :vgap 3  :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iRome-h3.png" )))
                                 :south  (button_format (button :text "Ambasciatori Palace Hotel"
                                                :listen [:action (fn [e](->(Rome-h3_frame) show!))])))])
           (grid-panel :border "ROME'S TOP RESTAURANTS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iRome-r1.jpg")))
                                 :south  (button_format (button :text "L'Hamburgeria di Eataly"
                                               :listen [:action (fn [e](->(Rome-r1_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iRome-r2.jpg" )))
                                 :south  (button_format (button :text "Ditirambo"
                                               :listen [:action (fn [e](->(Rome-r2_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iRome-r3.jpg" )))
                                 :south  (button_format (button :text "Green T"
                                               :listen [:action (fn [e](->(Rome-r3_frame) show!))])))])
           (flow-panel :align :center :background :moccasin
             :items [(button_format (button :text "Generate a PDF report"
                                      :listen [:action (fn [e] (->(Rome_Gen_PDF) show!))]))])]))))


;-------------------------------------------- Shanghai-Attraction1 -----------------------------------------------
  (defn Shanghai-A1_frame []
    (frame :title "Shanghai's 1st Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Pudong Skyline *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Shanghai-A1.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Pudong is a district in Shanghai on the eastern side of the Huangpu River that has
      emerged as China’s financial and commercial hub. A skyline of gleaming skyscrapers
      rises out of what was mere farmland only 20 years ago. Skyscrapers includes the
      symbolic Oriental Pearl Tower, the Shanghai World Financial Center, the Jin Mao
      Building and the Shanghai Tower that should be finished in 2014."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "China, Shanghai, Pudong, Xuehai Rd"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/search/Pudong+Skyline/@31.0859427,121.728029,10z/data=!3m1!4b1")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Shanghai-Attraction2 -----------------------------------------------
  (defn Shanghai-A2_frame []
    (frame :title "Shanghai's 2nd Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Shanghai Exhibition Center *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Shanghai-A2.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Housed in a modern five-story building, The Shanghai Urban Planning Exhibition Center
      displays Shanghai’s urban planning and development. The centerpiece of the exhibition
      is a huge scale model of the city of Shanghai as it will look in 2020. The clear plastic
      models indicate structures yet to be built, and there are many of them. Visitors can
      view the miniature city from alongside or ascend to a gallery running around it for
      views from above."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Nanjing West Rd, Jing'an, Shanghai, China"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Shanghai+Exhibition+Center/@31.225728,121.451557,17z/data=!3m1!4b1!4m2!3m1!1s0x35b2700483ba8673:0x4252d2da75c4a8c8")))]))])
                                                                            ))])])))


  ;-------------------------------------------- Shanghai-Attraction3 -----------------------------------------------
  (defn Shanghai-A3_frame []
    (frame :title "Shanghai's 3rd Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Shanghai World Financial Center *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Shanghai-A3.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Located in Pudong, Shanghai, the Shanghai World Financial Center is a mixed use
      skyscraper which consists of offices, hotels, conference rooms, observation decks,
      and shopping malls. The Park Hyatt Shanghai Hotel contains 174 rooms and suites.
      In 2007 the skyscraper was topped out at 492 meters (1,614.2 ft) and became the
      tallest structure in the China, including Hong Kong.

      The most distinctive feature in the design of the building is the hole at the top.
      The original circular design received protests from some Chinese who considered it
      too similar to the rising sun of the Japanese flag. An alternative design replaced
      the circle with a trapezoidal hole, which, according to some, makes the building look
      like a giant bottle opener."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "100 Century Ave, Pudong, Shanghai, China"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Shanghai+World+Financial+Center/@31.234564,121.507439,17z/data=!3m1!4b1!4m2!3m1!1s0x35b270e5c4dae7c1:0x20049ba69e14a93b")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Shanghai-Hotel1 -----------------------------------------------
  (defn Shanghai-h1_frame []
    (frame :title "Shanghai's 1st Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Regal Shanghai East Asia Hotel *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Shanghai-h1.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      4.0 out of 5 stars. Set in the Xu Jia Hui commercial district, this Shanghai
      Stadium hotel is 15 minutes from the Heng Shan Road entertainment area and
      downtown, walking distance to the Metro station, and convenient to Shanghai's
      industrial zones.

      A 661-square-meter (7,114-square-foot) conference hall is complemented by a
      full business center. Wireless Internet access covers the conference rooms,
      restaurants, and all other public areas; a pool, spa tub, and fitness center
      are also on site.

      Both wireless and wired high-speed Internet access are available in the guest
      rooms, which, owing to the circular shape of the stadium into which they are
      built, vary in size and outlook."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "800 Ling Ling Road Shanghai Shanghai 200030 China 1-866-599-6674"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Regal+Shanghai+East+Asia+Hotel/@31.180199,121.439305,17z/data=!3m1!4b1!4m2!3m1!1s0x35b26528f54dfe8d:0xcbdd4a4181ab8f82")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Shanghai-Hotel2 -----------------------------------------------
  (defn Shanghai-h2_frame []
    (frame :title "Shanghai's 2nd Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Grand Kempinski Hotel  *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Shanghai-h2.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      5.0 out of 5 stars. This luxury hotel is located in Shanghai (Lujiazui), close
      to Shanghai Ocean Aquarium, Oriental Pearl Tower, and Jin Mao Tower. Also
      nearby are The Bund and Pudong Riverside Promenade and Park.

      Recreational amenities at Grand Kempinski Hotel Shanghai include an indoor pool
      and a health club. Other amenities include a full-service spa and a poolside bar.

      LCD televisions include premium satellite channels. Guestrooms also feature deep
      soaking bathtubs, iPod docking stations, and sofa beds."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "1288 Lujiazui Ring Road Shanghai Shanghai 200120 China 1-866-599-6674"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Grand+Kempinski+Hotel+Shanghai/@31.242588,121.504132,17z/data=!3m1!4b1!4m2!3m1!1s0x35b270e2e7a7cc8f:0x2325021234ae8e72")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Shanghai-Hotel3 -----------------------------------------------
  (defn Shanghai-h3_frame []
    (frame :title "Shanghai's 3rd Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Grand Hyatt *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Shanghai-h3.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      5.0 out of 5 stars. This luxury hotel is located in the heart of Shanghai, steps
      from Shanghai World Financial Center and Jin Mao Tower. Also nearby are Oriental
      Pearl Tower and The Bund.

      In addition to 7 restaurants, Grand Hyatt Shanghai features an indoor pool. Other
      amenities include a full-service spa and a bar/lounge.

      Televisions come with premium cable channels. Guestrooms also feature air conditioning,
      climate control, and premium bedding."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "88 Century Avenue Pudong New Area Shanghai Shanghai 200121 China 1-855-296-5764"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Grand+Hyatt+Shanghai/@31.235433,121.505817,17z/data=!3m1!4b1!4m2!3m1!1s0x342736b8d7f72181:0x5436064fbfa9784")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Shanghai-Restaurant1 -----------------------------------------------
  (defn Shanghai-r1_frame []
    (frame :title "Shanghai's Best American Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Malone's *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Shanghai-r1.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Specialties: Malone's is an old American cafe in Shanghai. Its big hamburger is the
      signature dish. Besides having delicious food, diners can also play darts, billiards
      or watch televised sports games in the restaurant. Great place for western food. Better
      than moat sports bars in the US. Live music every night.

      Good food and drink specials. Fun atmosphere.Described as an 'American Cafe', Malone's
      is home to the most extensive burger menu in the city. Smack in the middle of Tongren Lu
      just around the corner from the Shanghai Center, Malone's is usually packed with expats
      and the out of town business crowd. "
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "255 Tongren Rd, Jing'an, Shanghai, China"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Malong+Meishi+Pub/@31.226322,121.44982,14z/data=!4m5!1m2!2m1!1smalone%27s+shanghai!3m1!1s0x35b270030d0e76b1:0x26e9d65df8a47f24")))]))])
                                                                            ))])])))
  ;-------------------------------------------- Shanghai-Restaurant2 -----------------------------------------------
  (defn Shanghai-r2_frame []
    (frame :title "Shanghai's Best Italian Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Da Marco *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Shanghai-r2.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      The bright and cheery palette of citrus hues welcomes you before even taking a seat in this
      comfortable and classic restaurant. Decadent desserts, plentiful pastas, pizzas, carne and
      gnocchi galore will make for a bella noche in jovial, convivial surroundings.Set lunches are
      also available. Good food, good service, good bread, good ambiance; da Marco has all the bases
      covered at a reasonable price! if you're lucky, you get to wait and get free champagne! Great
      place, busy and hopping.

      Lovely food.Da Marco is a perennial expat favorite for Italian.
      Its simple formula -- inexpensive, decent Italian -- has kept this, its original location, going
      for years. The menu is mostly pizza and pasta, with a few more ambitious mains, but generally,
      the simpler, the better. "
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "103 Dongzhu'anbang Rd, Changning, Shanghai, China"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Da+Marco+Italian+Restaurant/@31.226322,121.44982,12z/data=!4m5!1m2!2m1!1sDa+Marco!3m1!1s0x35b2653ae9f7d9fd:0x851318afbf3457cd")))]))])
                                                                            ))])])))
  ;-------------------------------------------- Shanghai-Restaurant3 -----------------------------------------------
  (defn Shanghai-r3_frame []
    (frame :title "Shanghai's Best Chinese Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Lost Heaven *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Shanghai-r3.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Specializing in the tribal cuisine of China's Yunnan province, Lost Heaven has all the
      makings of a proper date restaurant: exotic cuisine, enchanted decor, atmospheric music
      and dim, flickering candlelight. It is the perfect place to go for a delicious, soothing
      meal the first day to get over the jet lag from the States Yunnan-style food but in reality
      just delicious Chinese food that Westerners will enjoy in a great ambiance. Downstairs is a
      large bar area- with two floors above as the restaurant.

      It's a beautiful restaurant and definitely impresses our guests every time. Reservations
      recommended. Same interior ambience.If you're planning to walk by the bund after dinner,
      this place takes the same food to a whole new, better level."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "38 Gaoyou Rd, Xuhui, Shanghai, China"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Lost+Heaven/@31.210009,121.438048,17z/data=!3m1!4b1!4m2!3m1!1s0x35b2654e394e2545:0x770bc14656db05fd")))]))])
                                                                            ))])])))

  ;-------------------------------------------------- Shanghai ------------------------------------------------------
  (defn Shanghai_frame []
    (frame :title "Shanghai Guide"
      :on-close :hide
      :size [640 :by 480]
      :content
      (scrollable(vertical-panel :items [
           (grid-panel :border "SHANGHAI'S TOP ATTRACTIONS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iShanghai-A1.jpg" )))
                                 :south  (button_format (button :text "Pudong Skyline"
                                               :listen [:action (fn [e](->(Shanghai-A1_frame) show!))])))
                               (border-panel :vgap 3  :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iShanghai-A2.jpg" )))
                                 :south  (button_format (button :text "Shanghai Exhibition Center"
                                               :listen [:action (fn [e](->(Shanghai-A2_frame) show!))])))
                               (border-panel :vgap 3  :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iShanghai-A3.jpg" )))
                                 :south  (button_format (button :text "Shanghai World Financial Center"
                                               :listen [:action (fn [e](->(Shanghai-A3_frame) show!))])))])
           (grid-panel :border "SHANGHAI'S TOP HOTELS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iShanghai-h1.png" )))
                                 :south  (button_format (button :text "Regal Shanghai East Asia Hotel"
                                               :listen [:action (fn [e](->(Shanghai-h1_frame) show!))])))
                               (border-panel :vgap 3  :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iShanghai-h2.png" )))
                                 :south  (button_format (button :text "Grand Kempinski Hotel"
                                               :listen [:action (fn [e](->(Shanghai-h2_frame) show!))])))
                               (border-panel :vgap 3  :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iShanghai-h3.png" )))
                                 :south  (button_format (button :text "Grand Hyatt"
                                               :listen [:action (fn [e](->(Shanghai-h3_frame) show!))])))])
           (grid-panel :border "SHANGHAI'S TOP RESTAURANTS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iShanghai-r1.jpg")))
                                 :south  (button_format (button :text "Malone's"
                                               :listen [:action (fn [e](->(Shanghai-r1_frame) show!))])))
                               (border-panel :vgap 3  :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iShanghai-r2.jpg" )))
                                 :south  (button_format (button :text "Da Marco"
                                               :listen [:action (fn [e](->(Shanghai-r2_frame) show!))])))
                               (border-panel :vgap 3  :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iShanghai-r3.jpg" )))
                                 :south  (button_format (button :text "Lost Heaven"
                                               :listen [:action (fn [e](->(Shanghai-r3_frame) show!))])))])
           (flow-panel :align :center :background :moccasin
             :items [(button_format (button :text "Generate a PDF report"
                                      :listen [:action (fn [e] (->(Shanghai_Gen_PDF) show!))]))])]))))


;-------------------------------------------- Sydney-Attraction1 -----------------------------------------------
  (defn Sydney-A1_frame []
    (frame :title "Sydney's 1st Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Sydney Opera House *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Sydney-A1.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Perched on the waterfront of Bennelong Point, the Sydney Opera House is one of the
      world’s most famous buildings. Designed by Danish architect Jørn Utzon, the structure’s
      sloping white roofs make the performing arts center appear as if it’s a giant ship
      setting out to sea.

      The complex was completed in 1973 after 16 years of construction and a cost of more than
      $100 million. A 2004 renovation added walls of glass to the reception hall, offering visitors
      views of the harbor. In addition to the 1,500-seat opera house, the center features a concert
      hall and three other theaters as well as multiple bars and restaurants."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Bennelong Point, Sydney NSW 2000, Australia"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Sydney+Opera+House/@-33.856898,151.215281,17z/data=!3m2!4b1!5s0x6b12ae668bf0cf55:0x1f2272a6333877ed!4m2!3m1!1s0x6b12ae665e892fdd:0x3133f8d75a1ac251")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Sydney-Attraction2 -----------------------------------------------
  (defn Sydney-A2_frame []
    (frame :title "Sydney's 2nd Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Queen Victoria Building *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Sydney-A2.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      More commonly referred to as the QVB, the Queen Victoria Building is a five-story shopping
      center that fills an entire city block and houses nearly 200 retailers. Built by architect
      George McRae in 1898, the building was designed as a marketplace and concert hall. Later
      tenants used the building for office space, and the structure began to fall into decay
      during the Great Depression. QVB has now been restored to its original glory and purpose.

      A beautiful example of the Romanesque Revival style popularized during Queen Victoria’s
      reign, the QVB features a large glass dome sheathed in copper, ornamental cast-iron railings
      and numerous stained glass windows."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "455 George St, Sydney NSW 2000, Australia"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Queen+Victoria+Building/@-33.871722,151.206708,17z/data=!3m1!4b1!4m2!3m1!1s0x6b12ae3c36fc2c21:0xbf6ac40e233d3415")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Sydney-Attraction3 -----------------------------------------------
  (defn Sydney-A3_frame []
    (frame :title "Sydney's 3rd Attraction"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Sydney Harbour Bridge *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Sydney-A3.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      The iconic Sydney Harbour Bridge is both the main method of crossing the harbor and a travel
      destination for adventurous visitors. Completed in 1932, the bridge features an arch that
      stands 134 meters (440 feet) above sea level and spans 503 meters (1,654 feet). In 1998, the
      city opened a Bridge Climb attraction that allows hardy visitors to ascend to the top of the
      arch.

      Participants are equipped with protective clothing and secured to a wire lifeline during
      the three-and-a-half hour climb and descent. For those who want a less-adventurous view from
      the bridge, the Pylon Lookout Museum is a popular attraction. The museum is accessed from the
      footpath that runs along the eastern side of the bridge."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "Sydney Harbour Bridge, Sydney NSW, Australia"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Sydney+Harbour+Bridge/@-33.852306,151.210787,17z/data=!3m1!4b1!4m2!3m1!1s0x6b12ae5d25ead5e3:0x68948eb717c0c43e")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Sydney-Hotel1 -----------------------------------------------
  (defn Sydney-h1_frame []
    (frame :title "Sydney's 1st Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Shangri-La Hotel *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Sydney-h1.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      5.0 out of 5 stars. Standing in the historic Rocks district of cobbled laneways
      and designer boutiques, the Shangri-La Hotel, Sydney is less than 500 meters
      from ferries and trains, Sydney's central business district, shopping, and Sydney
      Harbor foreshores.

      The Altitude Restaurant and Blu Bar on 36 of the hotel offer sweeping views of
      Sydney Harbor and the Opera House. The hotel also has extensive conference
      facilities, and CHI, The Spa with swimming pool.

      All guestrooms have expansive water views. In addition to premium bedding such as
      down quilts and silk throws, guestrooms also offer marble bathrooms with bathrobes
      and slippers."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "176 Cumberland Street The Rocks NSW 2000 Australia 1-866-599-6674"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Shangri-La+Hotel,+Sydney/@-33.861478,151.206491,17z/data=!3m1!4b1!4m2!3m1!1s0x6b12ae43b99a25b3:0x703964d0a01e2497")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Sydney-Hotel2 -----------------------------------------------
  (defn Sydney-h2_frame []
    (frame :title "Sydney's 2nd Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** The Westin Sydney *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Sydney-h2.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      5.0 out of 5 stars. Located on Sydney's Martin Place, this central business
      district hotel is less than 1 kilometer from Sydney Tower, Sydney Parliament
      House, and Darling Harbour.

      The hotel is part of the restored, historic General Post Office. Amenities
      include extensive meeting facilities, Mosaic Restaurant, Endota Spa, a health
      club, and retailers.

      Westin Sydney guestrooms feature signature Heavenly Beds, 37-inch LCD TVs with
      premium channels, and deep soaking bathtubs with separate showers."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "159 Pitt Street Sydney NSW 2000 Australia 1-866-599-6674"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/The+Westin+Sydney/@-33.867805,151.207817,17z/data=!3m1!4b1!4m2!3m1!1s0x6b12ae407edb3615:0x74894f2b703a930f")))]))])
                                                                            ))])])))

  ;-------------------------------------------- Sydney-Hotel3 -----------------------------------------------
  (defn Sydney-h3_frame []
    (frame :title "Sydney's 3rd Hotel"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Marriott Sydney Harbour *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Sydney-h3.png":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      5.0 out of 5 stars. One block from Circular Quay, the world famous Sydney
      Harbour Bridge and Sydney Opera House, this CBD hotel is a short walk to
      uptown shopping and downtown business offices, as well as the Royal Botanical
      Gardens, museums and parks.

      The Sydney Harbour Marriott has a business center, high-speed Internet, and
      comprehensive conference space. Recreation is provided in the fitness center,
      adjacent indoor swimming pool with spa tub, and a day spa with a sauna.

      All guest rooms feature high-speed Internet access and flat-screen TV with
      premium channels and in-house movies. Catering to business as well as leisure
      guests, the rooms feature armchairs, writing desks and laptop-size safes."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "30 Pitt Street Sydney NSW 2000 Australia 1-855-873-6560"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Sydney+Harbour+Marriott+Hotel+at+Circular+Quay/@-33.862785,151.209253,17z/data=!3m1!4b1!4m2!3m1!1s0x6b12ae421356e70b:0x472ed0cd9ddac2fd")))]))])
                                                                            ))])])))
  ;-------------------------------------------- Sydney-Restaurant1 -----------------------------------------------
  (defn Sydney-r1_frame []
    (frame :title "Sydney's Best American Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Hartsyard *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Sydney-r1.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      There is no denying Hartsyard's heritage; it is palpably American in taste, substance
      and style. As soon as you push open the glass door, the smell of hickory smoked pork
      greets you with open arms. You'd be forgiven for thinking you had mistakenly stumbled
      across a classic American backyard cook-out, but that's what’s beautiful about this
      Newtown newcomer. You never know what to expect. Start with the poutine ($23) for a
      no-holds-barred introduction to American cuisine that borrows generously from the Bible

      Belt, French Canada and the friction between urban and rural dining.
      Don't eat at Hartsyard too often or you will be the fat kid in the catch phrase. The food
      is American much more refined than the burgers and shakes you'd expect. The oyster po' boy
      is delicious as is the roulette peppers."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "33 Enmore Rd, Newtown NSW 2042, Australia"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Hartsyard/@-33.898314,151.176851,17z/data=!3m1!4b1!4m2!3m1!1s0x6b12b0371297d2c1:0x667265b4289b023")))]))])
                                                                            ))])])))
  ;-------------------------------------------- Sydney-Restaurant2 -----------------------------------------------
  (defn Sydney-r2_frame []
    (frame :title "Sydney's Best Italian Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Jamie’s Italian *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Sydney-r2.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      Jamie's Italian was founded in Oxford just four years ago. Since then it has grown to
      more than 30 restaurants worldwide, and there are already plans for even more in new
      towns, counties and continents around the world. The first seafaring outpost of his
      hugely popular restaurant, Jamie’s Italian by Jamie Oliver is one of Royal Caribbean’s
      nine specialty dining options onboard Quantum of the SeasSM and Anthem of the SeasSM,
      and is available for an additional charge.Great food, great drinks and very surprisingly,
      great price. Under 90 for 4 (1 spirit) drinks, 2 mains and an entree.

      Excellent Food - Pasta was very fresh with rich sauce (we ordered the special).
      The World's Best Olives On Ice dish was delicious and included 8 plump and meaty
      green olives. My wife really enjoyed the Polenta Chips and her pasta dish as well."
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "107 Pitt St, Sydney NSW 2000, Australia"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Jamie%27s+Italian/@-33.866124,151.208506,17z/data=!3m1!4b1!4m2!3m1!1s0x6b12ae404ce1cddb:0x4b717a6ca53e071c")))]))])
                                                                            ))])])))
  ;-------------------------------------------- Sydney-Restaurant3 -----------------------------------------------
  (defn Sydney-r3_frame []
    (frame :title "Sydney's Best Chinese Restaurant"
      :on-close :hide
      :size [640 :by 480]
      :content
      (vertical-panel :background :moccasin :items [
                                                     (flow-panel :align :center :background :moccasin
                                                       :items [(label :text "***** Palace Chinese Restaurant *****" :font "Cambria-BOLD-24")])
                                                     (flow-panel :align :center :background :moccasin
                                                       :items[(invoke-now (label :icon "Sydney-r3.jpg":border 3 :background :black))])
                                                     (grid-panel :border "":hgap 10
                                                       :columns 2 :background :moccasin
                                                       :items [(border-panel :vgap 5 :background :moccasin
                                                                 :north  (label :text " Description " :halign :left :font "Cambria-BOLD-18")
                                                                 :center (text  :multi-line? true :editable? false :rows 15 :font "Cambria-BOLD-14"
                                                                           :foreground :saddlebrown  :background :moccasin  :text "
      At the Palace Chinese Restaurant, you no longer have to settle for the same kind of
      Cantonese Cuisine. Explore the exciting menu that offers you the variety that fine
      Cantonese cooking will give you, in both traditional and modern Cantonese cuisine
      that best suits the mood and occasion, be it business or pleasure. You will find not
      just one delectable dish but many equally fantastic dishes to entice you palates,
      with choices of live lobster, fish, mud crab and abalone straight from the tank, to the
      wok and to the table.

      Yumcha is only available for lunch so try to arrive latest by 2.30
      to sample the many delicious dishes Palace has to offer. Like a typical yumcha experience,
      you can either select from carts being pushed around or order from the friendly waiting
      staff walking by. Staff were being extra attentive compared to some other yumcha places
      and offered to heat the dishes that are better served warm. "
                                                                           ))
                                                               (scrollable(border-panel :vgap 5 :background :moccasin
                                                                            :north  (flow-panel  :align :center :background :moccasin
                                                                                      :items [(label :text " Location: " :halign :left :font "Cambria-BOLD-18")
                                                                                              (label :text "133/143-145 Castlereagh St, Sydney NSW 2000, Australia"
                                                                                                :foreground :saddlebrown :font "Cambria-BOLD-14")])
                                                                            :center (flow-panel  :align :center :background :moccasin
                                                                                      :items [(button_format (button :text "Google Map"
                                                                                                               :listen [:action (fn [e]((browse-url "https://www.google.com/maps/place/Palace+Chinese+Restaurant/@-33.871717,151.209073,17z/data=!3m1!4b1!4m2!3m1!1s0x6b12ae3e36c3ade5:0x37c8c02601d56fd3")))]))])
                                                                            ))])])))

  ;--------------------------------------------------- Sydney ------------------------------------------------------
  (defn Sydney_frame []
    (frame :title "Sydney Guide"
      :on-close :hide
      :size [640 :by 480]
      :content
      (scrollable(vertical-panel :items [
           (grid-panel :border "SYDNEY'S TOP ATTRACTIONS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3  :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iSydney-A1.jpg")))
                                 :south  (button_format (button :text "Sydney Opera House"
                                               :listen [:action (fn [e](->(Sydney-A1_frame) show!))])))
                               (border-panel :vgap 3  :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iSydney-A2.jpg")))
                                 :south  (button_format (button :text "Queen Victoria Building"
                                               :listen [:action (fn [e](->(Sydney-A2_frame) show!))])))
                               (border-panel :vgap 3  :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iSydney-A3.jpg" )))
                                 :south  (button_format (button :text "Sydney Harbour Bridge"
                                               :listen [:action (fn [e](->(Sydney-A3_frame) show!))])))])
           (grid-panel :border "SYDNEY'S TOP HOTELS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3  :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iSydney-h1.png")))
                                 :south  (button_format (button :text "Shangri-La Hotel"
                                               :listen [:action (fn [e](->(Sydney-h1_frame) show!))])))
                               (border-panel :vgap 3  :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iSydney-h2.png")))
                                 :south  (button_format (button :text "The Westin Sydney"
                                               :listen [:action (fn [e](->(Sydney-h2_frame) show!))])))
                               (border-panel :vgap 3  :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iSydney-h3.png" )))
                                 :south  (button_format (button :text "Marriott Sydney Harbour"
                                               :listen [:action (fn [e](->(Sydney-h3_frame) show!))])))])
           (grid-panel :border "SYDNEY'S TOP RESTAURANTS" :hgap 20
                       :columns 3 :background :moccasin
                       :items [(border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iSydney-r1.jpg" )))
                                 :south  (button_format (button :text "Hartsyard"
                                               :listen [:action (fn [e](->(Sydney-r1_frame) show!))])))
                               (border-panel :vgap 3  :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iSydney-r2.jpg" )))
                                 :south  (button_format (button :text "Jamie’s Italian"
                                               :listen [:action (fn [e](->(Sydney-r2_frame) show!))])))
                               (border-panel :vgap 3 :background :moccasin
                                 :center (invoke-now (icon_format(label :icon "iSydney-r3.jpg")))
                                 :south  (button_format (button :text "Palace Chinese Restaurant"
                                               :listen [:action (fn [e](->(Sydney-r3_frame) show!))])))])
           (flow-panel :align :center :background :moccasin
             :items [(button_format (button :text "Generate a PDF report"
                                      :listen [:action (fn [e] (->(Sydney_Gen_PDF) show!))]))])]))))

  ;-------------------------------------------------- Main Frame ------------------------------------------------------

 (->(frame :title "Tourist Guide"
            :on-close :exit
            :size [640 :by 480]
            :content
       (vertical-panel :background :moccasin :items [
           (horizontal-panel :background :moccasin
                 :items [(label :text "Select a City to Display its Best Three Attractions, Hotels, Restaurants:"
                                :font "MONOSPACED-BOLD-21" :foreground :black :halign :center )[:fill-h 10]])
           (flow-panel :align :center :background :moccasin
             :items [(invoke-now(label :icon "Background.jpg" :border 3 :background :black))])

           (flow-panel :align :center :background :moccasin
                 :items [(button_format (button :text "Berlin"
                                 :listen [:action (fn [e](->(Berlin_frame) show!))]))

                         (button_format (button :text "CapeTown"
                                 :listen [:action (fn [e](->(CapeTown_frame)show!))]))

                         (button_format (button :text "Dubai"
                                 :listen [:action (fn [e](->(Dubai_frame)show!))]))

                         (button_format (button :text "Istanbul"
                                 :listen [:action (fn [e](->(Istanbul_frame)show!))]))

                         (button_format (button :text "London"
                                 :listen [:action (fn [e](->(London_frame)show!))]))

                         (button_format (button :text "New York"
                                 :listen [:action (fn [e](->(NewYork_frame)show!))]))

                         (button_format (button :text "Paris"
                                 :listen [:action (fn [e](->(Paris_frame)show!))]))

                         (button_format (button :text "Rome"
                                 :listen [:action (fn [e](->(Rome_frame)show!))]))

                         (button_format (button :text "Shanghai"
                                 :listen [:action (fn [e](->(Shanghai_frame)show!))]))

                         (button_format (button :text "Sydney"
                                 :listen [:action (fn [e](->(Sydney_frame)show!))]))])
                        ]))
    pack! show!)

  )




