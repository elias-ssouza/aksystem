package com.darkgreen.aksystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class EforgetActivity extends AppCompatActivity {

    private AutoCompleteTextView mEmailView;
    private View mProgressView;
    private View mLoginFormView;
    private LoginActivity.UserLoginTask mAuthTask = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eforget);

        mEmailView = (AutoCompleteTextView) findViewById(R.id.email);
        populateAutoComplete();

                Button mEmailSignInButton = (Button) findViewById(R.id.email_sign_in_button);
        mEmailSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EforgetActivity.this, ForgotActivity.class);
                startActivity(intent);
                attemptLogin();
            }
            })
    }
    private void attemptLogin() {
        if (mAuthTask != null) {
            return;
        }
    }



    String email = mEmailView.getText().toString();
    boolean cancel = false;
    View focusView = null;

            if (TextUtils.isEmpty(email)) {
        mEmailView.setError(getString(R.string.error_field_required));
        focusView = mEmailView;
        cancel = true;
    } else if (!isEmailValid(email)) {
        mEmailView.setError(getString(R.string.error_invalid_email));
        focusView = mEmailView;
        cancel = true;


        private boolean isEmailValid(String email) {
            //TODO: Replace this with your own logic
            return email.contains("@");
        }


    }