package com.example.photoeditorpro;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;


import java.io.File;
import java.io.IOException;

import static android.R.attr.x;
import static android.R.attr.y;

import com.example.photoeditorpro.tools.Constants;


public class SaveActivity extends AppCompatActivity {

    private ImageView mImageView;
    Bitmap mBitmap;
    Uri myUri;
    Button fb, insta, what, share, save, back;
    RelativeLayout fbll, install, whatll, sharell;
    String path;


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.save_activity);


        AdAdmob adAdmob = new AdAdmob(this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.bannerAd), this);
        adAdmob.FullscreenAd(this);




        fb = (Button) findViewById(R.id.facebook);
        insta = (Button) findViewById(R.id.insta);
        what = (Button) findViewById(R.id.whatsup);
        share = (Button) findViewById(R.id.share);
        save = (Button) findViewById(R.id.done);
        back = (Button) findViewById(R.id.back);

        fbll = (RelativeLayout) findViewById(R.id.facebookll);
        install = (RelativeLayout) findViewById(R.id.install);
        whatll = (RelativeLayout) findViewById(R.id.whatsupll);
        sharell = (RelativeLayout) findViewById(R.id.sharell);
        mImageView = (ImageView) findViewById(R.id.mainImageView);
        Intent in = getIntent();
        BitmapFactory.Options option = new BitmapFactory.Options();
        option.inPreferredConfig = Bitmap.Config.ARGB_8888;
        path = in.getStringExtra("path");
        Log.e("path", path);


        mBitmap = BitmapFactory.decodeFile(path);


        try {
            mBitmap = Constants.getBitmapFromUri(this, Uri.parse("file://" + path), mBitmap.getWidth(), mBitmap.getWidth());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.e("bitmap11", "" + mBitmap);
        mImageView.setImageURI(Uri.parse(path));
        myUri = Uri.parse(path);
        sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.parse("file://" + path)));

        save.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.i("TAG", "touched down");

                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.i("TAG", "moving: (" + x + ", " + y + ")");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.i("TAG", "touched up");

                        saveImageBtnClicked();

                        break;
                }
                return false;
            }
        });
        back.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.i("TAG", "touched down");

                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.i("TAG", "moving: (" + x + ", " + y + ")");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.i("TAG", "touched up");

                        backk();

                        break;
                }
                return false;
            }
        });


        fb.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.i("TAG", "touched down");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.i("TAG", "moving: (" + x + ", " + y + ")");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.i("TAG", "touched up");

                        facebook();
                        break;
                }
                return false;
            }
        });

        what.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.i("TAG", "touched down");

                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.i("TAG", "moving: (" + x + ", " + y + ")");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.i("TAG", "touched up");
                        whatsup();
                        break;
                }
                return false;
            }
        });

        insta.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.i("TAG", "touched down");

                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.i("TAG", "moving: (" + x + ", " + y + ")");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.i("TAG", "touched up");
                        instagram();
                        break;
                }
                return false;
            }
        });

        share.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.i("TAG", "touched down");

                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.i("TAG", "moving: (" + x + ", " + y + ")");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.i("TAG", "touched up");
                        share();
                        break;
                }
                return false;
            }
        });


    }


    @Override
    protected void onDestroy() {

        super.onDestroy();
    }

    @Override
    public void onPause() {

        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();

    }


    public void saveImageBtnClicked() {

        sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.parse("file://" + path)));
        Toast.makeText(this, "save image", Toast.LENGTH_SHORT).show();
        finish();
        startActivity(new Intent(SaveActivity.this, MainActivitty.class));
    }


    public void backk() {
        File fdelete = new File(myUri.getPath());
        if (fdelete.exists()) {
            if (fdelete.delete()) {
                System.out.println("file Deleted :" + myUri.getPath());
            } else {
                System.out.println("file not Deleted :" + myUri.getPath());
            }
        }
        finish();

    }

    public void facebook() {

        final Uri data = FileProvider.getUriForFile(SaveActivity.this, getPackageName() + ".fileprovider", new File(path));
        SaveActivity.this.grantUriPermission(SaveActivity.this.getPackageName(), data, Intent.
                FLAG_GRANT_READ_URI_PERMISSION);
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.setType("image/*");
        sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Image");
        sendIntent.setPackage("com.facebook.katana");
        sendIntent.putExtra(Intent.EXTRA_STREAM, data);
        sendIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        sendIntent.putExtra("android.intent.extra.TEXT", getResources().getString(R.string.app_name));
        SaveActivity.this.startActivity(Intent.createChooser(sendIntent, "Share Image:"));
    }

    public void instagram() {

        final Uri data = FileProvider.getUriForFile(SaveActivity.this, getPackageName() + ".fileprovider", new File(path));
        SaveActivity.this.grantUriPermission(SaveActivity.this.getPackageName(), data, Intent.
                FLAG_GRANT_READ_URI_PERMISSION);
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.setType("image/*");
        sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Image");
        sendIntent.setPackage("com.instagram.android");
        sendIntent.putExtra(Intent.EXTRA_STREAM, data);
        sendIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        sendIntent.putExtra("android.intent.extra.TEXT", getResources().getString(R.string.app_name));
        SaveActivity.this.startActivity(Intent.createChooser(sendIntent, "Share Image:"));

    }

    public void whatsup() {
        final Uri data = FileProvider.getUriForFile(SaveActivity.this, getPackageName() + ".fileprovider", new File(path));
        SaveActivity.this.grantUriPermission(SaveActivity.this.getPackageName(), data, Intent.
                FLAG_GRANT_READ_URI_PERMISSION);
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.setType("image/*");
        sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Image");
        sendIntent.setPackage("com.whatsapp");
        sendIntent.putExtra(Intent.EXTRA_STREAM, data);
        sendIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        sendIntent.putExtra("android.intent.extra.TEXT", getResources().getString(R.string.app_name));
        SaveActivity.this.startActivity(Intent.createChooser(sendIntent, "Share Image:"));
    }

    public void share() {

        final Uri data = FileProvider.getUriForFile(SaveActivity.this, getPackageName() + ".fileprovider", new File(path));
        SaveActivity.this.grantUriPermission(SaveActivity.this.getPackageName(), data, Intent.
                FLAG_GRANT_READ_URI_PERMISSION);
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.setType("image/*");
        sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Image");
        sendIntent.putExtra(Intent.EXTRA_STREAM, data);
        sendIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        sendIntent.putExtra("android.intent.extra.TEXT", getResources().getString(R.string.app_name));
        SaveActivity.this.startActivity(Intent.createChooser(sendIntent, "Share Image:"));

    }

}
