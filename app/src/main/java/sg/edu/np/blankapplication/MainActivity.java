package sg.edu.np.blankapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public class User{
        String name;
        String description;
        int id;
        boolean followed;

        public User(String n, String d, int i, boolean f){
            name=n;
            description=d;
            id=i;
            followed=f;
        }
    }
    User user1 = new User("Tommy","My name is tommy, I am a student at Ngee Ann Polytechnic",123456,false);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView nameTextView = (TextView) findViewById(R.id.nameTextView);
        nameTextView.setText(user1.name);
        TextView descriptionTextView = (TextView) findViewById(R.id.descriptionTextView);
        descriptionTextView.setText(user1.description);
        Button followButton = (Button) findViewById(R.id.followButton);
        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user1.followed){
                    user1.followed=false;
                    followButton.setText("Follow");
                    //v.setText("Follow");
                }else{
                    user1.followed=true;
                    followButton.setText("Unfollow");
                    //v.setText("Unfollow");
                }
            }
        });
    }

}