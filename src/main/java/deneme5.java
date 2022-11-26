/*
import Models.Account;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class deneme5 {
    static ArrayList<Account> playerArrayList = new ArrayList<>();

    public static void main(String[] args) {
        FileInputStream serviceAccount;
        {
            try {
                serviceAccount = new FileInputStream("src/main/java/comp302-4de74-firebase-adminsdk-yfz83-9552d14b68.json");
                FirebaseOptions options = new FirebaseOptions.Builder()
                        .setCredentials(GoogleCredentials.fromStream(serviceAccount)).setDatabaseUrl("https://comp302-4de74-default-rtdb.firebaseio.com")
                        .build();
                FirebaseApp.initializeApp(options);


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        DatabaseReference mDatabaseUsername = FirebaseDatabase.getInstance("https://comp302-4de74-default-rtdb.firebaseio.com").getReference();
        mDatabaseUsername.child("users").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot d: dataSnapshot.getChildren()){
                    Account player =  d.getValue(Account.class);
                    System.out.println(player.username);
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });





    }

}

*/
