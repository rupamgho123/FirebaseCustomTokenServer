package com.foodvite.firebaseadmin.demo;

import java.util.concurrent.atomic.AtomicLong;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.tasks.OnSuccessListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by rupam.ghosh on 02/09/17.
 */

@RestController
public class FirebaseController {

    @RequestMapping("/token")
    public FirebaseToken token(@RequestParam(value="userId", defaultValue="World") String userId) {
        final FirebaseToken token = new FirebaseToken("");
        FirebaseAuth.getInstance().createCustomToken(userId).addOnSuccessListener(new OnSuccessListener<String>(){
            @Override
            public void onSuccess(String customToken){
                token.setToken(customToken);
           }
        });
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return token;
    }
}
