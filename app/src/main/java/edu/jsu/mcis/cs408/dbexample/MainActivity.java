package edu.jsu.mcis.cs408.dbexample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import edu.jsu.mcis.cs408.dbexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getAllContacts();
            }
        });

    }

    public void getAllContacts() {
        DatabaseHandler db = new DatabaseHandler(this, null, null, 1);
        String contacts = db.getAllContacts();
        binding.output.setText(contacts);
    }

}