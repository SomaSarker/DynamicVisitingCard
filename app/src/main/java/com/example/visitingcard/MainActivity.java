package com.example.visitingcard;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView callIcon = findViewById(R.id.imageView2);
        callIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Phone number to dial
                String phoneNumber = "01962744006";

                // Create an Intent with the action and phone number
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phoneNumber));

                // Start the dialer activity
                startActivity(intent);
            }
        });

        // ...


        ImageView emailIcon = findViewById(R.id.imageView3);
        emailIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Email address to send the email
                String emailAddress = "sarkersoma95@gmail.com";

                // Create an Intent to send an email using the "mailto" scheme
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:" + emailAddress));

                // You can add subject and body to the email if needed
                // intent.putExtra(Intent.EXTRA_SUBJECT, "Email Subject");
                // intent.putExtra(Intent.EXTRA_TEXT, "Email Body");

                // Check if there is an app that can handle the intent
                if (intent.resolveActivity(getPackageManager()) != null) {
                    // Start the email activity
                    startActivity(intent);
                }
            }
        });

        ImageView webIcon = findViewById(R.id.imageView4);
        webIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Website URL to open
                String websiteUrl = "https://www.mobileappdev.com";

                // Create an Intent with the action and website URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(websiteUrl));

                // Check if there is an app that can handle the intent
                if (intent.resolveActivity(getPackageManager()) != null) {
                    // Start the web browser activity to open the website
                    startActivity(intent);
                }
            }
        });

        // ...

        TextView phoenixText = findViewById(R.id.textView);
        phoenixText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Website URL to open when "Phoenix" is clicked
                String phoenixWebsiteUrl = "https://www.phoenix.com/"; // Replace with your desired website URL

                // Create an Intent with the action and website URL
                Intent phoenixWebIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(phoenixWebsiteUrl));

                // Check if there is an app that can handle the intent
                if (phoenixWebIntent.resolveActivity(getPackageManager()) != null) {
                    // Start the web browser activity to open the website
                    startActivity(phoenixWebIntent);
                }
            }
        });

        ImageView companyLogo = findViewById(R.id.imageView);
        companyLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Website URL to open when the company logo is clicked
                String companyWebsiteUrl = "https://www.phoenix.com/";

                // Create an Intent with the action and website URL
                Intent companyWebIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(companyWebsiteUrl));

                // Check if there is an app that can handle the intent
                if (companyWebIntent.resolveActivity(getPackageManager()) != null) {
                    // Start the web browser activity to open the website
                    startActivity(companyWebIntent);
                }
            }
        });

        TextView phoneNumberText = findViewById(R.id.textView4);
        phoneNumberText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Phone number to dial
                String phoneNumber = "01962744006";

                // Create an Intent with the action and phone number
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phoneNumber));

                // Start the dialer activity
                startActivity(intent);
            }
        });

        TextView emailAddressText = findViewById(R.id.textView5);
        emailAddressText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Email address to open in the Gmail app
                String emailAddress = "sarkersoma95@gmail.com";

                // Create an Intent to send an email using the "mailto" scheme
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:" + emailAddress));

                // You can add subject and body to the email if needed
                // intent.putExtra(Intent.EXTRA_SUBJECT, "Email Subject");
                // intent.putExtra(Intent.EXTRA_TEXT, "Email Body");

                // Check if there is an app that can handle the intent
                if (intent.resolveActivity(getPackageManager()) != null) {
                    // Start the email activity
                    startActivity(intent);
                }
            }
        });

        TextView websiteAddressText = findViewById(R.id.textView6);
        websiteAddressText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Website URL to open
                String websiteUrl = "https://www.mobileappdev.com";

                // Create an Intent with the action and website URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(websiteUrl));

                // Check if there is an app that can handle the intent
                if (intent.resolveActivity(getPackageManager()) != null) {
                    // Start the web browser activity to open the website
                    startActivity(intent);
                }
            }
        });
    }
}


        // ...

