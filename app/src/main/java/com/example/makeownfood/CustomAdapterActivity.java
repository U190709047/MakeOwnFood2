package com.example.makeownfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.ListActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.makeownfood.RecipeActivity1;

public class CustomAdapterActivity extends ListActivity{

    private ListView mListview;
    private ArrayAdapter<String > adapter;
    private String[] dishes = {"Burger","Pizza","Rice","Doner","Kebab","Tantuni","Lahmacun","Sarma","Pancake"
            ,"Toast","Sandwich","Pasta","Chicken Wing","Pita Bread","Meatball","Manti","Soup","Fried Potatoes"
            ,"Horicot Bean","Baklava","Cake","Waffle","Ice Cream","Supangle","Pudding","Croissant"};
    private String [] dishrecipe = {"Heat the olive oil in a frying pan, add the onion and cook for 5 minutes until softened and starting to turn golden. Set aside.\n" +
            "In a bowl, combine the beef mince with the herbs and the egg. Season, add the onions and mix well. Using your hands, shape into 4 patties.\n" +
            "Cook the burgers on a preheated barbecue or griddle for 5-6 minutes on each side. While the second side is cooking, lay a slice of cheese on top to melt slightly (if using).\n" +
            "Meanwhile, lightly toast the cut-sides of the buns on the barbecue. Fill with the lettuce, burgers and tomato slices. Serve with ketchup, if you like.",
            "Put the yeast into a small jug and pour in 380ml of warm water. Leave to stand for 5 mins until the yeast starts to react. \n" +
                    "Mix the flours and salt together and make a well. Pour in the water/yeast mix, plus the oil and bring the dough together with a wooden spoon, then use your hands. The dough will be very sticky but try to avoid adding extra flour as this will affect the end result. \n" +
                    "If you have a stand mixer, use a dough hook to knead the dough for 5 mins on a medium speed. If you are kneading by hand, use a little flour on the surface and knead for 10 mins until the dough is springy and a little firmer. \n" +
                    "Put a small drizzle of oil into a large clean bowl and add the dough. Cover with clingfilm and leave to rise for 2-3 hrs or until doubled in size. \n" +
                    "Meanwhile, mix the passata, oregano and oil together and season with salt and pepper. Halve the mozzarella balls and set them aside. \n" +
                    "When the dough has risen, preheat the oven to gas 9, 240°C, fan 220°C. Put a baking tray on a high shelf to heat up. Knock the dough back and shape into 4 equal pieces. While you work on the first piece of dough, lightly cover the remaining pieces of dough with clingfilm. \n" +
                    "Gently flour the work surface and use a rolling pin and your hands to tease the dough into a roughly 20-30cm pizza. \n" +
                    "Sprinkle a baking sheet with a little flour and put the pizza base onto it. Spoon 1-2 tbsp of the passata mix onto the base and top with a quarter (50g) of the grated mozzarella, and ¼ of the halved mozzarella balls and sundried tomatoes. Season, then sit the baking tray on top of the heated baking tray in your oven and bake for 10 mins until the base has cooked and the cheese is melted and golden. As the first pizza cooks, prepare the second pizza, then repeat with the remaining pizzas. \n" +
                    "Tip: If you have multiple trays, you can cook two pizzas at the same time.","Heat the oil in a wok or large frying pan over a medium-high heat. Mix the chicken with the curry powder, turmeric and a pinch of salt in a bowl to coat. Fry the chicken for 5-6 mins until golden brown all over, then add the onion and cook for 2-3 mins.\n" +
            "\n" +
            "Add all the vegetables from the stir-fry medley to the pan and cook for 5 mins until tender. If at any point it begins to look dry or starts to stick to the pan, add a little water.\n" +
            "\n" +
            "Meanwhile, cook the rice to pack instructions, then add it to pan and fold through continuously, to crisp up the rice and let it soak up the flavours. Season to taste before serving and top with coriander, sliced chilli and cashew nuts, if you like.",
            "Put 100g yogurt in a bowl with 2 of the crushed garlic cloves, the cumin, 1 tsp smoked paprika, ½ tsp oregano and half the lemon juice and zest. Season, then add the chicken and toss well to coat.\n" +
                    "Preheat a large griddle pan or the grill to high. Skewer the chicken onto 4 long or 8 short metal skewers. Griddle (or grill on a baking tray) for 10-15 mins, turning regularly, until charred and cooked through. Remove from the pan and griddle or grill the lemon slices for 1-2 mins each side.\n" +
                    "\n" +
                    "Toast the pittas, then split open and stuff with the lettuce, cucumber and tomatoes. Mix the remaining yogurt and garlic with a little of the remaining lemon juice and zest; top with remaining paprika and oregano, then season. Add the chicken to the pittas and drizzle over the sauce. Serve with the griddled lemon slices.",
            "Place the anchovies, lemon juice, Dijon mustard, Worcestershire sauce, pecorino and mayonnaise into a bowl and mix together well. Season with black pepper and then add the cubes of chicken. Allow to marinate for 30 mins-1 hour or overnight if possible.\n" +
                    "\n" +
                    "Thread the chicken onto two metal skewers and place onto a hot barbeque and cook for 10-12 mins, turning frequently until lightly charred and cooked through.\n" +
                    "\n" +
                    "Rinse 2 romaine lettuce leaves and shake dry. Place on a serving board and fill each with the hot chicken and sprinkle with parmesan or pecorino shavings. Grind over some black pepper and serve with lemon wedges.",
            "Mix parsley, onion, salt, and sumac in a bowl and set it aside.\n" +
                    "\n" +
                    "Boil the beef cubes with its own juice until the beef cubes color turns to brown color.\n" +
                    "\n" +
                    "Heat the wok at medium heat and add 4 tablespoons of cottonseed oil.\n" +
                    "\n" +
                    "Place the boiled beef cubes into the wok and fry them for about 5 minutes. While frying them add a splash of water a few times (2 times) to protect the beef cubes tenderness.\n" +
                    "\n" +
                    "Add the sliced sweet green chili peppers and stir for about 3 minutes.\n" +
                    "\n" +
                    "Add the ground red pepper and stir for about 2 minutes.\n" +
                    "\n" +
                    "Add the diced tomatoes and stir for about 5 minutes.\n" +
                    "\n" +
                    "Bring the heat to low and place the lavash bread on top of the dish to absorb the dish juice. And keep lavash bread on top of the dish for about 30 seconds. Let it absorb dish juice a bit.\n" +
                    "\n" +
                    "Remove the lavash bread from the top of the dish and place on a plate.\n" +
                    "\n" +
                    "Place the cooked meat in the center of lavash bread and distribute it evenly from top to bottom like a stripline by using a spoon.\n" +
                    "\n" +
                    "Add the raw onions, sumac, and parsley mix on top.\n" +
                    "\n" +
                    "Roll the lavash bread and make a wrap. (Don't forget to close the bottom of the roll. Otherwise, all ingredients fall).\n" +
                    "\n" +
                    "Repeat the same process until all meat in the wok finish.\n" +
                    "\n" +
                    "Serve.",
            "Mix flour and salt for dough,\n" +
                    "Add water slowly and knead until you get a soft dough,\n" +
                    "Cover it and rest for half an hour,\n" +
                    "Take all other ingredients on a large cutting board and mix with a knife as if you are chopping them,\n" +
                    "Heat in the oven at 240 degrees,\n" +
                    "Take a small piece of dough and roll in the size of a plate,\n" +
                    "Put the dough leaf into the oven tray,\n" +
                    "Take 2 tbsps from the filling and spread over the dough,\n" +
                    "Bake until the edges are slightly brown,\n" +
                    "Prepare the remaining dough and filling in the same way,\n" +
                    "You can serve and eat with persley and fresh lemon juice.",
            "Place cabbage in the freezer for a few days. The night before making the rolls, take it out to thaw.\n" +
                    "\n" +
                    "In a large bowl, combine the beef, pork, ham, rice, onion, egg, garlic powder, salt and pepper. Mix well. Form meat mixture into oblong balls, using 1/2 cup of the mixture at a time. Then, wrap a cabbage leaf around each ball.\n" +
                    "\n" +
                    "Spread the sauerkraut in the bottom of a large pot, then layer cabbage rolls on top, placing them seam-side down. Pour tomato juice over rolls, then add enough water to cover. Bring to a boil, then reduce heat to low and simmer for about 3 hours, adding more water as necessary.",
            "To make the custard, put the cream, milk and vanilla seeds into a saucepan and heat to just below boiling. In a bowl, whisk together the sugar, egg yolks and cornflour. Still whisking, pour on the hot milk mixture. Return to the pan and heat gently, stirring until the mixture begins to thicken and coats the back of a spoon. Pour into a bowl. Stir in the butter. Place a sheet of clingfilm directly onto the surface of the custard. Put in the fridge and chill until completely cold.\n" +
                    "To make the pancakes, put the flour and sugar into a bowl. Add the eggs and half the milk and whisk until smooth. Whisk in the remaining milk, butter and vanilla extract, then pour the batter into a jug.\n" +
                    "Heat a 20cm non-stick frying pan and brush very lightly with sunflower oil. Pour 60ml of the batter into the pan and tilt so the mixture covers the whole surface. Cook for about a minute until golden. Flip the pancake over and cook the other side for 30 seconds to 1 min. Remove to a plate. Cook a further 19 pancakes in the same way, stacking them on top of one another as they are done. Leave until cold.\n" +
                    "Place a pancake on a serving dish. Spread over 1-2 tbsp of custard and place another pancake on top. Continue spreading and stacking the remaining custard and pancakes. Chill.\n" +
                    "To make the sauce, put the raspberries and lemon juice in a pan and heat gently until the berries have softened and collapsed. Strain the pulp through a sieve and put in a clean pan. Add the sugar and stir until dissolved. Simmer gently for 5-10 mins until the mixture has reduced and is slightly syrupy. Leave to cool.\n" +
                    "To serve, whisk the cream until softly thick. Spoon over the pancake stack. Scatter over the raspberries. Pour over a little sauce and serve the rest separately."
            ,"Toast the slices of six-seed sourdough bloomer.\n" +
            "\n" +
            "Scatter over the mozzarella and slow-roast tomatoes, shaking off excess oil, then top with the anchovies, if using.\n" +
            "\n" +
            "Grill on a medium heat for 4-5 mins until the cheese has melted, then top with chopped parsley leaves, if you like.",
            "Bake the baguettes according to pack instructions.\n" +
                    "Put the sliced red onions in some ice water for 10 mins to get rid of some of the bite.\n" +
                    "Mix together ingredients for garlic butter, then microwave for 30 secs. Slice the baguettes in half, then brush inside and out with the garlic butter.\n" +
                    "Preheat the grill to high.\n" +
                    "To make the salad, combine the mayo, garlic powder, Italian seasoning, red wine vinegar, chives and jalapeños in a large bowl, then stir in the red onions and lettuce and mix well. Season with salt and pepper to taste.\n" +
                    "Layer each side of the bread with the Cheddar cheese and place under the grill for a few minutes until melted.\n" +
                    "Remove from the grill and layer with the sliced tomatoes and leftover beef. Season well, then top with the grinder salad and Parmesan, then close the sandwich and enjoy!",
            "Heat the oil in a large heavy based frying pan and cook the mince over a moderately high heat for 5 mins, stirring well and breaking up the meat so it browns all over. Add the pepper and onion and celery and cook for a further 5 mins until the meat is golden and the vegetables are softened.\n" +
                    "Add the kidney beans and enchilada sauce, along with 100ml water then reduce the heat, cover and simmer for 10 mins. Preheat the oven to 200°C, fan 180°C, gas 6\n" +
                    "Meanwhile bring a large pan of water to the boil and cook the tagliatelle for 8-10 mins according to packet instructions. Drain well and toss with the meat sauce.\n" +
                    "Pile into a large 1.5 litre ovenproof gratin dish and level, then scatter with the grated cheese and bake in the preheated oven for 20 minutes until golden and bubbling. Sprinkle over coriander to serve.",
            "Begin by making the Buffalo sauce, melt the butter in a small pan, add the shallot and garlic cook until softened, add the remaining ingredients and simmer for 10 minutes. To prepare the dip: finely dice the celery and add to the soured cream along with the chives.\n" +
                    "Coat the chicken wings in the oil. Season the flour with the salt and some pepper, then toss the wings in the flour, dusting off any excess. Thread the wings, four at a time onto parallel skewers (like rungs of a ladder). Preheat BBQ to medium hot. Cook the wings for 20-25 minutes until golden and cooked through, with no pink showing, turn regularly, brush with more oil if needed.\n" +
                    "Slide the cooked chicken wings into the buffalo sauce, coat well and serve alongside the dip.",
            "Turkish Pide Dough\n" +
                    "In a bowl or stand mixer, add the warm water, sugar or honey and yeast. Mix and allow the mixture to bloom for 5 minutes until the edges get foamy around the edges.\n" +
                    "Now, add the flour and using a wooden spoon, mix. Transfer the dough onto a clean well floured surface and knead the dough for a couple of minutes. I used about 3 additional tablespoons of flour while kneading the dough. The dough should be slightly sticky but soft.\n" +
                    "Place the dough in a large bowl and drizzle a little bit of olive oil on top and cover the dough with a plastic wrap and a tea towel. Place the bowl in a warm place to rise for about 1-2 hours or until double in size.\n" +
                    "Spinach Filling\n" +
                    "In a pan, saute the onion with some olive oil. Then add the spinach and stir until the spinach has wilted. Now add some sumac, salt, black pepper, and chili pepper. Taste and any additional seasoning to your liking. Transfer to a plate and allow to cool before using.\n" +
                    "Forming the Pide\n" +
                    "Place a baking sheet or pizza stone in the oven. Preheat the oven to 500 or 550F. Try and heat the stone for at least one hour. \n" +
                    "Once the dough has doubled in size, transfer onto a floured surface and form a log and divide the dough into six pieces. You will be working with one dough piece at a time — so make sure to keep the remaining dough pieces covered really well to prevent it from drying out.\n" +
                    "Lightly flour a clean surface, begin rolling out one piece of dough into a large oval. If you start to notice that the dough is not stretching well, cover with a tea towel and allow the dough to rest for a couple of minutes to relax the gluten.\n" +
                    "Continue this step with the remaining 5 pieces of dough. Note: Make sure to keep every stretched dough covered well to prevent it from drying out. This is very important.\n" +
                    "Once you have stretched out the doughs, place it in on a parchment paper. I baked three Pide at a time. This depends on how large your baking stone is — So place two or three Pide dough on a parchment paper and brush it with some olive oil and top it with any type of filling.\n" +
                    "I placed about 1/2 cup of filling for each Pide but feel free to add more or less just make sure to leave about 1/2-inch border on the sides empty.\n" +
                    "Now, fold the edges of the dough over the filling and then pinch or twist the ends to form a boat or canoe-like shape. If you notice that the ends are not pinching together add a little bit of water one on end of the dough and that should help. Brush the outer dough with an egg wash or lightly brush some olive oil. Sprinkle some sesame and black seeds and repeat this step with the remaining dough. \n" +
                    "Baking the Pide\n" +
                    "Place the parchment paper over the pizza stone or baking sheet and bake for about 12-14 minutes or until lightly golden along the sides.\n" +
                    "Once baked, place on to a wire rack or wooden board and for the cheese Pide, I love brushing it some melted butter and garnishing with some chopped parsley.\n" +
                    "Slice into pieces and and ENJOY!",
            "Preheat the oven to gas 6, 200°C, fan 180°C. Put the meatballs onto a baking tray and cook in the oven for 12-15 mins until piping hot and cooked through.\n" +
                    "\n" +
                    "Meanwhile, mix together the tomatoes, spring onions and half the lime juice in a small bowl, season and set aside. Mix the yogurt with the garlic and remaining lime juice.\n" +
                    "\n" +
                    "Place a griddle pan on a high heat and heat the flatbread on both sides for 30 secs-1 min until warmed through and griddle marks appear.\n" +
                    "\n" +
                    "Top the flatbread with the salad, cucumber, tomato salsa, pickled red cabbage and meat-free meatballs. Drizzle over the yogurt sauce and chilli sauce, if using. Wrap up and enjoy immediately.",
            "Make dough: Combine flour and salt in a large bowl. Add eggs and water, mixing well with your hands. Add more water, if needed, to form a soft dough. Cover and set aside for at least 30 minutes.\n" +
                    "\n" +
                    "Make filling: Shred onions and place them in a colander or sieve set over a bowl; drain and discard juice. Combine drained onion, ground beef, salt, and pepper in a medium bowl; mix well with a spoon until mashed. Set filling aside.\n" +
                    "\n" +
                    "Lightly flour a work surface and a large plate.\n" +
                    "\n" +
                    "Divide dough in half. Working with one piece at a time, roll dough on the floured surface into a rectangle as thin as possible. Cut into 2-inch squares using a knife or pastry wheel.\n" +
                    "\n" +
                    "Place about 2 teaspoons filling in the center of each square. Gather the edges of dough and pinch them together at the top to form a bundle. Transfer manti to the prepared plate; sprinkle more flour on top to prevent sticking.\n" +
                    "\n" +
                    "Make oil: Heat oil and red pepper flakes in a small skillet over low heat just until pepper flakes begin to color oil. Remove from heat and keep warm.\n" +
                    "\n" +
                    "Make sauce: Stir together yogurt and garlic in a small bowl; set aside.\n" +
                    "\n" +
                    "Bring a large pot of salted water to a boil over medium-high heat. Cook manti in boiling water until filling is no longer pink and dough is tender, 20 to 25 minutes. Drain well.\n" +
                    "\n" +
                    "Divide manti onto 4 plates. Spoon yogurt sauce over manti and drizzle with pepper oil.",
            "Add the onion, carrot, celery, tinned tomatoes and stock to a saucepan, bring to the boil and simmer for 15 mins until the vegetables have softened. Blend with a stick blender until smooth. \n" +
                    "Divide the soup between 2 bowls, top with rocket and serve with the ciabatta toast dippers.",
            "Preheat the oven to gas 5, 190°C, fan 170°C. Line a large baking tray with nonstick baking paper.\n" +
                    "Cut the sweet potatoes into long, finger-width wedges and put on the tray. Drizzle with the oil and scatter over the rosemary and garlic powder and season with black pepper. Toss together.\n" +
                    "Cook in the oven for 25-30 minutes on the top shelf, until lightly golden and soft enough to be pierced through with a fork or skewer. Serve immediately with the rosemary sprigs and your preferred dipping sauce."
            ,"Soak the beans in water overnight.\n" +
            "The following day drain and place in a saucepan with enough water to cover and cook on a low boil for around 30-45 minutes, removing any foam that may come to the top when cooking.\n" +
            "The beans are ready when softened.\n" +
            "Whilst the beans are cooking, heat a little olive oil in a frying pan and add the onions. \n" +
            "Stir the onions until they are coated in the oil and add in the salt and a couple of tablespoons of water. \n" +
            "Cover the saucepan and turn to low heat, the onions are ready when caramelised to a deep brown colour, this can take around 30 minutes or more, during this time if they start to stick add a tablespoon or two of more water. \n" +
            "When both the beans and onions are ready, add the salças to the frying pan along with a little water from the beans and fry until they have loosened up.\n" +
            "Add the onion / salça mixture along with the spices and pekmez to the beans saucepan and simmer for around 30 minutes or until the beans are softened to your liking. \n" +
            "Serve as is or with rice/bulgur pilaf and pickles.",
            "Preheat the oven to 180°C, 350°F, Gas 4.\n" +
                    "Melt the butter in a pan. Lay a sheet of filo pastry in a greased baking tray and brush with butter. Repeat with half the filo sheets, brushing each one with melted butter before laying another on top.\n" +
                    "Mix together the nuts, sugar and cinnamon in a bowl then sprinkle evenly over the filo pastry. Lay the remaining filo sheets on top, brushing each one with butter as before. Cut a diamond pattern into the top pastry sheets, then bake in the oven for about 20 minutes.\n" +
                    "Reduce the heat to 160°C, 320°F, Gas 3 and bake for another 25-30 minutes until the pastry is golden on top and slightly puffed. If necessary, cook for a further five minutes.\n" +
                    "Meanwhile make the syrup: heat the sugar, water, a little lemon juice and blossom water if using in a pan until the sugar has melted. Do not stir. Remove the baklava from the oven and set aside. Pour the syrup evenly over the pastry and leave to cool. Cut into diamond-shaped pieces before serving.",
            "Remove zest from orange and lemon with a fine grater, and squeeze the juices. Put all zest and juice in a bowl with mixed dried fruit and glace cherries. Add the brandy or tea, cover with clingfilm and soak for a minimum of 1 hr or overnight.\n" +
                    "Grease and line a 20cm cake tin, preferably with a removable base.\n" +
                    "Preheat the oven to 150°C, gas 3, fan 130°C.\n" +
                    "With an electric mixer, beat the butter with the sugar and black treacle until paler and fluffy. Gradually add the eggs, beating each one in thoroughly before adding the next one. In another bowl, combine the flour, ground almonds and mixed spice and stir to mix thoroughly. Then add the dry ingredients to the butter mixture, and fold in gently until thoroughly combined.\n" +
                    "Add the soaked fruit and all the juices, plus the nuts if liked. Fold gently together until the ingredients are thoroughly combined. Turn the mixture into your prepared cake tin and flatten the surface. Place in the centre of the oven, and bake for 2 hrs or until golden brown and springy to the touch. Use a sharp knife or skewer to test the cake. If there is still wet mixture on the blade, bake for another 20-30 mins. It should come out clean.\n" +
                    "When the cake is cooked, cool for an hour in the tin and then turn out onto a wire rack. You can pierce the cake all over with a skewer and add another tbsp brandy to soak in if liked.\n" +
                    "The cake can be kept wrapped in foil or clingfilm in a tin for up to 2 months. When you are ready to finish the cake, warm the apricot jam to soften, and brush over the whole cake. Dust the work surface with a little icing sugar, and roll out half the marzipan.\n" +
                    "Cut a 20cm circle drawing round the cake tin as a pattern. Cut out a band of marzipan, again using the side of the tin as a guide.\n" +
                    "Place the circle on the top, and stick the band around the sides, pressing into place and filling any gaps.\n" +
                    "If possible, allow the marzipan layer to dry overnight.\n" +
                    "To make the icing, beat the sifted icing sugar with the egg white and lemon juice until glossy. Spread over the cake with a palette knife, forming soft peaks to look like snow drifts. Decorate with edible silver balls or other decorations.",
            "Preheat the oven to gas 1⁄4, 100°C, fan80°C.Mixtheflour,sugar, baking powder, orange zest and half the lemon zest in a mixing bowl. In a separate bowl, whisk the milk, eggs and vanilla until well mixed, then slowly whisk into the dry ingredients to make a smooth batter.\n" +
                    "\n" +
                    "Spray or grease a waffle machine with oil and pour in one-sixth of the mixture. Close the machine and cook for 5-6 mins until golden. Keep warm on a tray in the oven while you make the rest. Peel and slice the oranges into thin rounds. Serve with the waffles, a dollop of yogurt, the rest of the lemon zest and a drizzle of honey.",
            "Working quickly, scoop balls of ice cream from each tub onto trays that fit in your freezer until you’ve used up all the ice cream. Leave to freeze overnight.\n" +
                    "The following day, melt 150g dark chocolate in a small heatproof bowl set over a pan of barely simmering water. Spear a few balls of ice cream of each flavour with cocktail sticks and dip into the chocolate until mostly coated, then return to the tray and quickly scatter over 3 tbsp chopped nuts. Return to the freezer while you make the sauce.\n" +
                    "Put the remaining chocolate in a small heatproof bowl. Gently heat the cream and golden syrup in a small saucepan until just bubbling, then pour over the chocolate. Leave to stand for 5 mins, then stir to make a glossy ganache. Leave to cool to room temperature.\n" +
                    "Stack the ice cream balls on a serving plate, dotting the berries in between. Drizzle over the sauce and scatter over the remaining nuts. Dust with edible glitter, if you like, and serve immediately.",
            "Take a small glass of milk into the pot.\n" +
                    "Add cocoa, starch and granulated sugar on top and whisk until there are no lumps.\n" +
                    "Add the remaining milk to the pot and cook on medium heat until it thickens.\n" +
                    "Add the chocolates to the thickened supangle mixture. Stir quickly until the chocolate melts and remove from the heat.\n" +
                    "Divide the cake slices into the cups, if desired. Pour the hot supangle on top and wait for it to form a crust for 1 minute.\n" +
                    "Sprinkle nutmeg on top of the crusty supangle, when it comes to room temperature, put it in the refrigerator and serve cold.",
            "Preheat the oven to gas 1, 140°C, fan 120°C. Using a dairy-free butter, lightly grease a 1 litre ovenproof dish. Mix together the milk, cream, pudding rice and sugar and vanilla pod and pour into the prepared dish. Place in the oven and bake for 30 minutes. Stir well and then bake for another 30 minutes. It will seem quite runny when it comes out of the oven but don’t worry leave it for 5-10 minutes and it will thicken.\n" +
                    "While the rice pudding is cooking, place the blanched almonds onto a baking tray and bake for 10 minutes or until golden, roughly chop and then scatter on top of the rice pudding just before serving.",
            "Cook the croissants according to the pack instructions; leave to cool. \n" +
                    "Mix the icing sugar, cocoa powder and 2 tbsp water in a small bowl until well-combined into a thick icing. Dip the top of each croissant into the icing, then sprinkle with the hazelnuts and set aside on a tray to set. \n" +
                    "When the icing is firm, warm the chocolate hazelnut spread in a small saucepan until warmed and loose. Fill a small piping bag fitted with a small round nozzle with the spread. Using a small knife, cut a cross into the back of the croissant (midway down) then insert the nozzle and pipe a quarter of the mixture into each one. Enjoy while still warm." };
    private int [] dishpicture = {R.mipmap.burger_foreground,R.mipmap.pzz_foreground,R.mipmap.rc_foreground,R.mipmap.dnr_foreground,R.mipmap.kebab_foreground,R.mipmap.tnt_foreground,R.mipmap.lhmc_foreground,R.mipmap.sarma_foreground
            ,R.mipmap.pnc_foreground,R.mipmap.tst_foreground,R.mipmap.sdw_foreground,R.mipmap.pst_foreground,R.mipmap.cw_foreground,R.mipmap.pt_foreground,R.mipmap.meatball_foreground,R.mipmap.mnt_foreground
            ,R.mipmap.soup_foreground,R.mipmap.frs_foreground,R.mipmap.bean_foreground,R.mipmap.baklava_foreground,R.mipmap.cake_foreground,R.mipmap.wff_foreground,R.mipmap.ice_foreground,R.mipmap.spng_foreground,R.mipmap.pud_foreground,R.mipmap.cro_foreground};
    private Intent detailsIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_array_adaptor);
        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_array_adaptor,dishes));

        ListView listView = getListView();
        listView.setTextFilterEnabled(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                detailsIntent = new Intent(CustomAdapterActivity.this, RecipeActivity2.class);
                detailsIntent.putExtra("DishName",dishes[position]);
                detailsIntent.putExtra("DishRecipe", dishrecipe[position]);
                detailsIntent.putExtra("DishPicture",dishpicture[position]);
                startActivity(detailsIntent);

            }
        });
    }

}