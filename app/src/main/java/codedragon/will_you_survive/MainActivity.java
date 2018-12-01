package codedragon.will_you_survive;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int surviveTheApocalypse = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This is the method to check all the answers when submit button is pressed.

    public void submitAnswers(View view) {

        //Allows user to enter name for end of quiz message.

        final EditText nameText = findViewById(R.id.name_for_quiz);
        Editable enterNameForQuiz = nameText.getEditableText();

        //Checks the answer to the first question - REALIZATION.

        RadioButton realizationWeapon;
        realizationWeapon = findViewById(R.id.realization_weapon);
        realizationWeapon.isChecked();
        if (realizationWeapon.isChecked()) {
            surviveTheApocalypse = surviveTheApocalypse + 5;
        }

        //Checks the answer to the second question - WEAPONS.

        CheckBox weaponsBat;
        weaponsBat = findViewById(R.id.weapons_bat);
        weaponsBat.isChecked();
        if (weaponsBat.isChecked()) {
            surviveTheApocalypse = surviveTheApocalypse + 5;
        }

        CheckBox weaponsGun;
        weaponsGun = findViewById(R.id.weapons_gun);
        weaponsGun.isChecked();
        if (weaponsGun.isChecked()) {
            surviveTheApocalypse = surviveTheApocalypse + 5;
        }

        CheckBox weaponsCrowbar;
        weaponsCrowbar = findViewById(R.id.weapons_crowbar);
        weaponsCrowbar.isChecked();
        if (weaponsCrowbar.isChecked()) {
            surviveTheApocalypse = surviveTheApocalypse + 5;
        }

        CheckBox weaponsKnife;
        weaponsKnife = findViewById(R.id.weapons_knife);
        weaponsKnife.isChecked();
        if (weaponsKnife.isChecked()) {
            surviveTheApocalypse = surviveTheApocalypse + 5;
        }

        CheckBox weaponsKatana;
        weaponsKatana = findViewById(R.id.weapons_katana);
        weaponsKatana.isChecked();
        if (weaponsKatana.isChecked()) {
            surviveTheApocalypse = surviveTheApocalypse + 5;
        }

        //Checks the answer to the third question - SAFE.

        RadioButton safeBunker;
        safeBunker = findViewById(R.id.safe_bunker);
        safeBunker.isChecked();
        if (safeBunker.isChecked()) {
            surviveTheApocalypse = surviveTheApocalypse + 5;
        }

        //Checks the answer to the fourth question - VEHICLES.

        CheckBox vehiclesTank;
        vehiclesTank = findViewById(R.id.vehicles_tank);
        vehiclesTank.isChecked();
        if (vehiclesTank.isChecked()) {
            surviveTheApocalypse = surviveTheApocalypse + 5;
        }

        CheckBox vehiclesArmored;
        vehiclesArmored = findViewById(R.id.vehicles_armored);
        vehiclesArmored.isChecked();
        if (vehiclesArmored.isChecked()) {
            surviveTheApocalypse = surviveTheApocalypse + 5;
        }

        CheckBox vehiclesJeep;
        vehiclesJeep = findViewById(R.id.vehicles_jeep);
        vehiclesJeep.isChecked();
        if (vehiclesJeep.isChecked()) {
            surviveTheApocalypse = surviveTheApocalypse + 5;
        }

        CheckBox vehiclesMonster;
        vehiclesMonster = findViewById(R.id.vehicles_monster);
        vehiclesMonster.isChecked();
        if (vehiclesMonster.isChecked()) {
            surviveTheApocalypse = surviveTheApocalypse + 5;
        }

        CheckBox vehiclesSports;
        vehiclesSports = findViewById(R.id.vehicles_sports);
        vehiclesSports.isChecked();
        if (vehiclesSports.isChecked()) {
            surviveTheApocalypse = surviveTheApocalypse + 5;
        }

        //Checks the answer to the fifth question - TRUST.

        RadioButton trustNoOne;
        trustNoOne = findViewById(R.id.trust_no_one);
        trustNoOne.isChecked();
        if (trustNoOne.isChecked()) {
            surviveTheApocalypse = surviveTheApocalypse + 5;
        }

        //Checks the answer to the sixth question - BITTEN.

        //This button goes towards survival.

        RadioButton bittenShoot;
        bittenShoot = findViewById(R.id.bitten_shoot);
        bittenShoot.isChecked();
        if (bittenShoot.isChecked()) {
            surviveTheApocalypse = surviveTheApocalypse + 5;
        }

        //Checks the answer to the seventh question - SUPPLIES.

        CheckBox suppliesJerky;
        suppliesJerky = findViewById(R.id.supplies_jerky);
        suppliesJerky.isChecked();
        if (suppliesJerky.isChecked()) {
            surviveTheApocalypse = surviveTheApocalypse + 5;
        }

        CheckBox suppliesSeeds;
        suppliesSeeds = findViewById(R.id.supplies_seeds);
        suppliesSeeds.isChecked();
        if (suppliesSeeds.isChecked()) {
            surviveTheApocalypse = surviveTheApocalypse + 5;
        }

        CheckBox suppliesProtein;
        suppliesProtein = findViewById(R.id.supplies_protein);
        suppliesProtein.isChecked();
        if (suppliesProtein.isChecked()) {
            surviveTheApocalypse = surviveTheApocalypse + 5;
        }

        CheckBox suppliesRations;
        suppliesRations = findViewById(R.id.supplies_rations);
        suppliesRations.isChecked();
        if (suppliesRations.isChecked()) {
            surviveTheApocalypse = surviveTheApocalypse + 5;
        }

        CheckBox suppliesWater;
        suppliesWater = findViewById(R.id.supplies_water);
        suppliesWater.isChecked();
        if (suppliesWater.isChecked()) {
            surviveTheApocalypse = surviveTheApocalypse + 5;
        }

        //Checks the answer to the seventh question - DEATH TO THE ZOMBIE!

        RadioButton deathBrain;
        deathBrain = findViewById(R.id.death_brain);
        deathBrain.isChecked();
        if (deathBrain.isChecked()) {
            surviveTheApocalypse = surviveTheApocalypse + 5;
        }

        //Survival message displays if user selects correct amount of answers.

        Context context = getApplicationContext();
        CharSequence text = enterNameForQuiz + " you have a " + String.valueOf(surviveTheApocalypse) + "% chance of surviving the zombie apocalypse.";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        //Sets the submit button to gone and replaces with try again button.

        final Button submitButton;
        final Button resetButton;
        submitButton = findViewById(R.id.submit);
        resetButton = findViewById(R.id.reset);
        submitButton.setVisibility(View.GONE);
        resetButton.setVisibility(View.VISIBLE);

        //Resets the activity.

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resetActivity = new Intent(MainActivity.this, MainActivity.class);
                startActivity(resetActivity);
                finish();
            }
        });
    }
}

