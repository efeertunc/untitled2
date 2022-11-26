/*
import Models.Account;
import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.*;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.database.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class deneme3 {
    static ArrayList<Account> playerArrayList = new ArrayList<>();


    public static void main(String[] args) {
        FileInputStream serviceAccount;
        {
            try {
                serviceAccount = new FileInputStream("src/main/java/comp302-4de74-firebase-adminsdk-yfz83-9552d14b68.json");
                FirebaseOptions options = new FirebaseOptions.Builder()
                        .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                        .build();
                FirebaseApp.initializeApp(options);

                DatabaseReference ref = FirebaseDatabase
                        .getInstance("https://comp302-4de74-default-rtdb.firebaseio.com/")
                        .getReference("users");
                ref.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        Account res = dataSnapshot.getValue(Account.class);
                        System.out.println(res.ID);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
/////////////////////////////////
        Firestore db = FirestoreClient.getFirestore();
        DocumentReference docRef = db.collection("bora-4de74").document("alovelace");
        Map<String, Object> data = new HashMap<>();

        data.put("bora", "Ada");
        data.put("bora", "Lovelace");
        data.put("bora", 1815);
        ApiFuture<WriteResult> result = docRef.set(data);

        ListUsersPage page = null;
        try {
            page = FirebaseAuth.getInstance().listUsers(null);
        } catch (FirebaseAuthException e) {
            e.printStackTrace();
        }
        while (page != null) {
            for (ExportedUserRecord user : page.getValues()) {
                System.out.println("User: " + user.getUid());
            }
            page = page.getNextPage();
        }
        try {
            //controlUser();
            System.out.println("Update time : " + result.get().getUpdateTime());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
///////////////////////////////////////////

        DatabaseReference mDatabaseUsername = FirebaseDatabase.getInstance("https://comp302-4de74-default-rtdb.firebaseio.com").getReference();
        String id = mDatabaseUsername.child("users").push().getKey();
        Account player = new Account("bb", "bbbbbbb", "reerere@aaa.aaa", id);

        mDatabaseUsername.child("users").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String username = (String) dataSnapshot.child("username").getValue();
                String email = (String) dataSnapshot.child("email").getValue();
                String id = (String) dataSnapshot.child("id").getValue();
                String password = (String) dataSnapshot.child("password").getValue();
                System.out.println(username + " " + email + " " + id + " "+ password);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        //createUser(mDatabaseUsername, player);
        //controlUser();



///////////////////////////////////////////////
    }

    public static void createUser(DatabaseReference mDatabase, Account player) {
        mDatabase.child("users").child(player.ID).setValueAsync(player);

        UserRecord.CreateRequest request = new UserRecord.CreateRequest()
                .setUid(player.ID)
                .setEmail(player.hint)
                .setPassword(player.password);

        UserRecord userRecord = null;
        try {
            userRecord = FirebaseAuth.getInstance().createUser(request);
        } catch (FirebaseAuthException e) {
            e.printStackTrace();
        }
        for (Account player1: playerArrayList){
            System.out.println(player1.ID);
        }
        System.out.println("Successfully created new user: " + userRecord.getUid());
    }

    public static void controlUser(){
        final FirebaseDatabase database = FirebaseDatabase.getInstance("https://comp302-4de74-default-rtdb.firebaseio.com");
        DatabaseReference ref = database.getReference().child("users");

        //DatabaseReference mDatabaseUsername = FirebaseDatabase.getInstance("https://comp302-4de74-default-rtdb.firebaseio.com").getReference("users");
        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot d: dataSnapshot.getChildren()){
                    Account player = d.getValue(Account.class);
                    System.out.println(player.username);
                    playerArrayList.add(player);
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }


}

*/
