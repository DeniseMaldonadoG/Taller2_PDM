package com.pdm.foodspot.data

import com.pdm.foodspot.model.Dish
import com.pdm.foodspot.model.Restaurant

val restaurantList: List<Restaurant> = listOf(

        Restaurant(
            id = 1,
            name = "Santa Burguesa",
            description = "True burgers with fresh ingredients.",
            imageUrl = "https://d3jky06km58rdx.cloudfront.net/assets/images/store/san-salvador/IcC45Fepzw79vPdVSC1J51IUqnv2JgaQ7s21EpF4.webp",
            categories = listOf("Comida Rápida", "Hamburguesas"),
            menu = listOf(
                Dish(1, "CHICKEN PERFECTA", "Pechuga de pollo, queso americano, lechuga, tomate, cebolla, pepinillos. salsas a escoger: secreta, smoke, Chipotle, parmesano, ranch o BBQ.",
                    "https://tb-static.uber.com/prod/image-proc/processed_images/553b81c92757025008d4d58c890c49b6/70aa2a4db7f990373ca9c376323e3dea.jpeg"),
                Dish(2, "SEÑORITA GUACAMOLE", "Pechuga de pollo, queso mozzarella, tocino, guacamole, con un toque de tajín, lechuga, tomate y salsa Chipotle.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQuMLsNAboo1OdtF_dB70kGnR-DLwg94dEP1Q&s"),
                Dish(3, "BABY", "Carne Angus Blend, queso americano, salsa secreta, lechuga, tomate, cebolla y pepinillos.",
                    "https://d3jky06km58rdx.cloudfront.net/assets/images/store/san-salvador/ryhQVM4owsDLN7VIUZE3Qs14R3GG0NPdd3WrXv6H.webp"),
                Dish(4, "SMOKEY BACON", "Carne Angus Blend, queso americano, tocino, salsa smoke, cebolla crispy, pepinillos y un toque de salsa barbacoa.",
                    "https://www.foood.app/santaburguesa/images/cover.jpg")
            )
        ),
        Restaurant(
            id = 2,
            name = "Pollo Campero",
            description = "Tierno, jugoso y crujiente.",
            imageUrl = "https://www.revistaeyn.com/binrepository/1350x900/75c0/1200d900/none/26086/GXIW/POLLOCAMPERO-GUATEMALA1_EN839948_MG233393853.jpg",
            categories = listOf("Comida Rápida", "Pollo"),
            menu = listOf(
                Dish(5, "Pizza de Camperitos", "Pizza de Camperitos con una pepsi de 1L.",
                    "https://tb-static.uber.com/prod/image-proc/processed_images/5ca2ea14df3db793949153e656ee43c7/a19bb09692310dfd41e49a96c424b3a6.jpeg"),
                Dish(6, "Combo personañ 1", "Menú Super Campero (2 o 3 piezas de pollo + papas + bebida)",
                    "https://cdn-pro.elsalvador.com/wp-content/uploads/2022/09/Campero-1.jpg"),
                Dish(7, "Sandwich de Pollo", "Pechuga empanizada, pepinillos y mayonesa especial",
                    "https://www.meatpoultry.com/ext/resources/2022/07/28/Pollo_Campero_Spicy_Chicken_Sandwich.jpg?height=418&t=1659022219&width=800")
            )
        ),
        Restaurant(
            id = 3,
            name = "Tacos Mex",
            description = "Auténtica cocina mexicana callejera con sabores vibrantes y recetas tradicionales.",
            imageUrl = "https://images.unsplash.com/photo-1565299585323-38d6b0865b47?w=800",
            categories = listOf("Comida Rápida", "Mexicana"),
            menu = listOf(
                Dish(8, "Tacos al Pastor", "Carne de cerdo marinada, piña, cilantro y cebolla",
                    "https://images.unsplash.com/photo-1565299585323-38d6b0865b47?w=400"),
                Dish(9, "Burrito Grande", "Frijoles, arroz, guacamole y pollo a la plancha",
                    "https://images.unsplash.com/photo-1626700051175-6818013e1d4f?w=400"),
                Dish(10, "Nachos Supreme", "Tortillas, jalapeños, queso fundido y pico de gallo",
                    "https://images.unsplash.com/photo-1513456852971-30c0b8199d4d?w=400"),
                Dish(11, "Quesadillas", "Tortilla de maíz, queso Oaxaca y champiñones",
                    "https://images.unsplash.com/photo-1618040996337-56904b7850b9?w=400")
            )
        ),


        Restaurant(
            id = 4,
            name = "Pizza Place",
            description = "Las mejores pizzas artesanales de la ciudad, con ingredientes frescos importados de Italia.",
            imageUrl = "https://images.unsplash.com/photo-1611915365928-565c527a0590?w=800",
            categories = listOf("Italiana"),
            menu = listOf(
                Dish(12, "Pizza Margarita", "Mozzarella fresca, albahaca y salsa de tomate casera",
                    "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?w=400"),
                Dish(13, "Pizza Pepperoni", "Pepperoni, mozzarella y salsa picante opcional",
                    "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?w=400"),
                Dish(14, "Pizza Cuatro Quesos", "Mozzarella, parmesano, gorgonzola y ricotta",
                    "https://images.unsplash.com/photo-1513104890138-7c749659a591?w=400"),
                Dish(15, "Pizza Hawaiana", "Jamón, piña, mozzarella y salsa de tomate",
                    "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?w=400")
            )
        ),
        Restaurant(
            id = 5,
            name = "Bella Pasta",
            description = "Pasta fresca hecha a mano todos los días con las mejores salsas italianas.",
            imageUrl = "https://images.unsplash.com/photo-1621996346565-e3dbc646d9a9?w=800",
            categories = listOf("Italiana"),
            menu = listOf(
                Dish(16, "Spaghetti Carbonara", "Huevo, guanciale, queso pecorino y pimienta negra",
                    "https://images.unsplash.com/photo-1608756687911-aa1599ab3bd9?w=400"),
                Dish(17, "Fettuccine Alfredo", "Crema, parmesano y mantequilla artesanal",
                    "https://images.unsplash.com/photo-1621996346565-e3dbc646d9a9?w=400"),
                Dish(18, "Lasaña Boloñesa", "Capas de pasta, carne, bechamel y queso gratinado",
                    "https://images.unsplash.com/photo-1574894709920-11b28e7367e3?w=400")
            )
        ),


        Restaurant(
            id = 6,
            name = "Sushi Bar",
            description = "El mejor sushi de la ciudad elaborado por chefs japoneses con pescado de primera calidad.",
            imageUrl = "https://images.unsplash.com/photo-1579871494447-9811cf80d66c?w=800",
            categories = listOf("Asiática", "Japonesa"),
            menu = listOf(
                Dish(19, "Roll California", "Cangrejo, aguacate, pepino y semillas de sésamo",
                    "https://images.unsplash.com/photo-1564489563601-c53cfc451e93?w=400"),
                Dish(20, "Sashimi de Salmón", "Salmón fresco cortado en finas láminas con wasabi",
                    "https://images.unsplash.com/photo-1580822184713-fc5400e7fe10?w=400"),
                Dish(21, "Ramen Tonkotsu", "Caldo de hueso de cerdo, chashu, huevo y nori",
                    "https://images.unsplash.com/photo-1569050467447-ce54b3bbc37d?w=400"),
                Dish(22, "Gyozas", "Dumplings de cerdo y verduras con salsa ponzu",
                    "https://images.unsplash.com/photo-1496116218417-1a781b1c416c?w=400")
            )
        ),
        Restaurant(
            id = 7,
            name = "Wok Express",
            description = "Cocina china y thai rápida con ingredientes frescos salteados al wok con salsas auténticas.",
            imageUrl = "https://images.unsplash.com/photo-1617093727343-374698b1b08d?w=800",
            categories = listOf("Asiática", "China"),
            menu = listOf(
                Dish(23, "Arroz Frito Especial", "Arroz, huevo, pollo, camarones y verduras salteadas",
                    "https://images.unsplash.com/photo-1603133872878-684f208fb84b?w=400"),
                Dish(24, "Pollo Kung Pao", "Pollo, maníes, chiles y salsa especial de soja",
                    "https://images.unsplash.com/photo-1617093727343-374698b1b08d?w=400"),
                Dish(25, "Pad Thai", "Fideos de arroz, camarones, cacahuates y lima",
                    "https://images.unsplash.com/photo-1559314809-0d155014e29e?w=400")
            )
        ),


        Restaurant(
            id = 8,
            name = "Green Bowl",
            description = "Comida saludable y deliciosa: bowls, ensaladas y jugos naturales para un estilo de vida activo.",
            imageUrl = "https://images.unsplash.com/photo-1512621776951-a57141f2eefd?w=800",
            categories = listOf("Saludable"),
            menu = listOf(
                Dish(26, "Buddha Bowl", "Quinoa, garbanzos, aguacate, kale y aderezo tahini",
                    "https://images.unsplash.com/photo-1512621776951-a57141f2eefd?w=400"),
                Dish(27, "Ensalada Griega", "Pepino, tomate, aceitunas, feta y orégano fresco",
                    "https://images.unsplash.com/photo-1540420773420-3366772f4999?w=400"),
                Dish(28, "Smoothie Bowl", "Açaí, plátano, granola, frutos rojos y miel",
                    "https://images.unsplash.com/photo-1590301157890-4810ed352733?w=400"),
                Dish(29, "Wrap de Pollo", "Pechuga grillada, lechuga romana, tomate y hummus",
                    "https://images.unsplash.com/photo-1626700051175-6818013e1d4f?w=400")
            )
        ),


        Restaurant(
            id = 9,
            name = "Sweet Dreams",
            description = "Postres artesanales elaborados con amor: pasteles, helados y delicias para el alma.",
            imageUrl = "https://images.unsplash.com/photo-1551024601-bec78aea704b?w=800",
            categories = listOf("Postres"),
            menu = listOf(
                Dish(30, "Cheesecake de Frutos Rojos", "Base de galleta, crema de queso y coulis de fresas",
                    "https://images.unsplash.com/photo-1533134242443-d4fd215305ad?w=400"),
                Dish(31, "Brownie con Helado", "Brownie tibio de chocolate con helado de vainilla",
                    "https://images.unsplash.com/photo-1564355808539-22fda35bed7e?w=400"),
                Dish(32, "Crepes Nutella", "Crepes finas con Nutella, plátano y crema chantilly",
                    "https://images.unsplash.com/photo-1519676867240-f03562e64548?w=400"),
                Dish(33, "Tiramisú", "Mascarpone, café espresso, savoiardi y cacao",
                    "https://images.unsplash.com/photo-1571877227200-a0d98ea607e9?w=400")
            )
        ),


        Restaurant(
            id = 10,
            name = "Brew & Co",
            description = "Café de especialidad, tés artesanales y bebidas frías para cada momento del día.",
            imageUrl = "https://images.unsplash.com/photo-1495474472287-4d71bcdd2085?w=800",
            categories = listOf("Café"),
            menu = listOf(
                Dish(34, "Latte de Vainilla", "Espresso doble, leche vaporizada y sirope de vainilla",
                    "https://images.unsplash.com/photo-1561882468-9110e03e0f78?w=400"),
                Dish(35, "Cold Brew", "Café infusionado en frío por 24 horas con notas de chocolate",
                    "https://images.unsplash.com/photo-1461023058943-07fcbe16d735?w=400"),
                Dish(36, "Matcha Latte", "Matcha ceremonial japonés con leche de avena y miel",
                    "https://images.unsplash.com/photo-1536256263959-770b48d82b0a?w=400"),
                Dish(37, "Frappé de Caramelo", "Café, leche, caramelo, hielo y crema batida",
                    "https://images.unsplash.com/photo-1517701604599-bb29b565090c?w=400")
            )
        ),

        Restaurant(
            id = 11,
            name = "La Cantina",
            description = "Cocina mexicana tradicional con sabores auténticos y ambiente festivo.",
            imageUrl = "https://images.unsplash.com/photo-1551504734-5ee1c4a1479b?w=800",
            categories = listOf("Mexicana", "Comida Rápida"),
            menu = listOf(
                Dish(38, "Enchiladas Verdes", "Tortillas rellenas de pollo, salsa verde y crema",
                    "https://images.unsplash.com/photo-1534352956036-cd81e27dd615?w=400"),
                Dish(39, "Chiles Rellenos", "Chile poblano, queso Oaxaca y salsa de jitomate",
                    "https://images.unsplash.com/photo-1565299585323-38d6b0865b47?w=400"),
                Dish(40, "Guacamole con Totopos", "Aguacate fresco, jitomate, cebolla y cilantro",
                    "https://images.unsplash.com/photo-1599974579688-8dbdd335c77f?w=400")
            )
        ),

    Restaurant(
        id = 12,
        name = "Estilo de Vida",
        description = "Bowls nutritivos, jugos naturales y ensaladas para un estilo de vida sano.",
        imageUrl = "https://i1-e.pinimg.com/736x/12/8a/bd/128abdd666828e7c78be290fc4430aaa.jpg",
        categories = listOf("Saludable"),
        menu = listOf(
            Dish(41, "Bowl de Quinoa", "Quinoa, aguacate, huevo pochado y aderezo de limón",
                "https://images.unsplash.com/photo-1512621776951-a57141f2eefd?w=400"),
            Dish(42, "Jugo Verde", "Espinaca, pepino, manzana verde y jengibre",
                "https://images.unsplash.com/photo-1568909344668-6f14a07b56a0?w=400"),
            Dish(43, "Ensalada Tropical", "Lechuga, mango, fresas, almendras y vinagreta",
                "https://images.unsplash.com/photo-1540420773420-3366772f4999?w=400"),
            Dish(44, "Wrap Vegano", "Tortilla integral, hummus, zanahoria y espinaca",
                "https://images.unsplash.com/photo-1626700051175-6818013e1d4f?w=400")
        )
    ),

    Restaurant(
        id = 13,
        name = "Burger Bros",
        description = "Hamburguesas artesanales con carne de res nacional y pan brioche horneado.",
        imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=800",
        categories = listOf("Comida Rápida", "Hamburguesas"),
        menu = listOf(
            Dish(45, "Burger Doble", "Doble carne, queso americano, lechuga y tomate",
                "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=400"),
            Dish(46, "Smash Burger", "Carne aplastada, queso cheddar y cebolla caramelizada",
                "https://images.unsplash.com/photo-1553979459-d2229ba7433b?w=400"),
            Dish(47, "Hot Dog Especial", "Salchicha, guacamole, jalapeños y queso fundido",
                "https://i.pinimg.com/736x/bb/52/1c/bb521cf21338ec6bc355e631cbd767a5.jpg"),
            Dish(48, "Papas con Queso", "Papas fritas cubiertas de queso fundido y tocino",
                "https://images.unsplash.com/photo-1573080496219-bb080dd4f877?w=400")
        )
    ),

    Restaurant(
        id = 14,
        name = "Café 503",
        description = "Café de especialidad cultivado en las faldas del volcán Santa Ana.",
        imageUrl = "https://i.pinimg.com/736x/1d/1a/8c/1d1a8c92372bd05656af230897968371.jpg",
        categories = listOf("Café"),
        menu = listOf(
            Dish(49, "Café de Olla", "Café negro con canela y piloncillo al estilo tradicional",
                "https://i.pinimg.com/736x/5a/8f/fa/5a8ffa5587ad2594ae05cc9ed3e9c937.jpg"),
            Dish(50, "Horchata Fría", "Bebida de arroz, canela y semilla de morro bien fría",
                "https://i.pinimg.com/736x/06/72/c2/0672c2cd7c18fcb9d91ee7ef14d2b5b8.jpg"),
            Dish(51, "Fresco de Tamarindo", "Tamarindo natural con azúcar y hielo",
                "https://i1-e.pinimg.com/1200x/28/8f/93/288f9308804ee96dad69495cfce787be.jpg"),
            Dish(52, "Licuado de Mamey", "Mamey fresco, leche y una pizca de canela",
                "https://i1-e.pinimg.com/1200x/f1/d3/d6/f1d3d673b929188ccdad98774f3a0b44.jpg")
        )
    ),
        Restaurant(
            id = 15,
            name = "Pho Saigon",
            description = "Auténtica sopa vietnamita con caldos cocinados lentamente durante horas.",
            imageUrl = "https://images.unsplash.com/photo-1569050467447-ce54b3bbc37d?w=800",
            categories = listOf("Asiática", "Vietnamita"),
            menu = listOf(
                Dish(53, "Pho Bo", "Caldo de res, fideos de arroz, cebollín y albahaca thai",
                    "https://images.unsplash.com/photo-1569050467447-ce54b3bbc37d?w=400"),
                Dish(54, "Banh Mi", "Baguette vietnamita, cerdo BBQ, pickles y cilantro",
                    "https://images.unsplash.com/photo-1559314809-0d155014e29e?w=400"),
                Dish(55, "Rollitos Frescos", "Camarones, vermicelli, lechuga y salsa de maní",
                    "https://images.unsplash.com/photo-1564489563601-c53cfc451e93?w=400")
            )
        )
    )

