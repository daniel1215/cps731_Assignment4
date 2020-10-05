package com.example.seongjoon_chung_cps731_500503264_assignment4_redo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;

    private List<String> recipeTitles;
    private List<String> recipeDescription;

    private List<RecipeDetails> recipeDetails;
    private RecyclerViewAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipeTitles = new ArrayList<>();
        recipeDescription = new ArrayList<>();

        recyclerView = findViewById(R.id.recyclerView);
        recyclerViewAdapter = new RecyclerViewAdapter(recipeTitles, recipeDescription, recipeDetails, listener);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);

        addTitles();
        addDescription();
        addRecipeDetails();

        setOnClickListener();


    }

    private void addTitles() {
        recipeTitles.add("Shrimp Scampi");
        recipeTitles.add("Easy Cucumber, Peach, and Basil Salad");
        recipeTitles.add("Chicken Piccata");
        recipeTitles.add("Microwave Poached Eggs");
        recipeTitles.add("Honey Mustard Baked Salmon");
        recipeTitles.add("Quick and Easy Pan-Fried Flank Steak");
        recipeTitles.add("Pasta with Tuna and Capers in White Wine Sauce");
    }

    private void addDescription() {
        recipeDescription.add("Quick and easy shrimp scampi. Shrimp sautéed in easy scampi sauce with garlic, butter, olive oil, and white wine, tossed with red pepper flakes and parsley.");
        recipeDescription.add("Cool, crunchy cucumbers combined with sweet, juicy peaches and dressed in a peppery basil vinaigrette is a great way to make the most of summer and all its gorgeous flavors. This refreshing salad is easy to make and goes great with grilled meat.");
        recipeDescription.add("Easy Chicken Piccata! Takes 20 minutes to make. Chicken breast cutlets, dredged in flour, browned, served with sauce of butter, lemon juice, capers, and stock or wine.");
        recipeDescription.add("EASIEST way ever to poach eggs—all you need is a mug and a microwave! Ready in about a minute. Use this poached egg method to top a quick lunch salad, toast for an easy breakfast or roasted vegetables for dinner.");
        recipeDescription.add("Dinner is 6 ingredients and 20 minutes away with this Honey Mustard Salmon. Honey mustard is an easy way to dress up salmon, and baking it in the oven means your hands are free to throw together a salad or other side dish.");
        recipeDescription.add("A quick and easy way of cooking lean flank steak on the stovetop.");
        recipeDescription.add("Pasta served with a sauce made with oil-packed canned tuna, onions, capers, white wine, and parsley.");
    }

    private void addRecipeDetails() {
        RecipeDetails recipe1 = new RecipeDetails("INGREDIENTS\n" +
                "•\t1 pound large (16-20 count) raw shrimp, shelled* and de-veined, (if you want, keep the tail on for an attractive presentation)\n" +
                "•\t2 tablespoons extra virgin olive oil\n" +
                "•\t2-3 tablespoons butter\n" +
                "•\tSalt\n" +
                "•\t3-4 garlic cloves, slivered, or 1 Tbsp minced garlic\n" +
                "•\t1/4 to 1/2 teaspoon red pepper flakes (less or more to taste)\n" +
                "•\t1/2 cup white wine (I recommend a dry white wine such as a Sauvignon Blanc)\n" +
                "•\t2 tablespoons finely chopped parsley\n" +
                "•\tFreshly ground black pepper to taste\n" +
                "•\t1 tablespoon lemon juice\n" +
                "\n", "1 Sauté garlic, red pepper flakes, in butter and olive oil: Heat a sauté pan on high heat then reduce to medium high heat. Swirl the butter and olive oil into the pan. After the butter melts it will foam up a bit then subside. If using unsalted butter, sprinkle a little salt in the pan. Stir in the slivered garlic and red pepper flakes.\n" +
                "\n" +
                "2 Add shrimp and wine: Sauté the garlic for just a minute, until it begins to brown at the edges, then add the shrimp.\n" +
                "Add the wine and stir to coat the shrimp with the sauce of butter, oil, and wine.\n" +
                "Move the shrimp so they are in an even layer in the pan. Increase the heat to high and boil the wine for two to three minutes.\n" +
                "\n" +
                "3 Turn shrimp over to cook on the other side: Stir the shrimp and arrange them so that you turn them over to cook on the other side. Continue to cook on high heat for another minute.\n" +
                "\n" +
                "4 Toss with parsley, lemon juice, pepper: Remove the pan from the heat. Sprinkle the shrimp with parsley, lemon juice, and black pepper, and toss to combine.\n" +
                "\n" +
                "Serve as is, or with crusty bread, over pasta, or over rice (for gluten-free version).\n", R.drawable.f1);

        RecipeDetails recipe2 = new RecipeDetails("INGREDIENTS\n" +
                "1 (12-14-inch) English cucumber, cut into 1-inch chunks\n" +
                "2 fresh peaches, cut into 1-inch chunks\n" +
                "For the vinaigrette:\n" +
                "\n" +
                "2 tablespoons avocado oil or olive oil\n" +
                "1 tablespoon white wine vinegar\n" +
                "Zest of one lime\n" +
                "1 tablespoon fresh-squeezed lime juice\n" +
                "1 tablespoon honey\n" +
                "4 large fresh basil leaves, plus more for garnish\n" +
                "1/8 teaspoon salt or to taste\n" +
                "1/8 teaspoon black pepper, or to taste", "1 Prep the vegetables: Add the chopped peaches and cucumbers to a large bowl.\n" +
                "\n" +
                "Summer peach and cucumber salad is mixed with a spoon.\n" +
                "\n" +
                "2 Make the vinaigrette: In the bowl or a mini food processor or blender, combine the oil, vinegar, lime zest and juice, honey, basil, salt and pepper. Pulse until the basil is finely chopped and the vinaigrette is completely emulsified.\n" +
                "\n" +
                "Ingredients for black pepper basil vinaigrette are being poured into the bowl of a food processor. Food processor with black pepper basil vinaigrette to make a healthy summer peach and cucumber salad.\n" +
                "\n" +
                "3 Dress the produce: Pour the vinaigrette over the peach and cucumber mixture. Stir to coat evenly.\n" +
                "\n" +
                "The bowl of a food processor with black pepper basil vinaigrette is being poured over a bowl of chopped cucumbers and peaches. Hands holding a spoon and mixing chopped cucumbers and peaches to make a refreshing summer salad made with peaches and cucumbers.\n" +
                "\n" +
                "4 Serve: Transfer to a serving platter, garnish with torn basil leaves and serve immediately.\n" +
                "\n" +
                "A plate of peach and cucumber salad with a black pepper and basil vinaigrette pooling on the plate.\n" +
                "\n" +
                "Hello! All photos and content are copyright protected. Please do not use our photos without prior written permission. Thank you!", R.drawable.f2);
        RecipeDetails recipe3 = new RecipeDetails("INGREDIENTS\n" +
                "2-4 boneless, skinless chicken breast halves (1 1/2 pound total), or 4-8 chicken cutlets\n" +
                "1/2 cup flour\n" +
                "1/4 teaspoon salt\n" +
                "Pinch ground black pepper\n" +
                "3 tablespoons grated Parmesan cheese\n" +
                "4 tablespoons extra virgin olive oil\n" +
                "4 tablespoons butter\n" +
                "1/2 cup chicken stock or dry white wine (such as a Sauvignon Blanc)\n" +
                "2 tablespoons lemon juice\n" +
                "1/4 cup brined capers\n" +
                "2 tablespoons fresh chopped parsley", "1 Prepare chicken cutlets, pound them thin: To make chicken cutlets, slice the chicken breast halves horizontally, butterflying them open. If the breast pieces you are working with are large, you may want to cut them each into two pieces.\n" +
                "\n" +
                "\n" +
                "\n" +
                "If the pieces are still thick after butterflying, put them between two pieces of plastic wrap and pound them with a meat hammer to 1/4-inch thickness.\n" +
                "\n" +
                "2 Dredge cutlets in seasoned flour with Parmesan: Mix together the flour, salt, pepper, and grated Parmesan. Rinse the chicken pieces in water. Dredge them thoroughly in the flour mixture, until well coated.\n" +
                "\n" +
                " \n" +
                "\n" +
                "3 Brown cutlets in butter and oil: Heat olive oil and 2 tablespoons of the butter in a large skillet on medium high heat. Add half of the chicken pieces, do not crowd the pan. Brown well on each side, about 3 minutes per side. Remove the chicken from the pan and reserve to a plate.\n" +
                "\n" +
                "Cook the other breasts in the same manner, remove from pan. Place the breasts on a rack over a roasting pan and keep warm in a 225°F oven while you prepare the sauce.\n" +
                "\n" +
                " \n" +
                "\n" +
                "4 Add stock or wine, lemon juice, capers, reduce by half, stir in butter: Add the chicken stock or white wine, lemon juice, and capers to the pan. Use a spatula to scrape up the browned bits. Reduce the sauce by half.\n" +
                "\n" +
                "Whisk in the remaining 2 tablespoons of butter.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Plate the chicken and serve with the sauce poured over the chicken. Sprinkle with parsley.", R.drawable.f3);
        RecipeDetails recipe4 = new RecipeDetails("INGREDIENTS\n" +
                "1 egg\n" +
                "1/2 cup room temperature water\n" +
                "Salt and pepper to taste", "1 Prep the egg: Put 1/2 cup room temperature water in a microwave-safe mug. Crack the egg into the water.\n" +
                "\n" +
                "2 Microwave the mug: Put the mug in the microwave and microwave on HIGH power for 30 seconds. Take out the mug and peek inside; you want the whites to be opaque, and the yolk to be still on the runny side. If the whites are still clear, put the mug back in the microwave for another 10 to 60 seconds.\n" +
                "How long it takes to cook the egg to your liking depends primarily on the wattage of your microwave. You’ll need to play around a bit. The time can vary a lot!\n" +
                "\n" +
                "3 Let the mug sit: Let the cooked egg sit in the mug of hot water for 1 minute, or longer if needed. This helps firm up any soft parts of the egg white, giving you a more evenly poached egg.\n" +
                "\n" +
                "4 Drain the egg: Using a spoon or fork, gently lift the egg out of the mug and set it on a slice of stale bread or a paper towel. Sprinkle with salt and pepper, then transfer to your serving plate and enjoy.\n", R.drawable.f4);
        RecipeDetails recipe5 = new RecipeDetails("INGREDIENTS\n" +
                "1 1/2 to 2 pounds (680 to 900g) salmon fillets\n" +
                "3 tablespoons honey mustard (1 1/2 tablespoons honey plus 1 1/2 tablespoon Dijon mustard)\n" +
                "3 cloves garlic, minced (about 3 teaspoons)\n" +
                "3 tablespoons extra virgin olive oil (divided into 2 tablespoons and 1 tablespoon)\n" +
                "1 tablespoon lemon juice\n" +
                "1 tablespoon chopped fresh dill\n" +
                "Pinch of salt", "1 Preheat the oven to 400°F.\n" +
                "\n" +
                "2 Make the honey-mustard glaze: In a small bowl, whisk together the honey mustard, garlic, 2 tablespoons of the olive oil, lemon juice, dill, and salt.\n" +
                "\n" +
                "3 Prep the salmon: Line a roasting pan with aluminum foil. Brush the salmon fillets on both sides with olive oil. Place fillets skin-side down (if your fillets have skin-on) on the foil-lined pan. Use a basting brush to coat the top side of the fillets with the honey mustard mixture.\n" +
                " \n" +
                "4 Bake the salmon: Place in oven and bake at 400°F for 8 to 10 minutes, until just barely cooked through (please don't overcook salmon!). It's okay if the salmon is still a little rare in the center, when you remove it from the oven, the residual heat will cook it through.\n", R.drawable.f5);
        RecipeDetails recipe6 = new RecipeDetails("INGREDIENTS\n" +
                "\n" +
                "•\t1 1/2 pound flank steak\n" +
                "•\tSalt\n" +
                "•\tFreshly ground black pepper\n" +
                "•\tDry mustard\n" +
                "•\tSoftened butter\n", "1 Tenderize the steak with shallow cuts: Remove the steak from the refrigerator a half hour before cooking.\n" +
                "Cut away any tough connective tissue on the surface of the steak.\n" +
                "Using the tip of a sharp knife, poke small cuts into the meat, almost all the way through. The cuts should be at an angle, in the direction of the grain of the meat as the knife tip is going in. The cuts should be about an inch apart from each other.\n" +
                "Turn the steak over and repeat the cuts on the other side. Make sure that the cuts you are making on this side are parallel with the cuts you made on the other side, otherwise you may cut across an existing cut, and end up poking a hole through the meat.\n" +
                " \n" +
                "2 Rub with salt, pepper, dry mustard, and butter: Sprinkle one side of the steak with salt and freshly ground pepper. Sprinkle the steak with dry mustard. (You can use regular mustard if you don't have any dry mustard.)\n" +
                "Rub a tablespoon of butter all over the side of the steak. Turn the steak over and repeat with the dry mustard, pepper, and butter.\n" +
                "\n" +
                "3 Sear steak in hot frying pan: Heat a large cast iron frying pan on high heat. Place steak in hot pan. Let sear for 2 to 3 minutes until well browned.\n" +
                " \n" +
                "Use tongs to lift up to see if nicely browned. If so, flip to the other side and let sear for 2 to 3 minutes.\n" +
                " \n" +
                "4 Remove from heat: Remove the pan from the heat and let the steak continue to cook for 5 to 10 minutes in the residual heat of the pan (assuming you are using cast iron, if not, lower the heat to low).\n" +
                "\n" +
                "5 Check for doneness: Use your fingertips to check for doneness or insert a meat thermometer into the thickest part of the steak - 120°F for very rare, 125°F for rare, or 130°F for medium rare. Flank steak should be served rare or medium rare, otherwise it may be too dry.\n" +
                "If the steak isn't done enough to your liking, return the steak and pan to medium high heat for a few minutes.\n" +
                "6 Let the steak rest: Remove the steak from the pan to a cutting board and let rest for 10 minutes, covered with aluminum foil.\n" +
                "7 Thinly slice: Cut the meat in very thin slices, at an angle, across the grain of the meat. (This way you break through the tough long muscle fibers.)\n" +
                "\n" +
                "8 Boil juices, deglaze pan, add butter to make sauce: Any juices that come out of the meat while cutting or resting, return to the pan. Return the pan to a burner on high heat and deglaze the pan with a little water, scraping up any browned bits. Once the water has mostly boiled down, add a little butter to the pan for a nice sauce.\n" +
                "Arrange the cut meat on a serving plate and pour the deglazed pan juices over the meat.\n" +
                "\n", R.drawable.f6);
        RecipeDetails recipe7 = new RecipeDetails("INGREDIENTS\n" +
                "Salt\n" +
                "4 ounces bow tie (farfalle), linguini, or spaghetti pasta\n" +
                "2 tablespoons extra virgin olive oil (plus more)\n" +
                "1/2 medium onion, chopped\n" +
                "Pinch chili pepper flakes\n" +
                "1 (6-ounce) can tuna packed in olive oil, drained\n" +
                "1 tablespoon capers\n" +
                "1/4 teaspoon salt\n" +
                "1/4 cup dry white wine\n" +
                "2 tablespoons chopped flat leaf parsley\n" +
                "Freshly ground black pepper", "1 Cook the pasta: Bring a large pot of water to a boil, add salt (1 1/2 teaspoons for every quart of water), return to a boil. Add the pasta and cook according to package directions until cooked through, but still firm (al dente).\n" +
                "\n" +
                "2 Cook the onions and chili pepper flakes: While the water is coming to a boil and the pasta is cooking, prepare the rest of the recipe. In a large, wide sauté pan, heat a couple tablespoons of olive oil on medium heat. Add the chopped onion and chili pepper flakes and cook until translucent, about 5 minutes or so.\n" +
                "\n" +
                "3 Mix in the canned tuna, the capers, and the salt. Add the wine, bring to a simmer then lower the heat to low. Cook for 10 minutes or longer, while the pasta is cooking. If the mixture begins to dry out, add a little more wine.\n" +
                "\n" +
                "4 Add the drained pasta to the tuna mixture: When the pasta is ready, drain it and add it in to the pan with the tuna. Toss to mix.\n" +
                "\n" +
                "Drizzle on a bit more olive oil over it all, then add the chopped parsley and a few grinds of black pepper to taste.", R.drawable.f7);

        recipeDetails.add(recipe1);
        recipeDetails.add(recipe2);
        recipeDetails.add(recipe3);
        recipeDetails.add(recipe4);
        recipeDetails.add(recipe5);
        recipeDetails.add(recipe6);
        recipeDetails.add(recipe7);
    }

    private void setOnClickListener() {
        listener = new RecyclerViewAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent intent = new Intent(getApplicationContext(), Recipe.class);

            }
        };
    }
}
