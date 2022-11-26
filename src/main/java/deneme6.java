/*
import Models.Account;
import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.*;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.database.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutionException;

public class deneme6 {
    static ArrayList<Account> playerArrayList = new ArrayList<>();


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FileInputStream serviceAccount;
        {
            try {
                serviceAccount = new FileInputStream("src/main/java/comp302-4de74-firebase-adminsdk-yfz83-9552d14b68.json");
                FirebaseOptions options = new FirebaseOptions.Builder()
                        .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                        .build();
                FirebaseApp.initializeApp(options);


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Login için 0, Register için 1 i tuşlayın.");
        int login = scanner.nextInt();
        if (login ==0){
            Scanner scannerUsername = new Scanner(System.in);
            Scanner scannerPassword = new Scanner(System.in);
            System.out.println("Username: ");
            String username = scannerUsername.nextLine();
            System.out.println("Password: ");
            String password = scannerPassword.nextLine();
            if (username!= null && password!= null){
                if (login(username, password)){
                    System.out.println("Login Başarılı");
                }else {
                    System.out.println("Lütfen bilgilerinizi kontrol edip tekrar deneyin");
                }
            }
        }
        else if (login == 1){
            Scanner scannerUsername = new Scanner(System.in);
            Scanner scannerPassword = new Scanner(System.in);
            Scanner scannerHint = new Scanner(System.in);
            System.out.println("Username: ");
            String username = scannerUsername.nextLine();
            System.out.println("Password: ");
            String password = scannerPassword.nextLine();
            System.out.println("Hint: ");
            String hint = scannerHint.nextLine();
            createUser(username, password,hint);
        }
}

    private static void createUser(String username, String password, String hint) {
        Firestore db = FirestoreClient.getFirestore();
        DatabaseReference mDatabaseUsername = FirebaseDatabase.getInstance("https://comp302-4de74-default-rtdb.firebaseio.com").getReference();
        String id = mDatabaseUsername.child("users").push().getKey();
        Account player = new Account(username, password, hint, id);

        for (Account player1 : readData()){
            if (player1.username.equals(player.username)){
                System.out.println("Username kullanımda. Lütfen başka bir username seçiniz.");
                return;
            }
        }

        DocumentReference docRef = db.collection("users").document(id);
        ApiFuture<WriteResult> result = docRef.set(player);
        try {
            System.out.println("Update time : " + result.get().getUpdateTime());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        return;
    }

    private static boolean login(String username, String password) {
        boolean login = false;
        for (Account player : readData()){
            if (player.username.equals(username) && player.password.equals(password)){
                login = true;
                return login;
            }
        }
        return login;
    }

    public static ArrayList<Account> readData(){
    Firestore db = FirestoreClient.getFirestore();

    ApiFuture<QuerySnapshot> query = db.collection("users").get();
    QuerySnapshot querySnapshot = null;
    try {
        querySnapshot = query.get();
    } catch (InterruptedException e) {
        e.printStackTrace();
    } catch (ExecutionException e) {
        e.printStackTrace();
    }

    List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
    for (QueryDocumentSnapshot document : documents) {
        Account player = new Account(document.getString("username"), document.getString("password"),document.getString("hint"),document.getId());
        playerArrayList.add(player);
    }

    return playerArrayList;


}

}

*/
