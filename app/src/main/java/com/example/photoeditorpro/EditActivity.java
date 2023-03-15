package com.example.photoeditorpro;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Environment;
import android.provider.MediaStore;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.ScriptIntrinsicConvolve3x3;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.core.content.FileProvider;
import androidx.core.graphics.ColorUtils;

import com.example.photoeditorpro.EraseView;
import com.example.photoeditorpro.R;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EditActivity extends Activity {

    static int rotcount;
    private TextView addpic_ic;
    private RelativeLayout addpic_rel;

    public TextView adjust_ic;

    public TextView adjust_progress_txt;

    public RelativeLayout adjust_rel;

    public HorizontalScrollView adjust_scroll;

    public TextView adjust_txt;

    public TextView alphapic_ic;

    public RelativeLayout alphapic_rel;

    public TextView alphapic_txt;

    public FrameLayout basics;

    public RelativeLayout basics_all;

    public ImageView bg_transparent;

    public Bitmap bitmap;

    public TextView bitmap_height;

    public TextView bitmap_width;

    public TextView black;

    public TextView blur_ic;

    public ImageView blur_picture;

    public RelativeLayout blur_rel;

    public TextView blur_txt;

    public Bitmap blurbitmap;

    public TextView brightness_ic;

    public RelativeLayout brightness_rel;

    public TextView brightness_txt;
    private TextView cancel_btn;

    public TextView car_hint_txt;

    public SeekBar collage_alpha;

    public TextView collage_ic;

    public SeekBar collage_pensize;

    public TextView collage_progress_txt;

    public RelativeLayout collage_rel;

    public SeekBar collage_rotate;

    public SeekBar collage_scale;

    public HorizontalScrollView collage_scroll;

    public TextView collage_txt;

    public TextView colorize_ic;

    public ImageView colorize_picture;

    public RelativeLayout colorize_rel;

    public TextView colorize_txt;
    private TextView compare_txt;

    public TextView contrast_ic;

    public RelativeLayout contrast_rel;

    public TextView contrast_txt;

    public TextView crop_ic;

    public TextView crop_progress_txt;

    public RelativeLayout crop_rel;

    public HorizontalScrollView crop_scroll;

    public TextView crop_txt;

    public TextView custom_ar_ic;
    private RelativeLayout custom_ar_rel;

    public TextView custom_ar_txt;

    public FrameLayout custom_aspect;

    public ImageView direktload_view;

    public TextView done_custom;


    private TextView f118e0;


    public ImageView f119e1;

    public ImageView e10;

    public ImageView e11;

    public ImageView e12;

    public ImageView e13;

    public ImageView e14;

    public ImageView e15;

    public ImageView e16;

    public ImageView e17;

    public ImageView e18;

    public ImageView e19;


    public ImageView f120e2;

    public ImageView e20;

    public ImageView e21;

    public ImageView e22;

    public ImageView e23;

    public ImageView e24;

    public ImageView e25;

    public ImageView e26;

    public ImageView e27;

    public ImageView e28;

    public ImageView e29;


    public ImageView f121e3;

    public ImageView e30;

    public ImageView e31;

    public ImageView e32;

    public ImageView e33;

    public ImageView e34;

    public ImageView e35;

    public ImageView e36;

    public ImageView e37;

    public ImageView e38;

    public ImageView e39;


    public ImageView f122e4;

    public ImageView e40;

    public ImageView e41;

    public ImageView e42;

    public ImageView e43;

    public ImageView e44;

    public ImageView e45;

    public ImageView e46;

    public ImageView e47;

    public ImageView e48;

    public ImageView e49;


    public ImageView f123e5;

    public ImageView e50;


    public ImageView f124e6;


    public ImageView f125e7;


    public ImageView f126e8;


    public ImageView f127e9;

    public SeekBar effect_alpha;

    public TextView effect_ic;

    public TextView effect_progress_txt;

    public RelativeLayout effect_rel;

    public HorizontalScrollView effect_scroll;

    public TextView effect_txt;

    public ImageView effect_view;

    public RelativeLayout erase_move_all;
    private Bitmap erasebitmap;

    public EraseView eraseview;

    public TextView erot1;

    public TextView erot10;

    public TextView erot11;

    public TextView erot12;

    public TextView erot13;

    public TextView erot14;

    public TextView erot15;

    public TextView erot16;

    public TextView erot17;

    public TextView erot18;

    public TextView erot19;

    public TextView erot2;

    public TextView erot20;

    public TextView erot21;

    public TextView erot22;

    public TextView erot23;

    public TextView erot24;

    public TextView erot25;

    public TextView erot26;

    public TextView erot27;

    public TextView erot28;

    public TextView erot29;

    public TextView erot3;

    public TextView erot30;

    public TextView erot31;

    public TextView erot32;

    public TextView erot33;

    public TextView erot34;

    public TextView erot35;

    public TextView erot36;

    public TextView erot37;

    public TextView erot38;

    public TextView erot39;

    public TextView erot4;

    public TextView erot40;

    public TextView erot41;

    public TextView erot42;

    public TextView erot43;

    public TextView erot44;

    public TextView erot45;

    public TextView erot46;

    public TextView erot47;

    public TextView erot48;

    public TextView erot49;

    public TextView erot5;

    public TextView erot50;

    public TextView erot6;

    public TextView erot7;

    public TextView erot8;

    public TextView erot9;

    public FrameLayout exit;


    private TextView f128f0;


    public ImageView f129f1;

    public ImageView f10;

    public ImageView f11;

    public ImageView f12;

    public ImageView f13;

    public ImageView f14;

    public ImageView f15;

    public ImageView f16;

    public ImageView f17;

    public ImageView f18;

    public ImageView f19;


    public ImageView f130f2;

    public ImageView f20;

    public ImageView f21;

    public ImageView f22;

    public ImageView f23;

    public ImageView f24;

    public ImageView f25;

    public ImageView f26;

    public ImageView f27;

    public ImageView f28;

    public ImageView f29;


    public ImageView f131f3;

    public ImageView f30;

    public ImageView f31;

    public ImageView f32;

    public ImageView f33;

    public ImageView f34;

    public ImageView f35;

    public ImageView f36;


    public ImageView f132f4;


    public ImageView f133f5;


    public ImageView f134f6;


    public ImageView f135f7;


    public ImageView f136f8;


    public ImageView f137f9;

    public TextView fade_ic;

    public ImageView fade_picture;

    public RelativeLayout fade_rel;

    public TextView fade_txt;

    public SeekBar filter_alpha;

    public TextView filter_ic;

    public ImageView filter_picture;

    public ImageView filter_picture_bg;

    public TextView filter_progress_txt;

    public RelativeLayout filter_rel;

    public HorizontalScrollView filter_scroll;

    public TextView filter_txt;

    public RelativeLayout filtered_rel;

    public TextView flip_ic;

    public RelativeLayout flip_off;

    public RelativeLayout flip_on;

    public TextView flip_txt;

    public TextView fon1;

    public TextView fon10;

    public TextView fon11;

    public TextView fon12;

    public TextView fon13;

    public TextView fon14;

    public TextView fon15;

    public TextView fon16;

    public TextView fon17;

    public TextView fon18;

    public TextView fon19;

    public TextView fon2;

    public TextView fon20;

    public TextView fon21;

    public TextView fon22;

    public TextView fon23;

    public TextView fon24;

    public TextView fon25;

    public TextView fon26;

    public TextView fon27;

    public TextView fon28;

    public TextView fon29;

    public TextView fon3;

    public TextView fon30;

    public TextView fon31;

    public TextView fon32;

    public TextView fon33;

    public TextView fon34;

    public TextView fon35;
    public TextView fon36;

    public TextView fon4;

    public TextView fon5;

    public TextView fon6;

    public TextView fon7;

    public TextView fon8;

    public TextView fon9;

    public TextView grain_ic;

    public ImageView grain_picture;

    public RelativeLayout grain_rel;

    public TextView grain_txt;

    public Bitmap grainbitmap;

    public ImageView gridview;

    public TextView highlights_ic;

    public ImageView highlights_picture;

    public RelativeLayout highlights_rel;

    public TextView highlights_txt;

    public EditText hpx;
    TextWatcher hpx_textWatcher = new TextWatcher() {
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (EditActivity.this.hpx.getText().length() > 0) {
                int hpx_number = Integer.parseInt(EditActivity.this.hpx.getText().toString());
                if (hpx_number <= 39 || hpx_number >= 5001) {
                    EditActivity.this.done_custom.setEnabled(false);
                    EditActivity.this.done_custom.setTextColor(Color.parseColor("#636365"));
                    EditActivity.this.car_hint_txt.setTextColor(Color.parseColor("#06EFFF"));
                    EditActivity.this.wpx.setEnabled(false);
                    return;
                }
                EditActivity.this.done_custom.setEnabled(true);
                EditActivity.this.done_custom.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.car_hint_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.wpx.setEnabled(true);
            }
        }

        public void afterTextChanged(Editable s) {
        }
    };

    public TextView hsl1_txt;

    public TextView hsl2_txt;

    public TextView hsl3_txt;

    public TextView hsl4_txt;

    public TextView hsl_1;

    public TextView hsl_2;

    public TextView hsl_3;

    public TextView hsl_4;

    public TextView hsl_5;

    public TextView hsl_6;

    public SeekBar hsl_hue_1;

    public SeekBar hsl_hue_2;

    public SeekBar hsl_hue_3;

    public SeekBar hsl_hue_4;

    public SeekBar hsl_hue_5;

    public SeekBar hsl_hue_6;

    public TextView hsl_ic;

    public SeekBar hsl_lightness_1;

    public SeekBar hsl_lightness_2;

    public SeekBar hsl_lightness_3;

    public SeekBar hsl_lightness_4;

    public SeekBar hsl_lightness_5;

    public SeekBar hsl_lightness_6;

    public SeekBar hsl_overlap_1;

    public SeekBar hsl_overlap_2;

    public SeekBar hsl_overlap_3;

    public SeekBar hsl_overlap_4;

    public SeekBar hsl_overlap_5;

    public SeekBar hsl_overlap_6;

    public ImageView hsl_picture1;

    public ImageView hsl_picture2;

    public ImageView hsl_picture3;

    public ImageView hsl_picture4;

    public ImageView hsl_picture5;

    public ImageView hsl_picture6;

    public TextView hsl_progress_txt1;

    public TextView hsl_progress_txt2;

    public TextView hsl_progress_txt3;

    public TextView hsl_progress_txt4;

    public RelativeLayout hsl_rel;

    public TextView hsl_saturation;

    public SeekBar hsl_saturation_1;

    public SeekBar hsl_saturation_2;

    public SeekBar hsl_saturation_3;

    public SeekBar hsl_saturation_4;

    public SeekBar hsl_saturation_5;

    public SeekBar hsl_saturation_6;

    public TextView hsl_txt;

    public Bitmap hslbitmap;

    public SeekBar image_fade_set;

    public SeekBar image_grain_set;

    public SeekBar image_highlights_set;

    public SeekBar image_hue_set;

    public SeekBar image_shadows_set;

    public SeekBar imageblur_set;

    public SeekBar imagebrightness_set;

    public SeekBar imagecontrast_set;

    public SeekBar imagerotate_set;

    public SeekBar imagesaturation_set;

    public SeekBar imagescale_xy_set;

    public SeekBar imagesharp_set;

    public TextView load_icon;

    public RelativeLayout load_rel;


    public RelativeLayout main_layout;
    float[] matrix_sharpen = {-1.0f, -1.0f, -1.0f, -1.0f, 9.0f, -1.0f, -1.0f, -1.0f, -1.0f};

    public TextView menu_txt;

    public ImageView mergedimg;

    public TextView mirror_ic;

    public RelativeLayout mirror_off;

    public RelativeLayout mirror_on;

    public TextView mirror_txt;

    public TextView modify_h_ic;

    public RelativeLayout modify_h_rel;

    public SeekBar modify_h_set;

    public TextView modify_h_txt;

    public TextView modify_v_ic;

    public RelativeLayout modify_v_rel;

    public SeekBar modify_v_set;

    public TextView modify_v_txt;

    public ImageView move_dot_empty;

    public ImageView move_dot_erase;

    public ImageView move_dot_picture;

    public RelativeLayout move_picture;

    public TextView move_txt_off;

    public TextView move_txt_on;

    public TextView movepic_ic;

    public TextView movepic_txt;
    private TextView norate_btn;

    public TextView original_ic;
    private RelativeLayout original_rel;

    public TextView original_txt;

    public TextView pensize_ic;

    public RelativeLayout pensize_rel;

    public TextView pensize_txt;

    public ImageView picture;

    public RelativeLayout preview_layout;
    private TextView quit_btn;

    public TextView rate_btn;
    private TextView rate_count;

    public RelativeLayout rate_rel;
    private TextView redo_ic;

    public RelativeLayout redo_rel;

    public TextView reset_adjust;

    public TextView reset_collage;

    public TextView reset_crop;

    public TextView reset_effect;

    public TextView reset_filter;

    public TextView reset_hsl;
    private TextView resets_bg;

    public Bitmap resizedbitmap;
    private TextView restart_txt;

    public TextView rotate360_ic;

    public RelativeLayout rotate360_rel;

    public TextView rotate360_txt;
    private TextView rotate_count;
    private TextView rotate_m_ic;
    private RelativeLayout rotate_m_rel;
    private TextView rotate_p_ic;
    private RelativeLayout rotate_p_rel;

    public TextView rotatepic360_ic;

    public RelativeLayout rotatepic_rel;

    public TextView rotatepic_txt;

    public TextView saturation_ic;

    public RelativeLayout saturation_rel;

    public TextView saturation_txt;

    public TextView save_txt;

    public TextView savecustom_txt;

    public TextView scalepic_ic;

    public RelativeLayout scalepic_rel;

    public TextView scalepic_txt;

    public FrameLayout seekbars;

    public RelativeLayout seekbars_adjust;

    public TextView seekbars_adjust_bg;

    public RelativeLayout seekbars_collage;

    public TextView seekbars_collage_bg;

    public RelativeLayout seekbars_crop;

    public TextView seekbars_crop_bg;

    public RelativeLayout seekbars_effect;

    public TextView seekbars_effect_bg;

    public RelativeLayout seekbars_filter;

    public TextView seekbars_filter_bg;

    public RelativeLayout seekbars_hsl;

    public TextView seekbars_hsl_bg;

    public FrameLayout set_adjust;

    public FrameLayout set_collage;

    public FrameLayout set_crop;

    public FrameLayout set_effect;

    public FrameLayout set_filter;

    public FrameLayout set_hsl;

    public FrameLayout set_picture;

    public TextView shadows_ic;

    public ImageView shadows_picture;

    public RelativeLayout shadows_rel;

    public TextView shadows_txt;

    public ImageView sharp_picture;

    public TextView sharpen_ic;

    public RelativeLayout sharpen_rel;

    public TextView sharpen_txt;
    private Uri source1;
    private Uri source2;

    public TextView square_ic;
    private RelativeLayout square_rel;

    public TextView square_txt;

    public CountDownTimer t_add_a;

    public CountDownTimer t_add_b;

    public CountDownTimer t_adjust_gone;

    public CountDownTimer t_adjust_set;

    public CountDownTimer t_center_erase;

    public CountDownTimer t_center_img;

    public CountDownTimer t_compare_set;

    public CountDownTimer t_crop_gone;

    public CountDownTimer t_crop_set;

    public CountDownTimer t_effect_rot;

    public CountDownTimer t_erase_preset;

    public CountDownTimer t_erase_set;

    public CountDownTimer t_exit;

    public CountDownTimer t_filter_preset;

    public CountDownTimer t_filter_unset;

    public CountDownTimer t_hsl_gone;

    public CountDownTimer t_hsl_set;

    public CountDownTimer t_load_enable;

    public CountDownTimer t_menu_gone;

    public CountDownTimer t_menu_set;

    public CountDownTimer t_rate;

    public CountDownTimer t_save;

    public CountDownTimer t_savecustom;

//    public CountDownTimer t_start_set;

    public CountDownTimer t_start_setpic;

    public ImageView temp_picture;
    private TextView undo_ic;

    public RelativeLayout undo_rel;

    public RelativeLayout value_rel;

    public TextView value_txt;

    public FrameLayout views;

    public EditText wpx;
    TextWatcher wpx_textWatcher = new TextWatcher() {
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (EditActivity.this.wpx.getText().length() > 0) {
                int wpx_number = Integer.parseInt(EditActivity.this.wpx.getText().toString());
                if (wpx_number <= 39 || wpx_number >= 5001) {
                    EditActivity.this.done_custom.setEnabled(false);
                    EditActivity.this.done_custom.setTextColor(Color.parseColor("#636365"));
                    EditActivity.this.car_hint_txt.setTextColor(Color.parseColor("#06EFFF"));
                    EditActivity.this.hpx.setEnabled(false);
                    return;
                }
                EditActivity.this.done_custom.setEnabled(true);
                EditActivity.this.done_custom.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.car_hint_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.hpx.setEnabled(true);
            }
        }

        public void afterTextChanged(Editable s) {
        }
    };

    public TextView zoom_ic;

    public RelativeLayout zoom_rel;

    public TextView zoom_txt;


    public void onCreate(Bundle savedInstanceState) {
        Uri uri;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.picture);
        
        AdAdmob adAdmob = new AdAdmob(this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.bannerAd), this);

        Button image = findViewById(R.id.image);
        Typeface icon_font = Typeface.createFromAsset(getAssets(), "fonts/FLicons.ttf");
        this.redo_ic = (TextView) findViewById(R.id.redo_ic);
        this.undo_ic = (TextView) findViewById(R.id.undo_ic);
        this.compare_txt = (TextView) findViewById(R.id.compare_txt);
        this.resets_bg = (TextView) findViewById(R.id.resets_bg);
        this.menu_txt = (TextView) findViewById(R.id.menu_txt);
        this.restart_txt = (TextView) findViewById(R.id.restart_txt);
        this.save_txt = (TextView) findViewById(R.id.save_txt);
        this.savecustom_txt = (TextView) findViewById(R.id.savecustom_txt);
        this.crop_ic = (TextView) findViewById(R.id.crop_ic);
        this.adjust_ic = (TextView) findViewById(R.id.adjust_ic);
        this.hsl_ic = (TextView) findViewById(R.id.hsl_ic);
        this.filter_ic = (TextView) findViewById(R.id.filter_ic);
        this.effect_ic = (TextView) findViewById(R.id.effect_ic);
        this.collage_ic = (TextView) findViewById(R.id.collage_ic);
        this.zoom_ic = (TextView) findViewById(R.id.zoom_ic);
        this.rotate360_ic = (TextView) findViewById(R.id.rotate360_ic);
        this.rotate_m_ic = (TextView) findViewById(R.id.rotate_m_ic);
        this.rotate_p_ic = (TextView) findViewById(R.id.rotate_p_ic);
        this.modify_h_ic = (TextView) findViewById(R.id.modify_h_ic);
        this.modify_v_ic = (TextView) findViewById(R.id.modify_v_ic);
        this.mirror_ic = (TextView) findViewById(R.id.mirror_ic);
        this.flip_ic = (TextView) findViewById(R.id.flip_ic);
        this.original_ic = (TextView) findViewById(R.id.original_ic);
        this.square_ic = (TextView) findViewById(R.id.square_ic);
        this.brightness_ic = (TextView) findViewById(R.id.brightness_ic);
        this.contrast_ic = (TextView) findViewById(R.id.contrast_ic);
        this.grain_ic = (TextView) findViewById(R.id.grain_ic);
        this.saturation_ic = (TextView) findViewById(R.id.saturation_ic);
        this.colorize_ic = (TextView) findViewById(R.id.colorize_ic);
        this.highlights_ic = (TextView) findViewById(R.id.highlights_ic);
        this.shadows_ic = (TextView) findViewById(R.id.shadows_ic);
        this.fade_ic = (TextView) findViewById(R.id.fade_ic);
        this.blur_ic = (TextView) findViewById(R.id.blur_ic);
        this.sharpen_ic = (TextView) findViewById(R.id.sharpen_ic);
        this.addpic_ic = (TextView) findViewById(R.id.addpic_ic);
        this.movepic_ic = (TextView) findViewById(R.id.movepic_ic);
        this.pensize_ic = (TextView) findViewById(R.id.pensize_ic);
        this.alphapic_ic = (TextView) findViewById(R.id.alphapic_ic);
        this.scalepic_ic = (TextView) findViewById(R.id.scalepic_ic);
        this.rotatepic360_ic = (TextView) findViewById(R.id.rotatepic360_ic);
        this.custom_ar_ic = (TextView) findViewById(R.id.custom_ar_ic);
        this.hsl_1 = (TextView) findViewById(R.id.hsl_1);
        this.hsl_2 = (TextView) findViewById(R.id.hsl_2);
        this.hsl_3 = (TextView) findViewById(R.id.hsl_3);
        this.hsl_4 = (TextView) findViewById(R.id.hsl_4);
        this.hsl_5 = (TextView) findViewById(R.id.hsl_5);
        this.hsl_6 = (TextView) findViewById(R.id.hsl_6);
        this.done_custom = (TextView) findViewById(R.id.done_custom);
        this.crop_txt = (TextView) findViewById(R.id.crop_txt);
        this.adjust_txt = (TextView) findViewById(R.id.adjust_txt);
        this.hsl_txt = (TextView) findViewById(R.id.hsl_txt);
        this.filter_txt = (TextView) findViewById(R.id.filter_txt);
        this.effect_txt = (TextView) findViewById(R.id.effect_txt);
        this.collage_txt = (TextView) findViewById(R.id.collage_txt);
        this.reset_crop = (TextView) findViewById(R.id.reset_crop);
        this.reset_adjust = (TextView) findViewById(R.id.reset_adjust);
        this.reset_hsl = (TextView) findViewById(R.id.reset_hsl);
        this.reset_filter = (TextView) findViewById(R.id.reset_filter);
        this.reset_effect = (TextView) findViewById(R.id.reset_effect);
        this.reset_collage = (TextView) findViewById(R.id.reset_collage);
        this.f118e0 = (TextView) findViewById(R.id.e0);
        this.erot1 = (TextView) findViewById(R.id.erot1);
        this.erot2 = (TextView) findViewById(R.id.erot2);
        this.erot3 = (TextView) findViewById(R.id.erot3);
        this.erot4 = (TextView) findViewById(R.id.erot4);
        this.erot5 = (TextView) findViewById(R.id.erot5);
        this.erot6 = (TextView) findViewById(R.id.erot6);
        this.erot7 = (TextView) findViewById(R.id.erot7);
        this.erot8 = (TextView) findViewById(R.id.erot8);
        this.erot9 = (TextView) findViewById(R.id.erot9);
        this.erot10 = (TextView) findViewById(R.id.erot10);
        this.erot11 = (TextView) findViewById(R.id.erot11);
        this.erot12 = (TextView) findViewById(R.id.erot12);
        this.erot13 = (TextView) findViewById(R.id.erot13);
        this.erot14 = (TextView) findViewById(R.id.erot14);
        this.erot15 = (TextView) findViewById(R.id.erot15);
        this.erot16 = (TextView) findViewById(R.id.erot16);
        this.erot17 = (TextView) findViewById(R.id.erot17);
        this.erot18 = (TextView) findViewById(R.id.erot18);
        this.erot19 = (TextView) findViewById(R.id.erot19);
        this.erot20 = (TextView) findViewById(R.id.erot20);
        this.erot21 = (TextView) findViewById(R.id.erot21);
        this.erot22 = (TextView) findViewById(R.id.erot22);
        this.erot23 = (TextView) findViewById(R.id.erot23);
        this.erot24 = (TextView) findViewById(R.id.erot24);
        this.erot25 = (TextView) findViewById(R.id.erot25);
        this.erot26 = (TextView) findViewById(R.id.erot26);
        this.erot27 = (TextView) findViewById(R.id.erot27);
        this.erot28 = (TextView) findViewById(R.id.erot28);
        this.erot29 = (TextView) findViewById(R.id.erot29);
        this.erot30 = (TextView) findViewById(R.id.erot30);
        this.erot31 = (TextView) findViewById(R.id.erot31);
        this.erot32 = (TextView) findViewById(R.id.erot32);
        this.erot33 = (TextView) findViewById(R.id.erot33);
        this.erot34 = (TextView) findViewById(R.id.erot34);
        this.erot35 = (TextView) findViewById(R.id.erot35);
        this.erot36 = (TextView) findViewById(R.id.erot36);
        this.erot37 = (TextView) findViewById(R.id.erot37);
        this.erot38 = (TextView) findViewById(R.id.erot38);
        this.erot39 = (TextView) findViewById(R.id.erot39);
        this.erot40 = (TextView) findViewById(R.id.erot40);
        this.erot41 = (TextView) findViewById(R.id.erot41);
        this.erot42 = (TextView) findViewById(R.id.erot42);
        this.erot43 = (TextView) findViewById(R.id.erot43);
        this.erot44 = (TextView) findViewById(R.id.erot44);
        this.erot45 = (TextView) findViewById(R.id.erot45);
        this.erot46 = (TextView) findViewById(R.id.erot46);
        this.erot47 = (TextView) findViewById(R.id.erot47);
        this.erot48 = (TextView) findViewById(R.id.erot48);
        this.erot49 = (TextView) findViewById(R.id.erot49);
        this.erot50 = (TextView) findViewById(R.id.erot50);

        this.f128f0 = (TextView) findViewById(R.id.f0);
        this.fon1 = (TextView) findViewById(R.id.fon1);
        this.fon2 = (TextView) findViewById(R.id.fon2);
        this.fon3 = (TextView) findViewById(R.id.fon3);
        this.fon4 = (TextView) findViewById(R.id.fon4);
        this.fon5 = (TextView) findViewById(R.id.fon5);
        this.fon6 = (TextView) findViewById(R.id.fon6);
        this.fon7 = (TextView) findViewById(R.id.fon7);
        this.fon8 = (TextView) findViewById(R.id.fon8);
        this.fon9 = (TextView) findViewById(R.id.fon9);
        this.fon10 = (TextView) findViewById(R.id.fon10);
        this.fon11 = (TextView) findViewById(R.id.fon11);
        this.fon12 = (TextView) findViewById(R.id.fon12);
        this.fon13 = (TextView) findViewById(R.id.fon13);
        this.fon14 = (TextView) findViewById(R.id.fon14);
        this.fon15 = (TextView) findViewById(R.id.fon15);
        this.fon16 = (TextView) findViewById(R.id.fon16);
        this.fon17 = (TextView) findViewById(R.id.fon17);
        this.fon18 = (TextView) findViewById(R.id.fon18);
        this.fon19 = (TextView) findViewById(R.id.fon19);
        this.fon20 = (TextView) findViewById(R.id.fon20);
        this.fon21 = (TextView) findViewById(R.id.fon21);
        this.fon22 = (TextView) findViewById(R.id.fon22);
        this.fon23 = (TextView) findViewById(R.id.fon23);
        this.fon24 = (TextView) findViewById(R.id.fon24);
        this.fon25 = (TextView) findViewById(R.id.fon25);
        this.fon26 = (TextView) findViewById(R.id.fon26);
        this.fon27 = (TextView) findViewById(R.id.fon27);
        this.fon28 = (TextView) findViewById(R.id.fon28);
        this.fon29 = (TextView) findViewById(R.id.fon29);
        this.fon30 = (TextView) findViewById(R.id.fon30);
        this.fon31 = (TextView) findViewById(R.id.fon31);
        this.fon32 = (TextView) findViewById(R.id.fon32);
        this.fon33 = (TextView) findViewById(R.id.fon33);
        this.fon34 = (TextView) findViewById(R.id.fon34);
        this.fon35 = (TextView) findViewById(R.id.fon35);
        this.fon36 = (TextView) findViewById(R.id.fon36);
        TextView[] set_icon_font = {this.compare_txt, this.resets_bg, this.restart_txt, this.reset_crop, this.reset_adjust, this.reset_hsl, this.reset_filter, this.reset_effect, this.reset_collage, this.save_txt, this.savecustom_txt, this.crop_ic, this.adjust_ic, this.hsl_ic, this.filter_ic, this.effect_ic, this.collage_ic, this.zoom_ic, this.rotate360_ic, this.rotate_m_ic, this.modify_h_ic, this.modify_v_ic, this.rotate_p_ic, this.mirror_ic, this.flip_ic, this.original_ic, this.square_ic, this.done_custom, this.brightness_ic, this.contrast_ic, this.grain_ic, this.saturation_ic, this.colorize_ic, this.highlights_ic, this.shadows_ic, this.blur_ic, this.sharpen_ic, this.fade_ic, this.addpic_ic, this.movepic_ic, this.pensize_ic, this.alphapic_ic, this.scalepic_ic, this.rotatepic360_ic, this.custom_ar_ic, this.hsl_1, this.hsl_2, this.hsl_3, this.hsl_4, this.hsl_5, this.hsl_6, this.f118e0, this.erot1, this.erot2, this.erot3, this.erot4, this.erot5, this.erot6, this.erot7, this.erot8, this.erot9, this.erot10, this.erot11, this.erot12, this.erot13, this.erot14, this.erot15, this.erot16, this.erot17, this.erot18, this.erot19, this.erot20, this.erot21, this.erot22, this.erot23, this.erot24, this.erot25, this.erot26, this.erot27, this.erot28, this.erot29, this.erot30, this.erot31, this.erot32, this.erot33, this.erot34, this.erot35, this.erot36, this.erot37, this.erot38, this.erot39, this.erot40, this.erot41, this.erot42, this.erot43, this.erot44, this.erot45, this.erot46, this.erot47, this.erot48, this.erot49, this.erot50, this.f128f0, this.fon1, this.fon2, this.fon3, this.fon4, this.fon5, this.fon6, this.fon7, this.fon8, this.fon9, this.fon10, this.fon11, this.fon12, this.fon13, this.fon14, this.fon15, this.fon16, this.fon17, this.fon18, this.fon19, this.fon20, this.fon21, this.fon22, this.fon23, this.fon24, this.fon25, this.fon26, this.fon27, this.fon28, this.fon29, this.fon30, this.fon31, this.fon32, this.fon33, this.fon34, this.fon35,this.fon36, this.redo_ic, this.undo_ic};
        for (TextView tvs_mark : set_icon_font) {
            tvs_mark.setTypeface(icon_font);
        }
        this.load_rel = (RelativeLayout) findViewById(R.id.load_rel);
        this.crop_rel = (RelativeLayout) findViewById(R.id.crop_rel);
        this.adjust_rel = (RelativeLayout) findViewById(R.id.adjust_rel);
        this.hsl_rel = (RelativeLayout) findViewById(R.id.hsl_rel);
        this.filter_rel = (RelativeLayout) findViewById(R.id.filter_rel);
        this.effect_rel = (RelativeLayout) findViewById(R.id.effect_rel);
        this.collage_rel = (RelativeLayout) findViewById(R.id.collage_rel);
        this.exit = (FrameLayout) findViewById(R.id.exit);
        this.black = (TextView) findViewById(R.id.black);
        this.bitmap_width = (TextView) findViewById(R.id.bitmap_width);
        this.bitmap_height = (TextView) findViewById(R.id.bitmap_height);
        this.quit_btn = (TextView) findViewById(R.id.quit_btn);
        this.cancel_btn = (TextView) findViewById(R.id.cancel_btn);
        this.basics = (FrameLayout) findViewById(R.id.basics);
        this.set_picture = (FrameLayout) findViewById(R.id.set_picture);
        this.views = (FrameLayout) findViewById(R.id.views);
        this.set_crop = (FrameLayout) findViewById(R.id.set_crop);
        this.set_adjust = (FrameLayout) findViewById(R.id.set_adjust);
        this.set_hsl = (FrameLayout) findViewById(R.id.set_hsl);
        this.set_filter = (FrameLayout) findViewById(R.id.set_filter);
        this.set_effect = (FrameLayout) findViewById(R.id.set_effect);
        this.set_collage = (FrameLayout) findViewById(R.id.set_collage);
        this.load_icon = (TextView) findViewById(R.id.load_icon);
        this.direktload_view = (ImageView) findViewById(R.id.direktload_view);
        this.gridview = (ImageView) findViewById(R.id.gridview);
        this.bg_transparent = (ImageView) findViewById(R.id.bg_transparent);
        this.picture = (ImageView) findViewById(R.id.picture);
        this.mergedimg = (ImageView) findViewById(R.id.mergedimg);
        this.blur_picture = (ImageView) findViewById(R.id.blur_picture);
        this.sharp_picture = (ImageView) findViewById(R.id.sharp_picture);
        this.grain_picture = (ImageView) findViewById(R.id.grain_picture);
        this.colorize_picture = (ImageView) findViewById(R.id.colorize_picture);
        this.fade_picture = (ImageView) findViewById(R.id.fade_picture);
        this.highlights_picture = (ImageView) findViewById(R.id.highlights_picture);
        this.shadows_picture = (ImageView) findViewById(R.id.shadows_picture);
        this.hsl_picture1 = (ImageView) findViewById(R.id.hsl_picture1);
        this.hsl_picture2 = (ImageView) findViewById(R.id.hsl_picture2);
        this.hsl_picture3 = (ImageView) findViewById(R.id.hsl_picture3);
        this.hsl_picture4 = (ImageView) findViewById(R.id.hsl_picture4);
        this.hsl_picture5 = (ImageView) findViewById(R.id.hsl_picture5);
        this.hsl_picture6 = (ImageView) findViewById(R.id.hsl_picture6);
        this.move_picture = (RelativeLayout) findViewById(R.id.move_picture);
        this.preview_layout = (RelativeLayout) findViewById(R.id.preview_layout);
        this.main_layout = (RelativeLayout) findViewById(R.id.main_layout);
        this.zoom_txt = (TextView) findViewById(R.id.zoom_txt);
        this.rotate360_txt = (TextView) findViewById(R.id.rotate360_txt);
        this.modify_h_txt = (TextView) findViewById(R.id.modify_h_txt);
        this.modify_v_txt = (TextView) findViewById(R.id.modify_v_txt);
        this.mirror_txt = (TextView) findViewById(R.id.mirror_txt);
        this.flip_txt = (TextView) findViewById(R.id.flip_txt);
        this.zoom_rel = (RelativeLayout) findViewById(R.id.zoom_rel);
        this.rotate360_rel = (RelativeLayout) findViewById(R.id.rotate360_rel);
        this.modify_h_rel = (RelativeLayout) findViewById(R.id.modify_h_rel);
        this.modify_v_rel = (RelativeLayout) findViewById(R.id.modify_v_rel);
        this.rotate_m_rel = (RelativeLayout) findViewById(R.id.rotate_m_rel);
        this.rotate_p_rel = (RelativeLayout) findViewById(R.id.rotate_p_rel);
        this.mirror_on = (RelativeLayout) findViewById(R.id.mirror_on);
        this.mirror_off = (RelativeLayout) findViewById(R.id.mirror_off);
        this.flip_on = (RelativeLayout) findViewById(R.id.flip_on);
        this.flip_off = (RelativeLayout) findViewById(R.id.flip_off);
        this.original_txt = (TextView) findViewById(R.id.original_txt);
        this.square_txt = (TextView) findViewById(R.id.square_txt);
        this.original_rel = (RelativeLayout) findViewById(R.id.original_rel);
        this.square_rel = (RelativeLayout) findViewById(R.id.square_rel);
        this.wpx = (EditText) findViewById(R.id.wpx);
        this.wpx.addTextChangedListener(this.wpx_textWatcher);
        this.hpx = (EditText) findViewById(R.id.hpx);
        this.hpx.addTextChangedListener(this.hpx_textWatcher);
        this.car_hint_txt = (TextView) findViewById(R.id.car_hint_txt);
        this.custom_aspect = (FrameLayout) findViewById(R.id.custom_aspect);
        this.custom_ar_rel = (RelativeLayout) findViewById(R.id.custom_ar_rel);
        this.custom_ar_txt = (TextView) findViewById(R.id.custom_ar_txt);
        this.basics_all = (RelativeLayout) findViewById(R.id.basics_all);
        this.crop_scroll = (HorizontalScrollView) findViewById(R.id.crop_scroll);
        this.adjust_scroll = (HorizontalScrollView) findViewById(R.id.adjust_scroll);
        this.filter_scroll = (HorizontalScrollView) findViewById(R.id.filter_scroll);
        this.effect_scroll = (HorizontalScrollView) findViewById(R.id.effect_scroll);
        this.collage_scroll = (HorizontalScrollView) findViewById(R.id.collage_scroll);
        this.seekbars_crop = (RelativeLayout) findViewById(R.id.seekbars_crop);
        this.seekbars_adjust = (RelativeLayout) findViewById(R.id.seekbars_adjust);
        this.seekbars_hsl = (RelativeLayout) findViewById(R.id.seekbars_hsl);
        this.seekbars_filter = (RelativeLayout) findViewById(R.id.seekbars_filter);
        this.seekbars_effect = (RelativeLayout) findViewById(R.id.seekbars_effect);
        this.seekbars_collage = (RelativeLayout) findViewById(R.id.seekbars_collage);
        this.seekbars_crop_bg = (TextView) findViewById(R.id.seekbars_crop_bg);
        this.seekbars_adjust_bg = (TextView) findViewById(R.id.seekbars_adjust_bg);
        this.seekbars_hsl_bg = (TextView) findViewById(R.id.seekbars_hsl_bg);
        this.seekbars_filter_bg = (TextView) findViewById(R.id.seekbars_filter_bg);
        this.seekbars_effect_bg = (TextView) findViewById(R.id.seekbars_effect_bg);
        this.seekbars_collage_bg = (TextView) findViewById(R.id.seekbars_collage_bg);
        this.crop_progress_txt = (TextView) findViewById(R.id.crop_progress_txt);
        this.adjust_progress_txt = (TextView) findViewById(R.id.adjust_progress_txt);
        this.hsl_saturation = (TextView) findViewById(R.id.hsl_saturation);
        this.hsl_progress_txt1 = (TextView) findViewById(R.id.hsl_progress_txt1);
        this.hsl_progress_txt2 = (TextView) findViewById(R.id.hsl_progress_txt2);
        this.hsl_progress_txt3 = (TextView) findViewById(R.id.hsl_progress_txt3);
        this.hsl_progress_txt4 = (TextView) findViewById(R.id.hsl_progress_txt4);
        this.hsl1_txt = (TextView) findViewById(R.id.hsl1_txt);
        this.hsl2_txt = (TextView) findViewById(R.id.hsl2_txt);
        this.hsl3_txt = (TextView) findViewById(R.id.hsl3_txt);
        this.hsl4_txt = (TextView) findViewById(R.id.hsl4_txt);
        this.brightness_rel = (RelativeLayout) findViewById(R.id.brightness_rel);
        this.contrast_rel = (RelativeLayout) findViewById(R.id.contrast_rel);
        this.grain_rel = (RelativeLayout) findViewById(R.id.grain_rel);
        this.saturation_rel = (RelativeLayout) findViewById(R.id.saturation_rel);
        this.colorize_rel = (RelativeLayout) findViewById(R.id.colorize_rel);
        this.highlights_rel = (RelativeLayout) findViewById(R.id.highlights_rel);
        this.shadows_rel = (RelativeLayout) findViewById(R.id.shadows_rel);
        this.fade_rel = (RelativeLayout) findViewById(R.id.fade_rel);
        this.blur_rel = (RelativeLayout) findViewById(R.id.blur_rel);
        this.sharpen_rel = (RelativeLayout) findViewById(R.id.sharpen_rel);
        this.brightness_txt = (TextView) findViewById(R.id.brightness_txt);
        this.contrast_txt = (TextView) findViewById(R.id.contrast_txt);
        this.grain_txt = (TextView) findViewById(R.id.grain_txt);
        this.saturation_txt = (TextView) findViewById(R.id.saturation_txt);
        this.colorize_txt = (TextView) findViewById(R.id.colorize_txt);
        this.highlights_txt = (TextView) findViewById(R.id.highlights_txt);
        this.shadows_txt = (TextView) findViewById(R.id.shadows_txt);
        this.fade_txt = (TextView) findViewById(R.id.fade_txt);
        this.blur_txt = (TextView) findViewById(R.id.blur_txt);
        this.sharpen_txt = (TextView) findViewById(R.id.sharpen_txt);
        this.f119e1 = (ImageView) findViewById(R.id.e1);
        this.f120e2 = (ImageView) findViewById(R.id.e2);
        this.f121e3 = (ImageView) findViewById(R.id.e3);
        this.f122e4 = (ImageView) findViewById(R.id.e4);
        this.f123e5 = (ImageView) findViewById(R.id.e5);
        this.f124e6 = (ImageView) findViewById(R.id.e6);
        this.f125e7 = (ImageView) findViewById(R.id.e7);
        this.f126e8 = (ImageView) findViewById(R.id.e8);
        this.f127e9 = (ImageView) findViewById(R.id.e9);
        this.e10 = (ImageView) findViewById(R.id.e10);
        this.e11 = (ImageView) findViewById(R.id.e11);
        this.e12 = (ImageView) findViewById(R.id.e12);
        this.e13 = (ImageView) findViewById(R.id.e13);
        this.e14 = (ImageView) findViewById(R.id.e14);
        this.e15 = (ImageView) findViewById(R.id.e15);
        this.e16 = (ImageView) findViewById(R.id.e16);
        this.e17 = (ImageView) findViewById(R.id.e17);
        this.e18 = (ImageView) findViewById(R.id.e18);
        this.e19 = (ImageView) findViewById(R.id.e19);
        this.e20 = (ImageView) findViewById(R.id.e20);
        this.e21 = (ImageView) findViewById(R.id.e21);
        this.e22 = (ImageView) findViewById(R.id.e22);
        this.e23 = (ImageView) findViewById(R.id.e23);
        this.e24 = (ImageView) findViewById(R.id.e24);
        this.e25 = (ImageView) findViewById(R.id.e25);
        this.e26 = (ImageView) findViewById(R.id.e26);
        this.e27 = (ImageView) findViewById(R.id.e27);
        this.e28 = (ImageView) findViewById(R.id.e28);
        this.e29 = (ImageView) findViewById(R.id.e29);
        this.e30 = (ImageView) findViewById(R.id.e30);
        this.e31 = (ImageView) findViewById(R.id.e31);
        this.e32 = (ImageView) findViewById(R.id.e32);
        this.e33 = (ImageView) findViewById(R.id.e33);
        this.e34 = (ImageView) findViewById(R.id.e34);
        this.e35 = (ImageView) findViewById(R.id.e35);
        this.e36 = (ImageView) findViewById(R.id.e36);
        this.e37 = (ImageView) findViewById(R.id.e37);
        this.e38 = (ImageView) findViewById(R.id.e38);
        this.e39 = (ImageView) findViewById(R.id.e39);
        this.e40 = (ImageView) findViewById(R.id.e40);
        this.e41 = (ImageView) findViewById(R.id.e41);
        this.e42 = (ImageView) findViewById(R.id.e42);
        this.e43 = (ImageView) findViewById(R.id.e43);
        this.e44 = (ImageView) findViewById(R.id.e44);
        this.e45 = (ImageView) findViewById(R.id.e45);
        this.e46 = (ImageView) findViewById(R.id.e46);
        this.e47 = (ImageView) findViewById(R.id.e47);
        this.e48 = (ImageView) findViewById(R.id.e48);
        this.e49 = (ImageView) findViewById(R.id.e49);
        this.e50 = (ImageView) findViewById(R.id.e50);

        this.effect_view = (ImageView) findViewById(R.id.effect_view);
        this.effect_progress_txt = (TextView) findViewById(R.id.effect_progress_txt);
        this.rotate_count = (TextView) findViewById(R.id.rotate_count);
        this.value_rel = (RelativeLayout) findViewById(R.id.value_rel);
        this.value_txt = (TextView) findViewById(R.id.value_txt);
        this.filtered_rel = (RelativeLayout) findViewById(R.id.filtered_rel);
        this.f129f1 = (ImageView) findViewById(R.id.f1);
        this.f130f2 = (ImageView) findViewById(R.id.f2);
        this.f131f3 = (ImageView) findViewById(R.id.f3);
        this.f132f4 = (ImageView) findViewById(R.id.f4);
        this.f133f5 = (ImageView) findViewById(R.id.f5);
        this.f134f6 = (ImageView) findViewById(R.id.f6);
        this.f135f7 = (ImageView) findViewById(R.id.f7);
        this.f136f8 = (ImageView) findViewById(R.id.f8);
        this.f137f9 = (ImageView) findViewById(R.id.f9);
        this.f10 = (ImageView) findViewById(R.id.f10);
        this.f11 = (ImageView) findViewById(R.id.f11);
        this.f12 = (ImageView) findViewById(R.id.f12);
        this.f13 = (ImageView) findViewById(R.id.f13);
        this.f14 = (ImageView) findViewById(R.id.f14);
        this.f15 = (ImageView) findViewById(R.id.f15);
        this.f16 = (ImageView) findViewById(R.id.f16);
        this.f17 = (ImageView) findViewById(R.id.f17);
        this.f18 = (ImageView) findViewById(R.id.f18);
        this.f19 = (ImageView) findViewById(R.id.f19);
        this.f20 = (ImageView) findViewById(R.id.f20);
        this.f21 = (ImageView) findViewById(R.id.f21);
        this.f22 = (ImageView) findViewById(R.id.f22);
        this.f23 = (ImageView) findViewById(R.id.f23);
        this.f24 = (ImageView) findViewById(R.id.f24);
        this.f25 = (ImageView) findViewById(R.id.f25);
        this.f26 = (ImageView) findViewById(R.id.f26);
        this.f27 = (ImageView) findViewById(R.id.f27);
        this.f28 = (ImageView) findViewById(R.id.f28);
        this.f29 = (ImageView) findViewById(R.id.f29);
        this.f30 = (ImageView) findViewById(R.id.f30);
        this.f31 = (ImageView) findViewById(R.id.f31);
        this.f32 = (ImageView) findViewById(R.id.f32);
        this.f33 = (ImageView) findViewById(R.id.f33);
        this.f34 = (ImageView) findViewById(R.id.f34);
        this.f35 = (ImageView) findViewById(R.id.f35);
        this.f36 = (ImageView) findViewById(R.id.f36);
        this.filter_progress_txt = (TextView) findViewById(R.id.filter_progress_txt);
        this.filter_picture = (ImageView) findViewById(R.id.filter_picture);
        this.filter_picture_bg = (ImageView) findViewById(R.id.filter_picture_bg);
        this.eraseview = (EraseView) findViewById(R.id.eraseview);
        this.addpic_rel = (RelativeLayout) findViewById(R.id.addpic_rel);
        this.temp_picture = (ImageView) findViewById(R.id.temp_picture);
        this.erase_move_all = (RelativeLayout) findViewById(R.id.erase_move_all);
        this.move_dot_erase = (ImageView) findViewById(R.id.move_dot_erase);
        this.movepic_txt = (TextView) findViewById(R.id.movepic_txt);
        this.move_dot_empty = (ImageView) findViewById(R.id.move_dot_empty);
        this.move_txt_on = (TextView) findViewById(R.id.move_txt_on);
        this.move_txt_off = (TextView) findViewById(R.id.move_txt_off);
        this.collage_progress_txt = (TextView) findViewById(R.id.collage_progress_txt);
        this.alphapic_rel = (RelativeLayout) findViewById(R.id.alphapic_rel);
        this.alphapic_txt = (TextView) findViewById(R.id.alphapic_txt);
        this.scalepic_rel = (RelativeLayout) findViewById(R.id.scalepic_rel);
        this.scalepic_txt = (TextView) findViewById(R.id.scalepic_txt);
        this.rotatepic_rel = (RelativeLayout) findViewById(R.id.rotatepic_rel);
        this.rotatepic_txt = (TextView) findViewById(R.id.rotatepic_txt);
        this.pensize_rel = (RelativeLayout) findViewById(R.id.pensize_rel);
        this.pensize_txt = (TextView) findViewById(R.id.pensize_txt);
        this.redo_rel = (RelativeLayout) findViewById(R.id.redo_rel);
        this.undo_rel = (RelativeLayout) findViewById(R.id.undo_rel);
        this.seekbars = (FrameLayout) findViewById(R.id.seekbars);
        this.norate_btn = (TextView) findViewById(R.id.norate_btn);
        this.rate_btn = (TextView) findViewById(R.id.rate_btn);
        this.rate_rel = (RelativeLayout) findViewById(R.id.rate_rel);
        this.rate_count = (TextView) findViewById(R.id.rate_count);
        SharedPreferences ppratecheck = getSharedPreferences("ratecount.txt", 0);
        SharedPreferences.Editor edit_check = ppratecheck.edit();
        int rcount2 = ppratecheck.getInt("ratescore", 0) + 1;
        edit_check.putInt("ratescore", rcount2).commit();
        this.rate_count.setText(String.valueOf(rcount2));
        if (Boolean.valueOf(getSharedPreferences("rate.txt", 0).getBoolean("rate_app", false)).booleanValue()) {
            this.rate_rel.setVisibility(View.INVISIBLE);
        }
        this.t_rate = new CountDownTimer(7000, 1) {
            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                EditActivity.this.rate_rel.setVisibility(View.INVISIBLE);
                EditActivity.this.rate_btn.setVisibility(View.INVISIBLE);
                EditActivity.this.basics.setVisibility(View.VISIBLE);
                EditActivity.this.seekbars.setVisibility(View.VISIBLE);
                EditActivity.this.set_picture.setVisibility(View.VISIBLE);
                EditActivity.this.views.setVisibility(View.VISIBLE);
                EditActivity.this.t_rate.cancel();
            }
        };
        this.norate_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.adjust_rel.performClick();
                EditActivity.this.rate_rel.setVisibility(View.INVISIBLE);
                EditActivity.this.basics.setVisibility(View.VISIBLE);
                EditActivity.this.seekbars.setVisibility(View.VISIBLE);
                EditActivity.this.set_picture.setVisibility(View.VISIBLE);
                EditActivity.this.views.setVisibility(View.VISIBLE);
                SharedPreferences.Editor editor = EditActivity.this.getSharedPreferences("rate.txt", 0).edit();
                editor.putBoolean("rate_app", false);
                editor.commit();
                EditActivity.this.t_rate.cancel();
            }
        });
        this.rate_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("market://details?id=com.petales.color"));
                EditActivity.this.startActivity(intent);
                SharedPreferences.Editor editor = EditActivity.this.getSharedPreferences("rate.txt", 0).edit();
                editor.putBoolean("rate_app", true);
                editor.commit();
                EditActivity.this.t_rate.start();
            }
        });
        this.redo_rel.setEnabled(false);
        this.undo_rel.setEnabled(false);
        this.pensize_rel.setEnabled(false);
        this.rotatepic_rel.setEnabled(false);
        this.alphapic_rel.setEnabled(false);
        this.scalepic_rel.setEnabled(false);
        this.move_txt_on.setEnabled(false);
        this.move_txt_off.setEnabled(false);
        this.reset_collage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                File imgFile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + "/" + getString(R.string.app_name) + "/.cache/cache.png");
                if (imgFile.exists()) {
                    EditActivity.this.eraseview.setImageBitmap(BitmapFactory.decodeFile(imgFile.getAbsolutePath()));
                    EditActivity.this.t_erase_preset.start();
                    EditActivity.this.t_center_erase.start();
                    EditActivity.this.collage_pensize.setProgress(4);
                    EditActivity.this.collage_rotate.setProgress(0);
                    EditActivity.this.collage_alpha.setProgress(100);
                    EditActivity.this.collage_scale.setProgress(100);
                    EditActivity.this.seekbars_collage_bg.setVisibility(View.INVISIBLE);
                    EditActivity.this.collage_progress_txt.setVisibility(View.INVISIBLE);
                    EditActivity.this.reset_collage.setTextColor(Color.parseColor("#636365"));
                    EditActivity.this.move_txt_on.performClick();
                }
            }
        });
        this.redo_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.eraseview.Redo();
            }
        });
        this.undo_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.eraseview.Undo();
            }
        });
        this.t_erase_preset = new CountDownTimer(25, 1) {
            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                EditActivity.this.pensize_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.rotatepic360_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.alphapic_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.scalepic_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.pensize_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.rotatepic_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.alphapic_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.scalepic_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.collage_pensize.setVisibility(View.INVISIBLE);
                EditActivity.this.collage_rotate.setVisibility(View.INVISIBLE);
                EditActivity.this.collage_alpha.setVisibility(View.INVISIBLE);
                EditActivity.this.collage_scale.setVisibility(View.INVISIBLE);
                EditActivity.this.move_txt_on.setEnabled(true);
                EditActivity.this.move_txt_off.setEnabled(true);
                EditActivity.this.redo_rel.setEnabled(true);
                EditActivity.this.undo_rel.setEnabled(true);
                EditActivity.this.pensize_rel.setEnabled(true);
                EditActivity.this.rotatepic_rel.setEnabled(true);
                EditActivity.this.alphapic_rel.setEnabled(true);
                EditActivity.this.scalepic_rel.setEnabled(true);
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                EditActivity.this.t_erase_preset.cancel();
            }
        };
        this.pensize_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_erase_preset.start();
                EditActivity.this.t_erase_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.pensize_ic.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.pensize_txt.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.seekbars_collage_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.collage_progress_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.collage_pensize.setVisibility(View.VISIBLE);
                        EditActivity.this.collage_pensize.setProgress(4);
                        EditActivity.this.pensize_rel.setEnabled(false);
                        EditActivity.this.t_erase_set.cancel();
                    }
                }.start();
            }
        });
        this.collage_pensize = (SeekBar) findViewById(R.id.collage_pensize);
        this.collage_pensize.setMax(99);
        this.collage_pensize.setProgress(4);
        this.collage_pensize.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress + 1));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.eraseview.setBrushSize((float) (progress + 1));
                EditActivity.this.reset_collage.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.rotatepic_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_erase_preset.start();
                EditActivity.this.t_erase_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.rotatepic360_ic.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.rotatepic_txt.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.seekbars_collage_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.collage_progress_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.collage_rotate.setVisibility(View.VISIBLE);
                        EditActivity.this.rotatepic_rel.setEnabled(false);
                        EditActivity.this.t_erase_set.cancel();
                    }
                }.start();
            }
        });
        this.collage_rotate = (SeekBar) findViewById(R.id.collage_rotate);
        this.collage_rotate.setMax(360);
        this.collage_rotate.setProgress(0);
        this.collage_rotate.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress360, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress360));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.erase_move_all.setRotation((float) progress360);
                EditActivity.this.collage_rotate.setProgress(progress360);
                EditActivity.this.reset_collage.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.alphapic_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.eraseview.Undo();
                EditActivity.this.t_erase_preset.start();
                EditActivity.this.t_erase_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.alphapic_ic.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.alphapic_txt.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.seekbars_collage_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.collage_progress_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.collage_alpha.setVisibility(View.VISIBLE);
                        EditActivity.this.alphapic_rel.setEnabled(false);
                        EditActivity.this.t_erase_set.cancel();
                    }
                }.start();
            }
        });
        this.collage_alpha = (SeekBar) findViewById(R.id.collage_alpha);
        this.collage_alpha.setMax(100);
        this.collage_alpha.setProgress(100);
        this.collage_alpha.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.erase_move_all.setAlpha(((float) progress) / 100.0f);
                EditActivity.this.collage_alpha.setProgress(progress);
                EditActivity.this.reset_collage.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.scalepic_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_erase_preset.start();
                EditActivity.this.t_erase_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.scalepic_ic.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.scalepic_txt.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.seekbars_collage_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.collage_progress_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.collage_scale.setVisibility(View.VISIBLE);
                        EditActivity.this.scalepic_rel.setEnabled(false);
                        EditActivity.this.t_erase_set.cancel();
                    }
                }.start();
            }
        });
        this.collage_scale = (SeekBar) findViewById(R.id.collage_scale);
        this.collage_scale.setMax(500);
        this.collage_scale.setProgress(100);
        this.collage_scale.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress_xy, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress_xy));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.erase_move_all.setScaleX(((float) progress_xy) / 100.0f);
                EditActivity.this.erase_move_all.setScaleY(((float) progress_xy) / 100.0f);
                if (((float) progress_xy) < 100.0f) {
                    EditActivity.this.move_dot_erase.setScaleX(1.0f);
                    EditActivity.this.move_dot_erase.setScaleY(1.0f);
                } else {
                    EditActivity.this.move_dot_erase.setScaleX(((float) progress_xy) / 100.0f);
                    EditActivity.this.move_dot_erase.setScaleY(((float) progress_xy) / 100.0f);
                }
                EditActivity.this.collage_scale.setProgress(progress_xy);
                EditActivity.this.reset_collage.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.move_txt_on.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.move_txt_on.setVisibility(View.INVISIBLE);
                EditActivity.this.move_txt_off.setVisibility(View.VISIBLE);
                EditActivity.this.movepic_ic.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.movepic_txt.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.move_dot_empty.setVisibility(View.INVISIBLE);
                EditActivity.this.move_dot_erase.setVisibility(View.VISIBLE);
            }
        });
        this.move_txt_off.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.move_txt_on.setVisibility(View.VISIBLE);
                EditActivity.this.move_txt_off.setVisibility(View.INVISIBLE);
                EditActivity.this.movepic_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.movepic_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.move_dot_empty.setVisibility(View.INVISIBLE);
                EditActivity.this.move_dot_erase.setVisibility(View.INVISIBLE);
            }
        });
        findViewById(R.id.move_dot_empty).setOnTouchListener(new View.OnTouchListener() {
            private GestureDetector gestureDetector;

            {
                this.gestureDetector = new GestureDetector(EditActivity.this, new GestureDetector.SimpleOnGestureListener() {
                    public boolean onDoubleTap(MotionEvent e) {
                        return super.onDoubleTap(e);
                    }
                });
            }

            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                }
                this.gestureDetector.onTouchEvent(event);
                return true;
            }
        });
        this.t_center_erase = new CountDownTimer(100, 1) {
            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                PointF DownPT = new PointF();
                EditActivity.this.erase_move_all.setX((float) ((int) DownPT.x));
                EditActivity.this.erase_move_all.setY((float) ((int) DownPT.x));
                EditActivity.this.move_dot_erase.setX((float) ((int) DownPT.x));
                EditActivity.this.move_dot_erase.setY((float) ((int) DownPT.x));
                new PointF(EditActivity.this.gridview.getX(), EditActivity.this.gridview.getY());
                EditActivity.this.t_center_erase.cancel();
            }
        };
        findViewById(R.id.move_dot_erase).setOnTouchListener(new View.OnTouchListener() {
            PointF DownPT = new PointF();
            PointF StartPT = new PointF();
            private GestureDetector gestureDetector;

            {
                this.gestureDetector = new GestureDetector(EditActivity.this, new GestureDetector.SimpleOnGestureListener() {
                    public boolean onDoubleTap(MotionEvent e) {
                        EditActivity.this.t_center_erase.start();
                        return super.onDoubleTap(e);
                    }
                });
            }

            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case 0:
                        this.DownPT.x = event.getX();
                        this.DownPT.y = event.getY();
                        this.StartPT = new PointF(EditActivity.this.move_dot_erase.getX(), EditActivity.this.move_dot_erase.getY());
                        break;
                    case 2:
                        EditActivity.this.reset_collage.setTextColor(Color.parseColor("#FFFFFF"));
                        PointF mv = new PointF(event.getX() - this.DownPT.x, event.getY() - this.DownPT.y);
                        EditActivity.this.erase_move_all.setX((float) ((int) (this.StartPT.x + mv.x)));
                        EditActivity.this.erase_move_all.setY((float) ((int) (this.StartPT.y + mv.y)));
                        EditActivity.this.move_dot_erase.setX((float) ((int) (this.StartPT.x + mv.x)));
                        EditActivity.this.move_dot_erase.setY((float) ((int) (this.StartPT.y + mv.y)));
                        this.StartPT = new PointF(EditActivity.this.move_dot_erase.getX(), EditActivity.this.move_dot_erase.getY());
                        break;
                }
                this.gestureDetector.onTouchEvent(event);
                return true;
            }
        });
        this.addpic_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.startActivityForResult(Intent.createChooser(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), EditActivity.this.getString(R.string.open_pic)), 2);
            }
        });
        this.f128f0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_set();
                EditActivity.this.reset_filter.performClick();
            }
        });
        this.f129f1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon1.setVisibility(View.VISIBLE);
                        EditActivity.this.f129f1.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setProgress(210);
                EditActivity.this.imagecontrast_set.setProgress(280);
                EditActivity.this.image_grain_set.setProgress(0);
                EditActivity.this.imagesaturation_set.setProgress(285);
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.image_highlights_set.setProgress(27);
                EditActivity.this.image_shadows_set.setProgress(0);
                EditActivity.this.image_fade_set.setProgress(0);
                EditActivity.this.imageblur_set.setProgress(0);
                EditActivity.this.imagesharp_set.setProgress(0);
            }
        });
        this.f130f2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon2.setVisibility(View.VISIBLE);
                        EditActivity.this.f130f2.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setProgress(230);
                EditActivity.this.imagecontrast_set.setProgress(285);
                EditActivity.this.image_grain_set.setProgress(0);
                EditActivity.this.imagesaturation_set.setProgress(240);
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.image_highlights_set.setProgress(10);
                EditActivity.this.image_shadows_set.setProgress(0);
                EditActivity.this.image_fade_set.setProgress(0);
                EditActivity.this.imageblur_set.setProgress(25);
                EditActivity.this.imagesharp_set.setProgress(0);
            }
        });
        this.f131f3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon3.setVisibility(View.VISIBLE);
                        EditActivity.this.f131f3.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setProgress(266);
                EditActivity.this.imagecontrast_set.setProgress(272);
                EditActivity.this.image_grain_set.setProgress(0);
                EditActivity.this.imagesaturation_set.setProgress(290);
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.image_highlights_set.setProgress(0);
                EditActivity.this.image_shadows_set.setProgress(0);
                EditActivity.this.image_fade_set.setProgress(0);
                EditActivity.this.imageblur_set.setProgress(0);
                EditActivity.this.imagesharp_set.setProgress(12);
            }
        });
        this.f132f4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon4.setVisibility(View.VISIBLE);
                        EditActivity.this.f132f4.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setProgress(257);
                EditActivity.this.imagecontrast_set.setProgress(270);
                EditActivity.this.image_grain_set.setProgress(0);
                EditActivity.this.imagesaturation_set.setProgress(245);
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.image_highlights_set.setProgress(60);
                EditActivity.this.image_shadows_set.setProgress(0);
                EditActivity.this.image_fade_set.setProgress(0);
                EditActivity.this.imageblur_set.setProgress(0);
                EditActivity.this.imagesharp_set.setProgress(0);
            }
        });
        this.f133f5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon5.setVisibility(View.VISIBLE);
                        EditActivity.this.f133f5.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setProgress(273);
                EditActivity.this.imagecontrast_set.setProgress(255);
                EditActivity.this.image_grain_set.setProgress(0);
                EditActivity.this.imagesaturation_set.setProgress(276);
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.image_highlights_set.setProgress(0);
                //EditActivity.this.image_shadows_set.setProgress(35);
                EditActivity.this.image_shadows_set.setProgress(36);
                EditActivity.this.image_fade_set.setProgress(0);
                EditActivity.this.imageblur_set.setProgress(0);
                EditActivity.this.imagesharp_set.setProgress(0);
            }
        });
        this.f134f6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon6.setVisibility(View.VISIBLE);
                        EditActivity.this.f134f6.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setProgress(240);
                EditActivity.this.imagecontrast_set.setProgress(275);
                EditActivity.this.image_grain_set.setProgress(0);
                EditActivity.this.imagesaturation_set.setProgress(284);
                EditActivity.this.image_hue_set.setProgress(18);
                EditActivity.this.colorize_picture.setAlpha(0.2f);
                EditActivity.this.image_highlights_set.setProgress(0);
                EditActivity.this.image_shadows_set.setProgress(0);
                EditActivity.this.image_fade_set.setProgress(0);
                EditActivity.this.imageblur_set.setProgress(0);
                EditActivity.this.imagesharp_set.setProgress(0);
            }
        });
        this.f135f7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon7.setVisibility(View.VISIBLE);
                        EditActivity.this.f135f7.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setProgress(255);
                EditActivity.this.imagecontrast_set.setProgress(280);
                EditActivity.this.image_grain_set.setProgress(0);
                EditActivity.this.imagesaturation_set.setProgress(150);
                EditActivity.this.image_hue_set.setProgress(355);
                EditActivity.this.colorize_picture.setAlpha(0.2f);
                EditActivity.this.image_highlights_set.setProgress(0);
                EditActivity.this.image_shadows_set.setProgress(0);
                EditActivity.this.image_fade_set.setProgress(0);
                EditActivity.this.imageblur_set.setProgress(0);
                EditActivity.this.imagesharp_set.setProgress(0);
            }
        });
        this.f136f8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon8.setVisibility(View.VISIBLE);
                        EditActivity.this.f136f8.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setProgress(242);
                EditActivity.this.imagecontrast_set.setProgress(255);
                EditActivity.this.image_grain_set.setProgress(0);
                EditActivity.this.imagesaturation_set.setProgress(300);
                EditActivity.this.image_hue_set.setProgress(217);
                EditActivity.this.colorize_picture.setAlpha(0.2f);
                EditActivity.this.image_highlights_set.setProgress(0);
                EditActivity.this.image_shadows_set.setProgress(0);
                EditActivity.this.image_fade_set.setProgress(0);
                EditActivity.this.imageblur_set.setProgress(0);
                EditActivity.this.imagesharp_set.setProgress(0);
            }
        });
        this.f137f9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon9.setVisibility(View.VISIBLE);
                        EditActivity.this.f137f9.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setProgress(255);
                EditActivity.this.imagecontrast_set.setProgress(280);
                EditActivity.this.image_grain_set.setProgress(0);
                EditActivity.this.imagesaturation_set.setProgress(290);
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.image_highlights_set.setProgress(0);
                EditActivity.this.image_shadows_set.setProgress(0);
                EditActivity.this.image_fade_set.setProgress(68);
                EditActivity.this.imageblur_set.setProgress(0);
                EditActivity.this.imagesharp_set.setProgress(0);
            }
        });
        this.f10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon10.setVisibility(View.VISIBLE);
                        EditActivity.this.f10.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setProgress(220);
                EditActivity.this.imagecontrast_set.setProgress(255);
                EditActivity.this.image_grain_set.setProgress(0);
                EditActivity.this.imagesaturation_set.setProgress(276);
                EditActivity.this.image_hue_set.setProgress(166);
                EditActivity.this.colorize_picture.setAlpha(0.2f);
                EditActivity.this.image_highlights_set.setProgress(0);
                EditActivity.this.image_shadows_set.setProgress(0);
                EditActivity.this.image_fade_set.setProgress(0);
                EditActivity.this.imageblur_set.setProgress(0);
                EditActivity.this.imagesharp_set.setProgress(0);
            }
        });
        this.f11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon11.setVisibility(View.VISIBLE);
                        EditActivity.this.f11.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setProgress(210);
                EditActivity.this.imagecontrast_set.setProgress(280);
                EditActivity.this.image_grain_set.setProgress(0);
                EditActivity.this.imagesaturation_set.setProgress(260);
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.image_highlights_set.setProgress(0);
                EditActivity.this.image_shadows_set.setProgress(0);
                EditActivity.this.image_fade_set.setProgress(100);
                EditActivity.this.imageblur_set.setProgress(0);
                EditActivity.this.imagesharp_set.setProgress(0);
            }
        });
        this.f12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon12.setVisibility(View.VISIBLE);
                        EditActivity.this.f12.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setProgress(270);
                EditActivity.this.imagecontrast_set.setProgress(320);
                EditActivity.this.image_grain_set.setProgress(0);
                EditActivity.this.imagesaturation_set.setProgress(320);
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.image_highlights_set.setProgress(0);
                EditActivity.this.image_shadows_set.setProgress(0);
                EditActivity.this.image_fade_set.setProgress(80);
                EditActivity.this.imageblur_set.setProgress(0);
                EditActivity.this.imagesharp_set.setProgress(30);
            }
        });
        this.f13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon13.setVisibility(View.VISIBLE);
                        EditActivity.this.f13.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setProgress(180);
                EditActivity.this.imagecontrast_set.setProgress(280);
                EditActivity.this.image_grain_set.setProgress(0);
                EditActivity.this.imagesaturation_set.setProgress(150);
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.image_highlights_set.setProgress(0);
                EditActivity.this.image_shadows_set.setProgress(0);
                EditActivity.this.image_fade_set.setProgress(90);
                EditActivity.this.imageblur_set.setProgress(0);
                EditActivity.this.imagesharp_set.setProgress(0);
            }
        });
        this.f14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon14.setVisibility(View.VISIBLE);
                        EditActivity.this.f14.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setProgress(265);
                EditActivity.this.imagecontrast_set.setProgress(290);
                EditActivity.this.image_grain_set.setProgress(0);
                EditActivity.this.imagesaturation_set.setProgress(280);
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.image_highlights_set.setProgress(0);
                EditActivity.this.image_shadows_set.setProgress(0);
                EditActivity.this.image_fade_set.setProgress(80);
                EditActivity.this.imageblur_set.setProgress(0);
                EditActivity.this.imagesharp_set.setProgress(0);
            }
        });
        this.f15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon15.setVisibility(View.VISIBLE);
                        EditActivity.this.f15.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setProgress(235);
                EditActivity.this.imagecontrast_set.setProgress(270);
                EditActivity.this.image_grain_set.setProgress(0);
                EditActivity.this.imagesaturation_set.setProgress(180);
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.image_highlights_set.setProgress(0);
                EditActivity.this.image_shadows_set.setProgress(0);
                EditActivity.this.image_fade_set.setProgress(90);
                EditActivity.this.imageblur_set.setProgress(10);
                EditActivity.this.imagesharp_set.setProgress(0);
            }
        });
        this.f16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon16.setVisibility(View.VISIBLE);
                        EditActivity.this.f16.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setProgress(210);
                EditActivity.this.imagecontrast_set.setProgress(210);
                EditActivity.this.image_grain_set.setProgress(0);
                EditActivity.this.imagesaturation_set.setProgress(280);
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.image_highlights_set.setProgress(0);
                EditActivity.this.image_shadows_set.setProgress(0);
                EditActivity.this.image_fade_set.setProgress(80);
                EditActivity.this.imageblur_set.setProgress(0);
                EditActivity.this.imagesharp_set.setProgress(0);
            }
        });
        this.f17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon17.setVisibility(View.VISIBLE);
                        EditActivity.this.f17.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setProgress(234);
                EditActivity.this.imagecontrast_set.setProgress(220);
                EditActivity.this.image_grain_set.setProgress(40);
                EditActivity.this.imagesaturation_set.setProgress(270);
                EditActivity.this.image_hue_set.setProgress(3);
                EditActivity.this.colorize_picture.setAlpha(0.15f);
                EditActivity.this.image_highlights_set.setProgress(0);
                EditActivity.this.image_shadows_set.setProgress(0);
                EditActivity.this.image_fade_set.setProgress(0);
                EditActivity.this.imageblur_set.setProgress(0);
                EditActivity.this.imagesharp_set.setProgress(0);
            }
        });
        this.f18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon18.setVisibility(View.VISIBLE);
                        EditActivity.this.f18.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setProgress(220);
                EditActivity.this.imagecontrast_set.setProgress(210);
                EditActivity.this.image_grain_set.setProgress(45);
                EditActivity.this.imagesaturation_set.setProgress(276);
                EditActivity.this.image_hue_set.setProgress(232);
                EditActivity.this.colorize_picture.setAlpha(0.15f);
                EditActivity.this.image_highlights_set.setProgress(0);
                EditActivity.this.image_shadows_set.setProgress(0);
                EditActivity.this.image_fade_set.setProgress(0);
                EditActivity.this.imageblur_set.setProgress(0);
                EditActivity.this.imagesharp_set.setProgress(10);
            }
        });
        this.f19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon19.setVisibility(View.VISIBLE);
                        EditActivity.this.f19.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setProgress(200);
                EditActivity.this.imagecontrast_set.setProgress(220);
                EditActivity.this.image_grain_set.setProgress(48);
                EditActivity.this.imagesaturation_set.setProgress(290);
                EditActivity.this.image_hue_set.setProgress(136);
                EditActivity.this.colorize_picture.setAlpha(0.15f);
                EditActivity.this.image_highlights_set.setProgress(0);
                EditActivity.this.image_shadows_set.setProgress(0);
                EditActivity.this.image_fade_set.setProgress(0);
                EditActivity.this.imageblur_set.setProgress(0);
                EditActivity.this.imagesharp_set.setProgress(0);
            }
        });
        this.f20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon20.setVisibility(View.VISIBLE);
                        EditActivity.this.f20.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setProgress(210);
                EditActivity.this.imagecontrast_set.setProgress(220);
                EditActivity.this.image_grain_set.setProgress(60);
                EditActivity.this.imagesaturation_set.setProgress(295);
                EditActivity.this.image_hue_set.setProgress(333);
                EditActivity.this.colorize_picture.setAlpha(0.15f);
                EditActivity.this.image_highlights_set.setProgress(0);
                EditActivity.this.image_shadows_set.setProgress(0);
                EditActivity.this.image_fade_set.setProgress(0);
                EditActivity.this.imageblur_set.setProgress(0);
                EditActivity.this.imagesharp_set.setProgress(0);
            }
        });
        this.f21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon21.setVisibility(View.VISIBLE);
                        EditActivity.this.f21.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setProgress(260);
                EditActivity.this.imagecontrast_set.setProgress(255);
                EditActivity.this.image_grain_set.setProgress(0);
                EditActivity.this.imagesaturation_set.setProgress(0);
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.image_highlights_set.setProgress(0);
                EditActivity.this.image_shadows_set.setProgress(0);
                EditActivity.this.image_fade_set.setProgress(0);
                EditActivity.this.imageblur_set.setProgress(0);
                EditActivity.this.imagesharp_set.setProgress(0);
            }
        });
        this.f22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon22.setVisibility(View.VISIBLE);
                        EditActivity.this.f22.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setProgress(270);
                EditActivity.this.imagecontrast_set.setProgress(270);
                EditActivity.this.image_grain_set.setProgress(20);
                EditActivity.this.imagesaturation_set.setProgress(0);
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.image_highlights_set.setProgress(0);
                EditActivity.this.image_shadows_set.setProgress(0);
                EditActivity.this.image_fade_set.setProgress(0);
                EditActivity.this.imageblur_set.setProgress(30);
                EditActivity.this.imagesharp_set.setProgress(0);
            }
        });
        this.f23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon23.setVisibility(View.VISIBLE);
                        EditActivity.this.f23.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setProgress(240);
                EditActivity.this.imagecontrast_set.setProgress(260);
                EditActivity.this.image_grain_set.setProgress(0);
                EditActivity.this.imagesaturation_set.setProgress(0);
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.image_highlights_set.setProgress(0);
                EditActivity.this.image_shadows_set.setProgress(0);
                EditActivity.this.image_fade_set.setProgress(0);
                EditActivity.this.imageblur_set.setProgress(0);
                EditActivity.this.imagesharp_set.setProgress(0);
            }
        });
        this.f24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon24.setVisibility(View.VISIBLE);
                        EditActivity.this.f24.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.filter_picture_bg.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture.setAlpha(0.5f);
                EditActivity.this.filter_picture_bg.setColorFilter(Color.parseColor("#7C04B7"), PorterDuff.Mode.LIGHTEN);
                EditActivity.this.filter_picture.setColorFilter(Color.parseColor("#FCC600"), PorterDuff.Mode.MULTIPLY);
            }
        });
        this.f25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon25.setVisibility(View.VISIBLE);
                        EditActivity.this.f25.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.filter_picture_bg.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture.setAlpha(0.45f);
                EditActivity.this.filter_picture_bg.setColorFilter(Color.parseColor("#1167FA"), PorterDuff.Mode.LIGHTEN);
                EditActivity.this.filter_picture.setColorFilter(Color.parseColor("#FEB0A5"), PorterDuff.Mode.MULTIPLY);
            }
        });
        this.f26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon26.setVisibility(View.VISIBLE);
                        EditActivity.this.f26.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.filter_picture_bg.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture.setAlpha(0.4f);
                EditActivity.this.filter_picture_bg.setColorFilter(Color.parseColor("#960A9E"), PorterDuff.Mode.LIGHTEN);
                EditActivity.this.filter_picture.setColorFilter(Color.parseColor("#47D9E6"), PorterDuff.Mode.MULTIPLY);
            }
        });
        this.f27.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon27.setVisibility(View.VISIBLE);
                        EditActivity.this.f27.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.filter_picture_bg.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture.setAlpha(0.3f);
                EditActivity.this.filter_picture_bg.setColorFilter(Color.parseColor("#B71C1C"), PorterDuff.Mode.MULTIPLY);
                EditActivity.this.filter_picture.setColorFilter(Color.parseColor("#2962FF"), PorterDuff.Mode.SCREEN);
            }
        });
        this.f28.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon28.setVisibility(View.VISIBLE);
                        EditActivity.this.f28.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.filter_picture_bg.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture.setAlpha(0.35f);
                EditActivity.this.filter_picture_bg.setColorFilter(Color.parseColor("#740CD3"), PorterDuff.Mode.LIGHTEN);
                EditActivity.this.filter_picture.setColorFilter(Color.parseColor("#9E9E9E"), PorterDuff.Mode.MULTIPLY);
            }
        });
        this.f29.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon29.setVisibility(View.VISIBLE);
                        EditActivity.this.f29.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.filter_picture_bg.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture.setAlpha(0.45f);
                EditActivity.this.filter_picture_bg.setColorFilter(Color.parseColor("#AA00FF"), PorterDuff.Mode.LIGHTEN);
                EditActivity.this.filter_picture.setColorFilter(Color.parseColor("#00B0FF"), PorterDuff.Mode.MULTIPLY);
            }
        });
        this.f30.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon30.setVisibility(View.VISIBLE);
                        EditActivity.this.f30.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.filter_picture_bg.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture.setAlpha(0.3f);
                EditActivity.this.filter_picture_bg.setColorFilter(Color.parseColor("#AD1457"), PorterDuff.Mode.LIGHTEN);
                EditActivity.this.filter_picture.setColorFilter(Color.parseColor("#FFFF00"), PorterDuff.Mode.MULTIPLY);
            }
        });
        this.f31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon31.setVisibility(View.VISIBLE);
                        EditActivity.this.f31.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.filter_picture.setAlpha(0.3f);
                EditActivity.this.filter_picture_bg.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture_bg.setColorFilter(Color.parseColor("#0000FF"), PorterDuff.Mode.MULTIPLY);
                EditActivity.this.filter_picture.setColorFilter(Color.parseColor("#FF0000"), PorterDuff.Mode.SCREEN);
            }
        });
        this.f32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon32.setVisibility(View.VISIBLE);
                        EditActivity.this.f32.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.filter_picture.setAlpha(0.3f);
                EditActivity.this.filter_picture_bg.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture_bg.setColorFilter(Color.parseColor("#EB040A"), PorterDuff.Mode.MULTIPLY);
                EditActivity.this.filter_picture.setColorFilter(Color.parseColor("#312057"), PorterDuff.Mode.SCREEN);
            }
        });
        this.f33.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon33.setVisibility(View.VISIBLE);
                        EditActivity.this.f33.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.filter_picture.setAlpha(0.3f);
                EditActivity.this.filter_picture_bg.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture_bg.setColorFilter(Color.parseColor("#EB9318"), PorterDuff.Mode.MULTIPLY);
                EditActivity.this.filter_picture.setColorFilter(Color.parseColor("#5B0103"), PorterDuff.Mode.SCREEN);
            }
        });
        this.f34.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon34.setVisibility(View.VISIBLE);
                        EditActivity.this.f34.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.filter_picture.setAlpha(0.3f);
                EditActivity.this.filter_picture_bg.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture_bg.setColorFilter(Color.parseColor("#00FF00"), PorterDuff.Mode.MULTIPLY);
                EditActivity.this.filter_picture.setColorFilter(Color.parseColor("#0000FF"), PorterDuff.Mode.SCREEN);
            }
        });
        this.f35.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                System.out.println("JHON HERE");
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon35.setVisibility(View.VISIBLE);
                        EditActivity.this.f35.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.filter_picture.setAlpha(0.3f);
                EditActivity.this.filter_picture_bg.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture_bg.setColorFilter(Color.parseColor("#00C8FA"), PorterDuff.Mode.MULTIPLY);
                EditActivity.this.filter_picture.setColorFilter(Color.parseColor("#1F179E"), PorterDuff.Mode.SCREEN);
            }
        });

        this.f36.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                System.out.println("JHON HERE2");
                EditActivity.this.t_filter_seted();
                EditActivity.this.t_filter_set();
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.fon36.setVisibility(View.VISIBLE);
                        EditActivity.this.f36.setEnabled(false);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.filter_picture.setAlpha(0.3f);
                EditActivity.this.filter_picture_bg.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.VISIBLE);
                EditActivity.this.filter_picture_bg.setColorFilter(Color.parseColor("#ec1135"), PorterDuff.Mode.MULTIPLY);
                EditActivity.this.filter_picture.setColorFilter(Color.parseColor("#7f1324"), PorterDuff.Mode.SCREEN);
            }
        });
        this.reset_filter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_filter_set();
                EditActivity.this.filter_picture_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.filter_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.t_filter_unset = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.seekbars_filter_bg.setVisibility(View.INVISIBLE);
                        EditActivity.this.filter_progress_txt.setVisibility(View.INVISIBLE);
                        EditActivity.this.filter_alpha.setVisibility(View.INVISIBLE);
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.reset_adjust.performClick();
                        EditActivity.this.reset_filter.setTextColor(Color.parseColor("#636365"));
                        EditActivity.this.filter_scroll.fullScroll(17);
                        EditActivity.this.t_filter_unset.cancel();
                    }
                }.start();
            }
        });
        this.filter_alpha = (SeekBar) findViewById(R.id.filter_alpha);
        this.filter_alpha.setMax(100);
        this.filter_alpha.setProgress(100);
        this.filter_alpha.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.filter_alpha.setProgress(progress);
                EditActivity.this.filtered_rel.setAlpha(((float) progress) / 100.0f);
                if (progress > 0) {
                    EditActivity.this.filtered_rel.setVisibility(View.VISIBLE);
                }
                if (progress == 0) {
                    EditActivity.this.filtered_rel.setVisibility(View.INVISIBLE);
                }
                EditActivity.this.reset_filter.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.f118e0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.effect_view.setVisibility(View.INVISIBLE);
                        EditActivity.this.effect_view.setImageResource(R.drawable.empty);
                        EditActivity.this.effect_view.setAlpha(0.5f);
                        EditActivity.this.seekbars_effect_bg.setVisibility(View.INVISIBLE);
                        EditActivity.this.effect_progress_txt.setVisibility(View.INVISIBLE);
                        EditActivity.this.effect_alpha.setVisibility(View.INVISIBLE);
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.t_effect_rot.cancel();
                        EditActivity.this.reset_effect.performClick();
                    }
                }.start();
            }
        });
        this.f119e1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot1.setVisibility(View.VISIBLE);
                        EditActivity.this.f119e1.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.d1);
            }
        });
        this.f120e2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot2.setVisibility(View.VISIBLE);
                        EditActivity.this.f120e2.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.d2);
            }
        });
        this.f121e3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot3.setVisibility(View.VISIBLE);
                        EditActivity.this.f121e3.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.d3);
            }
        });
        this.f122e4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot4.setVisibility(View.VISIBLE);
                        EditActivity.this.f122e4.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.d4);
            }
        });
        this.f123e5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot5.setVisibility(View.VISIBLE);
                        EditActivity.this.f123e5.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.d5);
            }
        });
        this.f124e6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot6.setVisibility(View.VISIBLE);
                        EditActivity.this.f124e6.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.d6);
            }
        });
        this.f125e7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot7.setVisibility(View.VISIBLE);
                        EditActivity.this.f125e7.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.d7);
            }
        });
        this.f126e8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot8.setVisibility(View.VISIBLE);
                        EditActivity.this.f126e8.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.d8);
            }
        });
        this.f127e9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot9.setVisibility(View.VISIBLE);
                        EditActivity.this.f127e9.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.l1);
            }
        });
        this.e10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot10.setVisibility(View.VISIBLE);
                        EditActivity.this.e10.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.l2);
            }
        });
        this.e11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot11.setVisibility(View.VISIBLE);
                        EditActivity.this.e11.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.l3);
            }
        });
        this.e12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot12.setVisibility(View.VISIBLE);
                        EditActivity.this.e12.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.l4);
            }
        });
        this.e13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot13.setVisibility(View.VISIBLE);
                        EditActivity.this.e13.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.l5);
            }
        });
        this.e14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot14.setVisibility(View.VISIBLE);
                        EditActivity.this.e14.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.l6);
            }
        });
        this.e15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot15.setVisibility(View.VISIBLE);
                        EditActivity.this.e15.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.l7);
            }
        });
        this.e16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot16.setVisibility(View.VISIBLE);
                        EditActivity.this.e16.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.l8);
            }
        });
        this.e17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot17.setVisibility(View.VISIBLE);
                        EditActivity.this.e17.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.b1);
            }
        });
        this.e18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot18.setVisibility(View.VISIBLE);
                        EditActivity.this.e18.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.b2);
            }
        });
        this.e19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot19.setVisibility(View.VISIBLE);
                        EditActivity.this.e19.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.b3);
            }
        });
        this.e20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot20.setVisibility(View.VISIBLE);
                        EditActivity.this.e20.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.b4);
            }
        });
        this.e21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot21.setVisibility(View.VISIBLE);
                        EditActivity.this.e21.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.b5);
            }
        });
        this.e22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot22.setVisibility(View.VISIBLE);
                        EditActivity.this.e22.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.b6);
            }
        });
        this.e23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot23.setVisibility(View.VISIBLE);
                        EditActivity.this.e23.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.b7);
            }
        });
        this.e24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot24.setVisibility(View.VISIBLE);
                        EditActivity.this.e24.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.b8);
            }
        });
        this.e25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot25.setVisibility(View.VISIBLE);
                        EditActivity.this.e25.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.b9);
            }
        });
        this.e26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot26.setVisibility(View.VISIBLE);
                        EditActivity.this.e26.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.b10);
            }
        });
        this.e27.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot27.setVisibility(View.VISIBLE);
                        EditActivity.this.e27.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.b11);
            }
        });
        this.e28.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot28.setVisibility(View.VISIBLE);
                        EditActivity.this.e28.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.b12);
            }
        });
        this.e29.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot29.setVisibility(View.VISIBLE);
                        EditActivity.this.e29.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.lo1);
            }
        });
        this.e30.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot30.setVisibility(View.VISIBLE);
                        EditActivity.this.e30.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.lo2);
            }
        });
        this.e31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot31.setVisibility(View.VISIBLE);
                        EditActivity.this.e31.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.lo3);
            }
        });
        this.e32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot32.setVisibility(View.VISIBLE);
                        EditActivity.this.e32.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.lo4);
            }
        });
        this.e33.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot33.setVisibility(View.VISIBLE);
                        EditActivity.this.e33.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.lo5);
            }
        });
        this.e34.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot34.setVisibility(View.VISIBLE);
                        EditActivity.this.e34.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.lo6);
            }
        });
        this.e35.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot35.setVisibility(View.VISIBLE);
                        EditActivity.this.e35.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.w1);
            }
        });
        this.e36.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot36.setVisibility(View.VISIBLE);
                        EditActivity.this.e36.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.w2);
            }
        });
        this.e37.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot37.setVisibility(View.VISIBLE);
                        EditActivity.this.e37.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.w3);
            }
        });
        this.e38.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot38.setVisibility(View.VISIBLE);
                        EditActivity.this.e38.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.w4);
            }
        });
        this.e39.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot39.setVisibility(View.VISIBLE);
                        EditActivity.this.e39.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.w5);
            }
        });
        this.e40.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot40.setVisibility(View.VISIBLE);
                        EditActivity.this.e40.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.w6);
            }
        });
        this.e41.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot41.setVisibility(View.VISIBLE);
                        EditActivity.this.e41.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.v1);
            }
        });
        this.e42.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot42.setVisibility(View.VISIBLE);
                        EditActivity.this.e42.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.v2);
            }
        });
        this.e43.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot43.setVisibility(View.VISIBLE);
                        EditActivity.this.e43.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.v3);
            }
        });
        this.e44.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot44.setVisibility(View.VISIBLE);
                        EditActivity.this.e44.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.v4);
            }
        });
        this.e45.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot45.setVisibility(View.VISIBLE);
                        EditActivity.this.e45.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.v5);
            }
        });
        this.e46.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot46.setVisibility(View.VISIBLE);
                        EditActivity.this.e46.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.v6);
            }
        });
        this.e47.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot47.setVisibility(View.VISIBLE);
                        EditActivity.this.e47.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.v7);
            }
        });
        this.e48.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot48.setVisibility(View.VISIBLE);
                        EditActivity.this.e48.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.v8);
            }
        });
        this.e49.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.erot49.setVisibility(View.VISIBLE);
                        EditActivity.this.e49.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.v9);
            }
        });
        this.e50.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_effect_seted();
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.reset_effect.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.erot50.setVisibility(View.VISIBLE);
                        EditActivity.this.e50.setEnabled(false);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
                EditActivity.this.effect_view.setImageResource(R.drawable.v10);
            }
        });

        rotcount = 0;
        this.rotate_count.setText(String.valueOf(rotcount));
        TextView[] erot = {this.erot1, this.erot2, this.erot3, this.erot4, this.erot5, this.erot6, this.erot7, this.erot8, this.erot9, this.erot10, this.erot11, this.erot12, this.erot13, this.erot14, this.erot15, this.erot16, this.erot17, this.erot18, this.erot19, this.erot20, this.erot21, this.erot22, this.erot23, this.erot24, this.erot25, this.erot26, this.erot27, this.erot28, this.erot29, this.erot30, this.erot31, this.erot32, this.erot33, this.erot34, this.erot35, this.erot36, this.erot37, this.erot38, this.erot39, this.erot40, this.erot41, this.erot42, this.erot43, this.erot44, this.erot45, this.erot46, this.erot47, this.erot48, this.erot49, this.erot50};
        for (TextView erots : erot) {
            erots.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {

                    rotcount++;
                    EditActivity.this.getRotCH();
                }
            });
        }
        this.reset_effect.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.effect_alpha.setProgress(50);
                EditActivity.this.t_effect_set();
                EditActivity.this.t_effect_rot = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.seekbars_effect_bg.setVisibility(View.INVISIBLE);
                        EditActivity.this.effect_progress_txt.setVisibility(View.INVISIBLE);
                        EditActivity.this.effect_alpha.setVisibility(View.INVISIBLE);
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.effect_view.setVisibility(View.INVISIBLE);
                        EditActivity.this.effect_view.setImageResource(R.drawable.empty);
                        EditActivity.this.reset_effect.setTextColor(Color.parseColor("#636365"));
                        EditActivity.this.effect_scroll.fullScroll(17);
                        EditActivity.this.t_effect_rot.cancel();
                    }
                }.start();
            }
        });
        this.effect_alpha = (SeekBar) findViewById(R.id.effect_alpha);
        this.effect_alpha.setMax(100);
        this.effect_alpha.setProgress(50);
        this.effect_alpha.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.effect_alpha.setProgress(progress);
                EditActivity.this.effect_view.setAlpha(((float) progress) / 100.0f);
                if (progress > 0) {
                    EditActivity.this.effect_view.setVisibility(View.VISIBLE);
                }
                if (progress == 0) {
                    EditActivity.this.effect_view.setVisibility(View.INVISIBLE);
                }
                EditActivity.this.reset_effect.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.t_hsl_gone = new CountDownTimer(25, 1) {
            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                EditActivity.this.hsl_overlap_1.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_overlap_2.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_overlap_3.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_overlap_4.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_overlap_5.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_overlap_6.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_hue_1.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_hue_2.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_hue_3.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_hue_4.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_hue_5.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_hue_6.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_saturation_1.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_saturation_2.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_saturation_3.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_saturation_4.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_saturation_5.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_saturation_6.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_lightness_1.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_lightness_2.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_lightness_3.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_lightness_4.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_lightness_5.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_lightness_6.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_1.setEnabled(true);
                EditActivity.this.hsl_2.setEnabled(true);
                EditActivity.this.hsl_3.setEnabled(true);
                EditActivity.this.hsl_4.setEnabled(true);
                EditActivity.this.hsl_5.setEnabled(true);
                EditActivity.this.hsl_6.setEnabled(true);
                EditActivity.this.t_hsl_gone.cancel();
            }
        };
        this.reset_hsl.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_hsl_gone.start();
                EditActivity.this.seekbars_hsl_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_progress_txt1.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_saturation.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_progress_txt2.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_progress_txt3.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_progress_txt4.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl1_txt.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl2_txt.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl3_txt.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl4_txt.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_overlap_1.setProgress(100);
                EditActivity.this.hsl_overlap_2.setProgress(100);
                EditActivity.this.hsl_overlap_3.setProgress(100);
                EditActivity.this.hsl_overlap_4.setProgress(100);
                EditActivity.this.hsl_overlap_5.setProgress(100);
                EditActivity.this.hsl_overlap_6.setProgress(100);
                EditActivity.this.hsl_hue_1.setProgress(30);
                EditActivity.this.hsl_hue_2.setProgress(30);
                EditActivity.this.hsl_hue_3.setProgress(30);
                EditActivity.this.hsl_hue_4.setProgress(30);
                EditActivity.this.hsl_hue_5.setProgress(30);
                EditActivity.this.hsl_hue_6.setProgress(30);
                EditActivity.this.hsl_saturation_1.setProgress(100);
                EditActivity.this.hsl_saturation_2.setProgress(100);
                EditActivity.this.hsl_saturation_3.setProgress(100);
                EditActivity.this.hsl_saturation_4.setProgress(100);
                EditActivity.this.hsl_saturation_5.setProgress(100);
                EditActivity.this.hsl_saturation_6.setProgress(100);
                EditActivity.this.hsl_lightness_1.setProgress(50);
                EditActivity.this.hsl_lightness_2.setProgress(50);
                EditActivity.this.hsl_lightness_3.setProgress(50);
                EditActivity.this.hsl_lightness_4.setProgress(50);
                EditActivity.this.hsl_lightness_5.setProgress(50);
                EditActivity.this.hsl_lightness_6.setProgress(50);
                EditActivity.this.hsl_picture1.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_picture1.setImageResource(R.drawable.empty);
                EditActivity.this.hsl_picture2.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_picture2.setImageResource(R.drawable.empty);
                EditActivity.this.hsl_picture3.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_picture3.setImageResource(R.drawable.empty);
                EditActivity.this.hsl_picture4.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_picture4.setImageResource(R.drawable.empty);
                EditActivity.this.hsl_picture5.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_picture5.setImageResource(R.drawable.empty);
                EditActivity.this.hsl_picture6.setVisibility(View.INVISIBLE);
                EditActivity.this.hsl_picture6.setImageResource(R.drawable.empty);
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.hsl_1.setText(EditActivity.this.getResources().getString(R.string.hsloff_icon));
                EditActivity.this.hsl_2.setText(EditActivity.this.getResources().getString(R.string.hsloff_icon));
                EditActivity.this.hsl_3.setText(EditActivity.this.getResources().getString(R.string.hsloff_icon));
                EditActivity.this.hsl_4.setText(EditActivity.this.getResources().getString(R.string.hsloff_icon));
                EditActivity.this.hsl_5.setText(EditActivity.this.getResources().getString(R.string.hsloff_icon));
                EditActivity.this.hsl_6.setText(EditActivity.this.getResources().getString(R.string.hsloff_icon));
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }
        });
        this.hsl_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_hsl_gone.start();
                EditActivity.this.t_hsl_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.hsl_overlap_1.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_hue_1.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_saturation_1.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_lightness_1.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_hsl_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt1.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt1.setBackgroundResource(R.drawable.state_hsl1);
                        EditActivity.this.hsl_saturation.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_saturation.setBackgroundColor(Color.parseColor("#FF8000"));
                        EditActivity.this.hsl_progress_txt2.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt3.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt4.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl1_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl2_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl3_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl4_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_1.setEnabled(false);
                        EditActivity.this.t_hsl_set.cancel();
                    }
                }.start();
            }
        });
        this.hsl_overlap_1 = (SeekBar) findViewById(R.id.hsl_overlap_1);
        this.hsl_overlap_1.setMax(100);
        this.hsl_overlap_1.setProgress(100);
        this.hsl_overlap_1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_overlap_1.setProgress(progress);
                EditActivity.this.hsl_picture1.setAlpha(((float) progress) / 100.0f);
                if (progress > 0) {
                    EditActivity.this.hsl_picture1.setImageBitmap(EditActivity.this.hslbitmap);
                    EditActivity.this.hsl_picture1.setVisibility(View.VISIBLE);
                }
                if (progress == 0) {
                    EditActivity.this.hsl_picture1.setImageResource(R.drawable.empty);
                    EditActivity.this.hsl_picture1.setVisibility(View.INVISIBLE);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_1.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.hsl_hue_1 = (SeekBar) findViewById(R.id.hsl_hue_1);
        this.hsl_hue_1.setMax(60);
        this.hsl_hue_1.setProgress(30);
        this.hsl_hue_1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress_hue, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress_hue));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_hue_1.setProgress(progress_hue);
                if (progress_hue > 0) {
                    int color = ColorUtils.HSLToColor(new float[]{(float) progress_hue, ((float) EditActivity.this.hsl_saturation_1.getProgress()) / 100.0f, ((float) EditActivity.this.hsl_lightness_1.getProgress()) / 100.0f});
                    EditActivity.this.hsl_picture1.setColorFilter(color, PorterDuff.Mode.OVERLAY);
                    EditActivity.this.hsl_picture1.setVisibility(View.VISIBLE);
                    EditActivity.this.hsl_picture1.setImageBitmap(EditActivity.this.hslbitmap);
                    EditActivity.this.hsl_saturation.setBackgroundColor(color);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_1.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.hsl_saturation_1 = (SeekBar) findViewById(R.id.hsl_saturation_1);
        this.hsl_saturation_1.setMax(100);
        this.hsl_saturation_1.setProgress(100);
        this.hsl_saturation_1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress_saturation, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress_saturation));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_saturation_1.setProgress(progress_saturation);
                if (progress_saturation > 0) {
                    EditActivity.this.hsl_picture1.setColorFilter(ColorUtils.HSLToColor(new float[]{(float) EditActivity.this.hsl_hue_1.getProgress(), ((float) progress_saturation) / 100.0f, ((float) EditActivity.this.hsl_lightness_1.getProgress()) / 100.0f}), PorterDuff.Mode.OVERLAY);
                    EditActivity.this.hsl_picture1.setVisibility(View.VISIBLE);
                    EditActivity.this.hsl_picture1.setImageBitmap(EditActivity.this.hslbitmap);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_1.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.hsl_lightness_1 = (SeekBar) findViewById(R.id.hsl_lightness_1);
        this.hsl_lightness_1.setMax(100);
        this.hsl_lightness_1.setProgress(50);
        this.hsl_lightness_1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress_lightness, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress_lightness));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_lightness_1.setProgress(progress_lightness);
                if (progress_lightness > 0) {
                    EditActivity.this.hsl_picture1.setColorFilter(ColorUtils.HSLToColor(new float[]{(float) EditActivity.this.hsl_hue_1.getProgress(), ((float) EditActivity.this.hsl_saturation_1.getProgress()) / 100.0f, ((float) progress_lightness) / 100.0f}), PorterDuff.Mode.OVERLAY);
                    EditActivity.this.hsl_picture1.setVisibility(View.VISIBLE);
                    EditActivity.this.hsl_picture1.setImageBitmap(EditActivity.this.hslbitmap);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_1.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.hsl_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_hsl_gone.start();
                EditActivity.this.t_hsl_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.hsl_overlap_2.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_hue_2.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_saturation_2.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_lightness_2.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_hsl_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt1.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt1.setBackgroundResource(R.drawable.state_hsl2);
                        EditActivity.this.hsl_saturation.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_saturation.setBackgroundColor(Color.parseColor("#80FF00"));
                        EditActivity.this.hsl_progress_txt2.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt3.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt4.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl1_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl2_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl3_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl4_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_2.setEnabled(false);
                        EditActivity.this.t_hsl_set.cancel();
                    }
                }.start();
            }
        });
        this.hsl_overlap_2 = (SeekBar) findViewById(R.id.hsl_overlap_2);
        this.hsl_overlap_2.setMax(100);
        this.hsl_overlap_2.setProgress(100);
        this.hsl_overlap_2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_overlap_2.setProgress(progress);
                EditActivity.this.hsl_picture2.setAlpha(((float) progress) / 100.0f);
                if (progress > 0) {
                    EditActivity.this.hsl_picture2.setImageBitmap(EditActivity.this.hslbitmap);
                    EditActivity.this.hsl_picture2.setVisibility(View.VISIBLE);
                }
                if (progress == 0) {
                    EditActivity.this.hsl_picture2.setImageResource(R.drawable.empty);
                    EditActivity.this.hsl_picture2.setVisibility(View.INVISIBLE);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_2.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.hsl_hue_2 = (SeekBar) findViewById(R.id.hsl_hue_2);
        this.hsl_hue_2.setMax(60);
        this.hsl_hue_2.setProgress(30);
        this.hsl_hue_2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress_hue, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress_hue));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_hue_2.setProgress(progress_hue);
                if (progress_hue > 0) {
                    int color = ColorUtils.HSLToColor(new float[]{(float) (progress_hue + 60), ((float) EditActivity.this.hsl_saturation_2.getProgress()) / 100.0f, ((float) EditActivity.this.hsl_lightness_2.getProgress()) / 100.0f});
                    EditActivity.this.hsl_picture2.setColorFilter(color, PorterDuff.Mode.OVERLAY);
                    EditActivity.this.hsl_picture2.setVisibility(View.VISIBLE);
                    EditActivity.this.hsl_picture2.setImageBitmap(EditActivity.this.hslbitmap);
                    EditActivity.this.hsl_saturation.setBackgroundColor(color);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_2.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.hsl_saturation_2 = (SeekBar) findViewById(R.id.hsl_saturation_2);
        this.hsl_saturation_2.setMax(100);
        this.hsl_saturation_2.setProgress(100);
        this.hsl_saturation_2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress_saturation, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress_saturation));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_saturation_2.setProgress(progress_saturation);
                EditActivity.this.hsl_picture2.setAlpha(((float) progress_saturation) / 100.0f);
                if (progress_saturation > 0) {
                    EditActivity.this.hsl_picture2.setColorFilter(ColorUtils.HSLToColor(new float[]{(float) (EditActivity.this.hsl_hue_2.getProgress() + 60), ((float) progress_saturation) / 100.0f, ((float) EditActivity.this.hsl_lightness_2.getProgress()) / 100.0f}), PorterDuff.Mode.OVERLAY);
                    EditActivity.this.hsl_picture2.setVisibility(View.VISIBLE);
                    EditActivity.this.hsl_picture2.setImageBitmap(EditActivity.this.hslbitmap);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_2.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.hsl_lightness_2 = (SeekBar) findViewById(R.id.hsl_lightness_2);
        this.hsl_lightness_2.setMax(100);
        this.hsl_lightness_2.setProgress(50);
        this.hsl_lightness_2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress_lightness, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress_lightness));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_lightness_2.setProgress(progress_lightness);
                if (progress_lightness > 0) {
                    EditActivity.this.hsl_picture2.setColorFilter(ColorUtils.HSLToColor(new float[]{(float) (EditActivity.this.hsl_hue_2.getProgress() + 60), ((float) EditActivity.this.hsl_saturation_2.getProgress()) / 100.0f, ((float) progress_lightness) / 100.0f}), PorterDuff.Mode.OVERLAY);
                    EditActivity.this.hsl_picture2.setVisibility(View.VISIBLE);
                    EditActivity.this.hsl_picture2.setImageBitmap(EditActivity.this.hslbitmap);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_2.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.hsl_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_hsl_gone.start();
                EditActivity.this.t_hsl_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.hsl_overlap_3.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_hue_3.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_saturation_3.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_lightness_3.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_hsl_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt1.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt1.setBackgroundResource(R.drawable.state_hsl3);
                        EditActivity.this.hsl_saturation.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_saturation.setBackgroundColor(Color.parseColor("#00FF80"));
                        EditActivity.this.hsl_progress_txt2.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt3.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt4.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl1_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl2_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl3_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl4_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_3.setEnabled(false);
                        EditActivity.this.t_hsl_set.cancel();
                    }
                }.start();
            }
        });
        this.hsl_overlap_3 = (SeekBar) findViewById(R.id.hsl_overlap_3);
        this.hsl_overlap_3.setMax(100);
        this.hsl_overlap_3.setProgress(100);
        this.hsl_overlap_3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_overlap_3.setProgress(progress);
                EditActivity.this.hsl_picture3.setAlpha(((float) progress) / 100.0f);
                if (progress > 0) {
                    EditActivity.this.hsl_picture3.setImageBitmap(EditActivity.this.hslbitmap);
                    EditActivity.this.hsl_picture3.setVisibility(View.VISIBLE);
                }
                if (progress == 0) {
                    EditActivity.this.hsl_picture3.setImageResource(R.drawable.empty);
                    EditActivity.this.hsl_picture3.setVisibility(View.INVISIBLE);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_3.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.hsl_hue_3 = (SeekBar) findViewById(R.id.hsl_hue_3);
        this.hsl_hue_3.setMax(60);
        this.hsl_hue_3.setProgress(30);
        this.hsl_hue_3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress_hue, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress_hue));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_hue_3.setProgress(progress_hue);
                if (progress_hue > 0) {
                    int color = ColorUtils.HSLToColor(new float[]{(float) (progress_hue + 120), ((float) EditActivity.this.hsl_saturation_3.getProgress()) / 100.0f, ((float) EditActivity.this.hsl_lightness_3.getProgress()) / 100.0f});
                    EditActivity.this.hsl_picture3.setColorFilter(color, PorterDuff.Mode.OVERLAY);
                    EditActivity.this.hsl_picture3.setVisibility(View.VISIBLE);
                    EditActivity.this.hsl_picture3.setImageBitmap(EditActivity.this.hslbitmap);
                    EditActivity.this.hsl_saturation.setBackgroundColor(color);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_3.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.hsl_saturation_3 = (SeekBar) findViewById(R.id.hsl_saturation_3);
        this.hsl_saturation_3.setMax(100);
        this.hsl_saturation_3.setProgress(100);
        this.hsl_saturation_3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress_saturation, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress_saturation));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_saturation_3.setProgress(progress_saturation);
                EditActivity.this.hsl_picture3.setAlpha(((float) progress_saturation) / 100.0f);
                if (progress_saturation > 0) {
                    EditActivity.this.hsl_picture3.setColorFilter(ColorUtils.HSLToColor(new float[]{(float) (EditActivity.this.hsl_hue_3.getProgress() + 120), ((float) progress_saturation) / 100.0f, ((float) EditActivity.this.hsl_lightness_3.getProgress()) / 100.0f}), PorterDuff.Mode.OVERLAY);
                    EditActivity.this.hsl_picture3.setVisibility(View.VISIBLE);
                    EditActivity.this.hsl_picture3.setImageBitmap(EditActivity.this.hslbitmap);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_3.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.hsl_lightness_3 = (SeekBar) findViewById(R.id.hsl_lightness_3);
        this.hsl_lightness_3.setMax(100);
        this.hsl_lightness_3.setProgress(50);
        this.hsl_lightness_3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress_lightness, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress_lightness));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_lightness_3.setProgress(progress_lightness);
                if (progress_lightness > 0) {
                    EditActivity.this.hsl_picture3.setColorFilter(ColorUtils.HSLToColor(new float[]{(float) (EditActivity.this.hsl_hue_3.getProgress() + 120), ((float) EditActivity.this.hsl_saturation_3.getProgress()) / 100.0f, ((float) progress_lightness) / 100.0f}), PorterDuff.Mode.OVERLAY);
                    EditActivity.this.hsl_picture3.setVisibility(View.VISIBLE);
                    EditActivity.this.hsl_picture3.setImageBitmap(EditActivity.this.hslbitmap);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_3.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.hsl_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_hsl_gone.start();
                EditActivity.this.t_hsl_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.hsl_overlap_4.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_hue_4.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_saturation_4.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_lightness_4.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_hsl_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt1.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt1.setBackgroundResource(R.drawable.state_hsl4);
                        EditActivity.this.hsl_saturation.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_saturation.setBackgroundColor(Color.parseColor("#007FFF"));
                        EditActivity.this.hsl_progress_txt2.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt3.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt4.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl1_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl2_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl3_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl4_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_4.setEnabled(false);
                        EditActivity.this.t_hsl_set.cancel();
                    }
                }.start();
            }
        });
        this.hsl_overlap_4 = (SeekBar) findViewById(R.id.hsl_overlap_4);
        this.hsl_overlap_4.setMax(100);
        this.hsl_overlap_4.setProgress(100);
        this.hsl_overlap_4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_overlap_4.setProgress(progress);
                EditActivity.this.hsl_picture4.setAlpha(((float) progress) / 100.0f);
                if (progress > 0) {
                    EditActivity.this.hsl_picture4.setImageBitmap(EditActivity.this.hslbitmap);
                    EditActivity.this.hsl_picture4.setVisibility(View.VISIBLE);
                }
                if (progress == 0) {
                    EditActivity.this.hsl_picture4.setImageResource(R.drawable.empty);
                    EditActivity.this.hsl_picture4.setVisibility(View.INVISIBLE);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_4.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.hsl_hue_4 = (SeekBar) findViewById(R.id.hsl_hue_4);
        this.hsl_hue_4.setMax(60);
        this.hsl_hue_4.setProgress(30);
        this.hsl_hue_4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress_hue, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress_hue));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_hue_4.setProgress(progress_hue);
                if (progress_hue > 0) {
                    int color = ColorUtils.HSLToColor(new float[]{(float) (progress_hue + 180), ((float) EditActivity.this.hsl_saturation_4.getProgress()) / 100.0f, ((float) EditActivity.this.hsl_lightness_4.getProgress()) / 100.0f});
                    EditActivity.this.hsl_picture4.setColorFilter(color, PorterDuff.Mode.OVERLAY);
                    EditActivity.this.hsl_picture4.setVisibility(View.VISIBLE);
                    EditActivity.this.hsl_picture4.setImageBitmap(EditActivity.this.hslbitmap);
                    EditActivity.this.hsl_saturation.setBackgroundColor(color);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_4.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.hsl_saturation_4 = (SeekBar) findViewById(R.id.hsl_saturation_4);
        this.hsl_saturation_4.setMax(100);
        this.hsl_saturation_4.setProgress(100);
        this.hsl_saturation_4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress_saturation, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress_saturation));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_saturation_4.setProgress(progress_saturation);
                EditActivity.this.hsl_picture4.setAlpha(((float) progress_saturation) / 100.0f);
                if (progress_saturation > 0) {
                    EditActivity.this.hsl_picture4.setColorFilter(ColorUtils.HSLToColor(new float[]{(float) (EditActivity.this.hsl_hue_4.getProgress() + 180), ((float) progress_saturation) / 100.0f, ((float) EditActivity.this.hsl_lightness_4.getProgress()) / 100.0f}), PorterDuff.Mode.OVERLAY);
                    EditActivity.this.hsl_picture4.setVisibility(View.VISIBLE);
                    EditActivity.this.hsl_picture4.setImageBitmap(EditActivity.this.hslbitmap);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_4.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.hsl_lightness_4 = (SeekBar) findViewById(R.id.hsl_lightness_4);
        this.hsl_lightness_4.setMax(100);
        this.hsl_lightness_4.setProgress(50);
        this.hsl_lightness_4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress_lightness, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress_lightness));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_lightness_4.setProgress(progress_lightness);
                if (progress_lightness > 0) {
                    EditActivity.this.hsl_picture4.setColorFilter(ColorUtils.HSLToColor(new float[]{(float) (EditActivity.this.hsl_hue_4.getProgress() + 180), ((float) EditActivity.this.hsl_saturation_4.getProgress()) / 100.0f, ((float) progress_lightness) / 100.0f}), PorterDuff.Mode.OVERLAY);
                    EditActivity.this.hsl_picture4.setVisibility(View.VISIBLE);
                    EditActivity.this.hsl_picture4.setImageBitmap(EditActivity.this.hslbitmap);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_4.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.hsl_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_hsl_gone.start();
                EditActivity.this.t_hsl_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.hsl_overlap_5.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_hue_5.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_saturation_5.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_lightness_5.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_hsl_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt1.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt1.setBackgroundResource(R.drawable.state_hsl5);
                        EditActivity.this.hsl_saturation.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_saturation.setBackgroundColor(Color.parseColor("#7F00FF"));
                        EditActivity.this.hsl_progress_txt2.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt3.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt4.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl1_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl2_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl3_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl4_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_5.setEnabled(false);
                        EditActivity.this.t_hsl_set.cancel();
                    }
                }.start();
            }
        });
        this.hsl_overlap_5 = (SeekBar) findViewById(R.id.hsl_overlap_5);
        this.hsl_overlap_5.setMax(100);
        this.hsl_overlap_5.setProgress(100);
        this.hsl_overlap_5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_overlap_5.setProgress(progress);
                EditActivity.this.hsl_picture5.setAlpha(((float) progress) / 100.0f);
                if (progress > 0) {
                    EditActivity.this.hsl_picture5.setImageBitmap(EditActivity.this.hslbitmap);
                    EditActivity.this.hsl_picture5.setVisibility(View.VISIBLE);
                }
                if (progress == 0) {
                    EditActivity.this.hsl_picture5.setImageResource(R.drawable.empty);
                    EditActivity.this.hsl_picture5.setVisibility(View.INVISIBLE);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_5.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.hsl_hue_5 = (SeekBar) findViewById(R.id.hsl_hue_5);
        this.hsl_hue_5.setMax(60);
        this.hsl_hue_5.setProgress(30);
        this.hsl_hue_5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress_hue, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress_hue));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_hue_5.setProgress(progress_hue);
                if (progress_hue > 0) {
                    int color = ColorUtils.HSLToColor(new float[]{(float) (progress_hue + 240), ((float) EditActivity.this.hsl_saturation_5.getProgress()) / 100.0f, ((float) EditActivity.this.hsl_lightness_5.getProgress()) / 100.0f});
                    EditActivity.this.hsl_picture5.setColorFilter(color, PorterDuff.Mode.OVERLAY);
                    EditActivity.this.hsl_picture5.setVisibility(View.VISIBLE);
                    EditActivity.this.hsl_picture5.setImageBitmap(EditActivity.this.hslbitmap);
                    EditActivity.this.hsl_saturation.setBackgroundColor(color);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_5.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.hsl_saturation_5 = (SeekBar) findViewById(R.id.hsl_saturation_5);
        this.hsl_saturation_5.setMax(100);
        this.hsl_saturation_5.setProgress(100);
        this.hsl_saturation_5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress_saturation, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress_saturation));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_saturation_5.setProgress(progress_saturation);
                EditActivity.this.hsl_picture5.setAlpha(((float) progress_saturation) / 100.0f);
                if (progress_saturation > 0) {
                    EditActivity.this.hsl_picture5.setColorFilter(ColorUtils.HSLToColor(new float[]{(float) (EditActivity.this.hsl_hue_5.getProgress() + 240), ((float) progress_saturation) / 100.0f, ((float) EditActivity.this.hsl_lightness_5.getProgress()) / 100.0f}), PorterDuff.Mode.OVERLAY);
                    EditActivity.this.hsl_picture5.setVisibility(View.VISIBLE);
                    EditActivity.this.hsl_picture5.setImageBitmap(EditActivity.this.hslbitmap);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_5.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.hsl_lightness_5 = (SeekBar) findViewById(R.id.hsl_lightness_5);
        this.hsl_lightness_5.setMax(100);
        this.hsl_lightness_5.setProgress(50);
        this.hsl_lightness_5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress_lightness, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress_lightness));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_lightness_5.setProgress(progress_lightness);
                if (progress_lightness > 0) {
                    EditActivity.this.hsl_picture5.setColorFilter(ColorUtils.HSLToColor(new float[]{(float) (EditActivity.this.hsl_hue_5.getProgress() + 240), ((float) EditActivity.this.hsl_saturation_5.getProgress()) / 100.0f, ((float) progress_lightness) / 100.0f}), PorterDuff.Mode.OVERLAY);
                    EditActivity.this.hsl_picture5.setVisibility(View.VISIBLE);
                    EditActivity.this.hsl_picture5.setImageBitmap(EditActivity.this.hslbitmap);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_5.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.hsl_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_hsl_gone.start();
                EditActivity.this.t_hsl_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.hsl_overlap_6.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_hue_6.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_saturation_6.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_lightness_6.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_hsl_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt1.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt1.setBackgroundResource(R.drawable.state_hsl6);
                        EditActivity.this.hsl_saturation.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_saturation.setBackgroundColor(Color.parseColor("#FF0080"));
                        EditActivity.this.hsl_progress_txt2.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt3.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_progress_txt4.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl1_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl2_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl3_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl4_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_6.setEnabled(false);
                        EditActivity.this.t_hsl_set.cancel();
                    }
                }.start();
            }
        });
        this.hsl_overlap_6 = (SeekBar) findViewById(R.id.hsl_overlap_6);
        this.hsl_overlap_6.setMax(100);
        this.hsl_overlap_6.setProgress(100);
        this.hsl_overlap_6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_overlap_6.setProgress(progress);
                EditActivity.this.hsl_picture6.setAlpha(((float) progress) / 100.0f);
                if (progress > 0) {
                    EditActivity.this.hsl_picture6.setImageBitmap(EditActivity.this.hslbitmap);
                    EditActivity.this.hsl_picture6.setVisibility(View.VISIBLE);
                }
                if (progress == 0) {
                    EditActivity.this.hsl_picture6.setImageResource(R.drawable.empty);
                    EditActivity.this.hsl_picture6.setVisibility(View.INVISIBLE);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_6.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.hsl_hue_6 = (SeekBar) findViewById(R.id.hsl_hue_6);
        this.hsl_hue_6.setMax(60);
        this.hsl_hue_6.setProgress(30);
        this.hsl_hue_6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress_hue, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress_hue));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_hue_6.setProgress(progress_hue);
                if (progress_hue > 0) {
                    int color = ColorUtils.HSLToColor(new float[]{(float) (progress_hue + 300), ((float) EditActivity.this.hsl_saturation_6.getProgress()) / 100.0f, ((float) EditActivity.this.hsl_lightness_6.getProgress()) / 100.0f});
                    EditActivity.this.hsl_picture6.setColorFilter(color, PorterDuff.Mode.OVERLAY);
                    EditActivity.this.hsl_picture6.setVisibility(View.VISIBLE);
                    EditActivity.this.hsl_picture6.setImageBitmap(EditActivity.this.hslbitmap);
                    EditActivity.this.hsl_saturation.setBackgroundColor(color);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_6.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.hsl_saturation_6 = (SeekBar) findViewById(R.id.hsl_saturation_6);
        this.hsl_saturation_6.setMax(100);
        this.hsl_saturation_6.setProgress(100);
        this.hsl_saturation_6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress_saturation, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress_saturation));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_saturation_6.setProgress(progress_saturation);
                EditActivity.this.hsl_picture6.setAlpha(((float) progress_saturation) / 100.0f);
                if (progress_saturation > 0) {
                    EditActivity.this.hsl_picture6.setColorFilter(ColorUtils.HSLToColor(new float[]{(float) (EditActivity.this.hsl_hue_6.getProgress() + 300), ((float) progress_saturation) / 100.0f, ((float) EditActivity.this.hsl_lightness_6.getProgress()) / 100.0f}), PorterDuff.Mode.OVERLAY);
                    EditActivity.this.hsl_picture6.setVisibility(View.VISIBLE);
                    EditActivity.this.hsl_picture6.setImageBitmap(EditActivity.this.hslbitmap);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_6.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.hsl_lightness_6 = (SeekBar) findViewById(R.id.hsl_lightness_6);
        this.hsl_lightness_6.setMax(100);
        this.hsl_lightness_6.setProgress(50);
        this.hsl_lightness_6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress_lightness, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress_lightness));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.hsl_lightness_6.setProgress(progress_lightness);
                if (progress_lightness > 0) {
                    EditActivity.this.hsl_picture6.setColorFilter(ColorUtils.HSLToColor(new float[]{(float) (EditActivity.this.hsl_hue_6.getProgress() + 300), ((float) EditActivity.this.hsl_saturation_6.getProgress()) / 100.0f, ((float) progress_lightness) / 100.0f}), PorterDuff.Mode.OVERLAY);
                    EditActivity.this.hsl_picture6.setVisibility(View.VISIBLE);
                    EditActivity.this.hsl_picture6.setImageBitmap(EditActivity.this.hslbitmap);
                }
                EditActivity.this.reset_hsl.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.hsl_6.setText(EditActivity.this.getResources().getString(R.string.hslon_icon));
            }
        });
        this.t_adjust_gone = new CountDownTimer(25, 1) {
            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                EditActivity.this.brightness_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.contrast_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.grain_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.saturation_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.colorize_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.highlights_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.shadows_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.blur_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.sharpen_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.fade_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.brightness_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.contrast_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.grain_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.saturation_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.colorize_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.highlights_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.shadows_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.blur_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.sharpen_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.fade_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.imageblur_set.setVisibility(View.INVISIBLE);
                EditActivity.this.imagebrightness_set.setVisibility(View.INVISIBLE);
                EditActivity.this.imagecontrast_set.setVisibility(View.INVISIBLE);
                EditActivity.this.imagesaturation_set.setVisibility(View.INVISIBLE);
                EditActivity.this.imagesharp_set.setVisibility(View.INVISIBLE);
                EditActivity.this.image_hue_set.setVisibility(View.INVISIBLE);
                EditActivity.this.image_grain_set.setVisibility(View.INVISIBLE);
                EditActivity.this.image_highlights_set.setVisibility(View.INVISIBLE);
                EditActivity.this.image_shadows_set.setVisibility(View.INVISIBLE);
                EditActivity.this.image_fade_set.setVisibility(View.INVISIBLE);
                EditActivity.this.brightness_rel.setEnabled(true);
                EditActivity.this.contrast_rel.setEnabled(true);
                EditActivity.this.grain_rel.setEnabled(true);
                EditActivity.this.saturation_rel.setEnabled(true);
                EditActivity.this.colorize_rel.setEnabled(true);
                EditActivity.this.highlights_rel.setEnabled(true);
                EditActivity.this.shadows_rel.setEnabled(true);
                EditActivity.this.blur_rel.setEnabled(true);
                EditActivity.this.sharpen_rel.setEnabled(true);
                EditActivity.this.fade_rel.setEnabled(true);
                EditActivity.this.t_adjust_gone.cancel();
            }
        };
        this.reset_adjust.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_adjust_gone.start();
                EditActivity.this.imageblur_set.setProgress(0);
                EditActivity.this.imagesharp_set.setProgress(0);
                EditActivity.this.imagesaturation_set.setProgress(255);
                EditActivity.this.imagecontrast_set.setProgress(255);
                EditActivity.this.imagebrightness_set.setProgress(255);
                EditActivity.this.image_hue_set.setProgress(0);
                EditActivity.this.image_grain_set.setProgress(0);
                EditActivity.this.image_highlights_set.setProgress(0);
                EditActivity.this.image_shadows_set.setProgress(0);
                EditActivity.this.image_fade_set.setProgress(0);
                EditActivity.this.seekbars_adjust_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.adjust_progress_txt.setVisibility(View.INVISIBLE);
                EditActivity.this.reset_adjust.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.adjust_scroll.fullScroll(17);
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                EditActivity.this.reset_filter.performClick();
            }
        });
        this.blur_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_adjust_gone.start();
                EditActivity.this.t_adjust_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.blur_ic.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.blur_txt.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.imageblur_set.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_adjust_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.adjust_progress_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.adjust_progress_txt.setBackgroundColor(Color.parseColor("#636365"));
                        EditActivity.this.blur_rel.setEnabled(false);
                        EditActivity.this.t_adjust_set.cancel();
                    }
                }.start();
            }
        });
        this.imageblur_set = (SeekBar) findViewById(R.id.imageblur_set);
        this.imageblur_set.setMax(100);
        this.imageblur_set.setProgress(0);
        this.imageblur_set.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                EditActivity.this.imagesharp_set.setEnabled(true);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                EditActivity.this.imagesharp_set.setEnabled(false);
                EditActivity.this.imagesharp_set.setProgress(0);
                EditActivity.this.sharp_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.sharp_picture.setImageResource(R.drawable.empty);
            }

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.blur_picture.setAlpha(((float) progress) / 100.0f);
                EditActivity.this.imageblur_set.setProgress(progress);
                if (progress > 0) {
                    EditActivity.this.blur_picture.setVisibility(View.VISIBLE);
                    EditActivity.this.blur_picture.setImageBitmap(EditActivity.this.createBlurBitmap(EditActivity.this.blurbitmap, 24.0f));
                }
                if (progress == 0) {
                    EditActivity.this.blur_picture.setVisibility(View.INVISIBLE);
                    EditActivity.this.blur_picture.setImageResource(R.drawable.empty);
                }
                EditActivity.this.reset_adjust.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.sharpen_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_adjust_gone.start();
                EditActivity.this.t_adjust_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.sharpen_ic.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.sharpen_txt.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.imagesharp_set.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_adjust_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.adjust_progress_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.adjust_progress_txt.setBackgroundColor(Color.parseColor("#636365"));
                        EditActivity.this.sharpen_rel.setEnabled(false);
                        EditActivity.this.t_adjust_set.cancel();
                    }
                }.start();
            }
        });
        this.imagesharp_set = (SeekBar) findViewById(R.id.imagesharp_set);
        this.imagesharp_set.setMax(100);
        this.imagesharp_set.setProgress(0);
        this.imagesharp_set.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                EditActivity.this.imageblur_set.setEnabled(true);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                EditActivity.this.imageblur_set.setEnabled(false);
                EditActivity.this.imageblur_set.setProgress(0);
                EditActivity.this.blur_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.blur_picture.setImageResource(R.drawable.empty);
            }

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.sharp_picture.setAlpha(((float) progress) / 100.0f);
                EditActivity.this.imagesharp_set.setProgress(progress);
                if (progress > 0) {
                    EditActivity.this.sharp_picture.setVisibility(View.VISIBLE);
                    EditActivity.this.sharp_picture.setImageBitmap(EditActivity.this.createSharpBitmap(EditActivity.this.resizedbitmap, EditActivity.this.matrix_sharpen));
                }
                if (progress == 0) {
                    EditActivity.this.sharp_picture.setVisibility(View.INVISIBLE);
                    EditActivity.this.sharp_picture.setImageResource(R.drawable.empty);
                }
                EditActivity.this.reset_adjust.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.saturation_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_adjust_gone.start();
                EditActivity.this.t_adjust_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.saturation_ic.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.saturation_txt.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.imagesaturation_set.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_adjust_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.adjust_progress_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.adjust_progress_txt.setBackgroundColor(Color.parseColor("#636365"));
                        EditActivity.this.saturation_rel.setEnabled(false);
                        EditActivity.this.t_adjust_set.cancel();
                    }
                }.start();
            }
        });
        this.imagesaturation_set = (SeekBar) findViewById(R.id.imagesaturation_set);
        this.imagesaturation_set.setMax(510);
        this.imagesaturation_set.setProgress(255);
        this.imagesaturation_set.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.format("%.0f", new Object[]{Double.valueOf((((double) progress) / 2.55d) - 100.0d)}));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                float contrast = ((float) EditActivity.this.imagecontrast_set.getProgress()) / 255.0f;
                float brightness = ((float) EditActivity.this.imagebrightness_set.getProgress()) - 255.0f;
                EditActivity.this.imagesaturation_set.setProgress(progress);
                ColorMatrix matrixA = new ColorMatrix();
                matrixA.setSaturation((((float) progress) * 1.0f) / 255.0f);
                matrixA.setConcat(new ColorMatrix(new float[]{contrast, 0.0f, 0.0f, 0.0f, brightness, 0.0f, contrast, 0.0f, 0.0f, brightness, 0.0f, 0.0f, contrast, 0.0f, brightness, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}), matrixA);
                ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrixA);
                EditActivity.this.blur_picture.setColorFilter(filter);
                EditActivity.this.sharp_picture.setColorFilter(filter);
                EditActivity.this.picture.setColorFilter(filter);
                EditActivity.this.grain_picture.setColorFilter(filter);
                EditActivity.this.reset_adjust.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.contrast_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_adjust_gone.start();
                EditActivity.this.t_adjust_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.contrast_ic.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.contrast_txt.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.imagecontrast_set.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_adjust_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.adjust_progress_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.adjust_progress_txt.setBackgroundColor(Color.parseColor("#636365"));
                        EditActivity.this.contrast_rel.setEnabled(false);
                        EditActivity.this.t_adjust_set.cancel();
                    }
                }.start();
            }
        });
        this.imagecontrast_set = (SeekBar) findViewById(R.id.imagecontrast_set);
        this.imagecontrast_set.setMax(510);
        this.imagecontrast_set.setProgress(255);
        this.imagecontrast_set.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.format("%.0f", new Object[]{Double.valueOf((((double) progress) / 2.55d) - 100.0d)}));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                float saturation = ((float) EditActivity.this.imagesaturation_set.getProgress()) / 255.0f;
                float contrast = ((float) EditActivity.this.imagecontrast_set.getProgress()) / 255.0f;
                float brightness = ((float) EditActivity.this.imagebrightness_set.getProgress()) - 255.0f;
                EditActivity.this.imagecontrast_set.setProgress(progress);
                ColorMatrix matrixA = new ColorMatrix();
                matrixA.setSaturation(saturation);
                matrixA.setConcat(new ColorMatrix(new float[]{contrast, 0.0f, 0.0f, 0.0f, brightness, 0.0f, contrast, 0.0f, 0.0f, brightness, 0.0f, 0.0f, contrast, 0.0f, brightness, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}), matrixA);
                ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrixA);
                EditActivity.this.blur_picture.setColorFilter(filter);
                EditActivity.this.sharp_picture.setColorFilter(filter);
                EditActivity.this.picture.setColorFilter(filter);
                EditActivity.this.grain_picture.setColorFilter(filter);
                EditActivity.this.reset_adjust.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.brightness_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_adjust_gone.start();
                EditActivity.this.t_adjust_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.brightness_ic.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.brightness_txt.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.imagebrightness_set.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_adjust_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.adjust_progress_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.adjust_progress_txt.setBackgroundResource(R.drawable.state_lightness);
                        EditActivity.this.brightness_rel.setEnabled(false);
                        EditActivity.this.t_adjust_set.cancel();
                    }
                }.start();
            }
        });
        this.imagebrightness_set = (SeekBar) findViewById(R.id.imagebrightness_set);
        this.imagebrightness_set.setMax(510);
        this.imagebrightness_set.setProgress(255);
        this.imagebrightness_set.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.format("%.0f", new Object[]{Double.valueOf((((double) progress) / 2.55d) - 100.0d)}));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                float saturation = ((float) EditActivity.this.imagesaturation_set.getProgress()) / 255.0f;
                float contrast = ((float) EditActivity.this.imagecontrast_set.getProgress()) / 255.0f;
                float brightness = ((float) EditActivity.this.imagebrightness_set.getProgress()) - 255.0f;
                EditActivity.this.imagebrightness_set.setProgress(progress);
                ColorMatrix matrixA = new ColorMatrix();
                matrixA.setSaturation(saturation);
                matrixA.setConcat(new ColorMatrix(new float[]{contrast, 0.0f, 0.0f, 0.0f, brightness, 0.0f, contrast, 0.0f, 0.0f, brightness, 0.0f, 0.0f, contrast, 0.0f, brightness, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}), matrixA);
                ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrixA);
                EditActivity.this.blur_picture.setColorFilter(filter);
                EditActivity.this.sharp_picture.setColorFilter(filter);
                EditActivity.this.picture.setColorFilter(filter);
                EditActivity.this.grain_picture.setColorFilter(filter);
                EditActivity.this.reset_adjust.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.colorize_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_adjust_gone.start();
                EditActivity.this.t_adjust_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.colorize_ic.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.colorize_txt.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.image_hue_set.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_adjust_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.adjust_progress_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.adjust_progress_txt.setBackgroundResource(R.drawable.seekbar_color);
                        EditActivity.this.colorize_picture.setAlpha(0.4f);
                        EditActivity.this.colorize_rel.setEnabled(false);
                        EditActivity.this.t_adjust_set.cancel();
                    }
                }.start();
            }
        });
        this.image_hue_set = (SeekBar) findViewById(R.id.image_hue_set);
        this.image_hue_set.setMax(360);
        this.image_hue_set.setProgress(0);
        this.image_hue_set.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress_colorize, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress_colorize));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.image_hue_set.setProgress(progress_colorize);
                if (progress_colorize == 0) {
                    EditActivity.this.colorize_picture.setVisibility(View.INVISIBLE);
                    EditActivity.this.colorize_picture.setImageResource(R.drawable.empty);
                }
                if (progress_colorize > 0) {
                    EditActivity.this.colorize_picture.setColorFilter(Color.parseColor(String.format("#%06X", new Object[]{Integer.valueOf(16777215 & ColorUtils.HSLToColor(new float[]{(float) progress_colorize, 0.8f, 0.5f}))})), PorterDuff.Mode.ADD);
                    EditActivity.this.colorize_picture.setVisibility(View.VISIBLE);
                    EditActivity.this.colorize_picture.setImageBitmap(EditActivity.this.resizedbitmap);
                }
                EditActivity.this.reset_adjust.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.grain_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_adjust_gone.start();
                EditActivity.this.t_adjust_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.grain_ic.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.grain_txt.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.image_grain_set.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_adjust_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.adjust_progress_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.adjust_progress_txt.setBackgroundColor(Color.parseColor("#636365"));
                        EditActivity.this.grain_rel.setEnabled(false);
                        EditActivity.this.t_adjust_set.cancel();
                    }
                }.start();
            }
        });
        this.image_grain_set = (SeekBar) findViewById(R.id.image_grain_set);
        this.image_grain_set.setMax(100);
        this.image_grain_set.setProgress(0);
        this.image_grain_set.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.grain_picture.setAlpha(((float) progress) / 100.0f);
                EditActivity.this.image_grain_set.setProgress(progress);
                if (progress > 0) {
                    EditActivity.this.grain_picture.setVisibility(View.VISIBLE);
                    EditActivity.this.grain_picture.setImageBitmap(EditActivity.this.createSharpBitmap(EditActivity.this.grainbitmap, EditActivity.this.matrix_sharpen));
                }
                if (progress == 0) {
                    EditActivity.this.grain_picture.setVisibility(View.INVISIBLE);
                    EditActivity.this.grain_picture.setImageResource(R.drawable.empty);
                }
                EditActivity.this.reset_adjust.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.shadows_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.shadows_picture.setImageBitmap(EditActivity.this.takeScreenshot(EditActivity.this.picture));
                EditActivity.this.t_adjust_gone.start();
                EditActivity.this.t_adjust_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.shadows_ic.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.shadows_txt.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.image_shadows_set.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_adjust_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.adjust_progress_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.adjust_progress_txt.setBackgroundColor(Color.parseColor("#636365"));
                        EditActivity.this.shadows_rel.setEnabled(false);
                        EditActivity.this.t_adjust_set.cancel();
                    }
                }.start();
            }
        });
        this.image_shadows_set = (SeekBar) findViewById(R.id.image_shadows_set);
        this.image_shadows_set.setMax(100);
        this.image_shadows_set.setProgress(0);
        this.image_shadows_set.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.shadows_picture.setAlpha(((float) progress) / 100.0f);
                EditActivity.this.image_shadows_set.setProgress(progress);
                if (progress > 0) {
                    EditActivity.this.shadows_picture.setVisibility(View.VISIBLE);
                    EditActivity.this.shadows_picture.setColorFilter(Color.parseColor("#212121"), PorterDuff.Mode.OVERLAY);
                }
                if (progress == 0) {
                    EditActivity.this.shadows_picture.setVisibility(View.INVISIBLE);
                }
                EditActivity.this.reset_adjust.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.highlights_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.highlights_picture.setImageBitmap(EditActivity.this.takeScreenshot(EditActivity.this.picture));
                EditActivity.this.t_adjust_gone.start();
                EditActivity.this.t_adjust_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.highlights_ic.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.highlights_txt.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.image_highlights_set.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_adjust_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.adjust_progress_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.adjust_progress_txt.setBackgroundColor(Color.parseColor("#636365"));
                        EditActivity.this.highlights_rel.setEnabled(false);
                        EditActivity.this.t_adjust_set.cancel();
                    }
                }.start();
            }
        });
        this.image_highlights_set = (SeekBar) findViewById(R.id.image_highlights_set);
        this.image_highlights_set.setMax(100);
        this.image_highlights_set.setProgress(0);
        this.image_highlights_set.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.highlights_picture.setAlpha(((float) progress) / 100.0f);
                EditActivity.this.image_highlights_set.setProgress(progress);
                if (progress > 0) {
                    EditActivity.this.highlights_picture.setVisibility(View.VISIBLE);
                    EditActivity.this.highlights_picture.setColorFilter(Color.parseColor("#FAFAFA"), PorterDuff.Mode.OVERLAY);
                }
                if (progress == 0) {
                    EditActivity.this.highlights_picture.setVisibility(View.INVISIBLE);
                }
                EditActivity.this.reset_adjust.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.fade_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.fade_picture.setImageBitmap(EditActivity.this.takeScreenshot(EditActivity.this.picture));
                EditActivity.this.t_adjust_gone.start();
                EditActivity.this.t_adjust_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.fade_ic.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.fade_txt.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.image_fade_set.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_adjust_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.adjust_progress_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.adjust_progress_txt.setBackgroundColor(Color.parseColor("#636365"));
                        EditActivity.this.fade_rel.setEnabled(false);
                        EditActivity.this.t_adjust_set.cancel();
                    }
                }.start();
            }
        });
        this.image_fade_set = (SeekBar) findViewById(R.id.image_fade_set);
        this.image_fade_set.setMax(100);
        this.image_fade_set.setProgress(0);
        this.image_fade_set.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.fade_picture.setAlpha(((float) progress) / 100.0f);
                EditActivity.this.image_fade_set.setProgress(progress);
                if (progress > 0) {
                    EditActivity.this.fade_picture.setVisibility(View.VISIBLE);
                    EditActivity.this.fade_picture.setColorFilter(Color.parseColor("#757575"), PorterDuff.Mode.LIGHTEN);
                }
                if (progress == 0) {
                    EditActivity.this.fade_picture.setVisibility(View.INVISIBLE);
                }
                EditActivity.this.reset_adjust.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.t_center_img = new CountDownTimer(100, 1) {
            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                PointF DownPT = new PointF();
                EditActivity.this.move_picture.setX((float) ((int) DownPT.x));
                EditActivity.this.move_picture.setY((float) ((int) DownPT.y));
                EditActivity.this.move_dot_picture.setX((float) ((int) DownPT.x));
                EditActivity.this.move_dot_picture.setY((float) ((int) DownPT.y));
                new PointF(EditActivity.this.gridview.getX(), EditActivity.this.gridview.getY());
                EditActivity.this.t_center_img.cancel();
            }
        };
        this.move_dot_picture = (ImageView) findViewById(R.id.move_dot_picture);
        this.move_dot_picture.setVisibility(View.INVISIBLE);
        findViewById(R.id.move_dot_picture).setOnTouchListener(new View.OnTouchListener() {
            PointF DownPT = new PointF();
            PointF StartPT = new PointF();
            private GestureDetector gestureDetector;

            {
                this.gestureDetector = new GestureDetector(EditActivity.this, new GestureDetector.SimpleOnGestureListener() {
                    public boolean onDoubleTap(MotionEvent e) {
                        EditActivity.this.t_center_img.start();
                        return super.onDoubleTap(e);
                    }
                });
            }

            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case 0:
                        this.DownPT.x = event.getX();
                        this.DownPT.y = event.getY();
                        this.StartPT = new PointF(EditActivity.this.move_dot_picture.getX(), EditActivity.this.move_dot_picture.getY());
                        break;
                    case 1:
                        EditActivity.this.gridview.setVisibility(View.INVISIBLE);
                        break;
                    case 2:
                        EditActivity.this.gridview.setVisibility(View.VISIBLE);
                        EditActivity.this.reset_crop.setTextColor(Color.parseColor("#FFFFFF"));
                        PointF mv = new PointF(event.getX() - this.DownPT.x, event.getY() - this.DownPT.y);
                        EditActivity.this.move_picture.setX((float) ((int) (this.StartPT.x + mv.x)));
                        EditActivity.this.move_picture.setY((float) ((int) (this.StartPT.y + mv.y)));
                        EditActivity.this.move_dot_picture.setX((float) ((int) (this.StartPT.x + mv.x)));
                        EditActivity.this.move_dot_picture.setY((float) ((int) (this.StartPT.y + mv.y)));
                        this.StartPT = new PointF(EditActivity.this.move_dot_picture.getX(), EditActivity.this.move_dot_picture.getY());
                        break;
                }
                this.gestureDetector.onTouchEvent(event);
                return true;
            }
        });
        this.t_crop_gone = new CountDownTimer(25, 1) {
            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                EditActivity.this.zoom_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.rotate360_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.modify_h_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.modify_v_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.zoom_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.rotate360_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.modify_h_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.modify_v_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.imagescale_xy_set.setVisibility(View.INVISIBLE);
                EditActivity.this.imagerotate_set.setVisibility(View.INVISIBLE);
                EditActivity.this.modify_h_set.setVisibility(View.INVISIBLE);
                EditActivity.this.modify_v_set.setVisibility(View.INVISIBLE);
                EditActivity.this.zoom_rel.setEnabled(true);
                EditActivity.this.rotate360_rel.setEnabled(true);
                EditActivity.this.modify_h_rel.setEnabled(true);
                EditActivity.this.modify_v_rel.setEnabled(true);
                EditActivity.this.t_crop_gone.cancel();
            }
        };
        this.reset_crop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.save_txt.setVisibility(View.INVISIBLE);
                EditActivity.this.savecustom_txt.setVisibility(View.VISIBLE);
                int w = Integer.valueOf(EditActivity.this.bitmap_width.getText().toString()).intValue();
                int h = Integer.valueOf(EditActivity.this.bitmap_height.getText().toString()).intValue();
                RelativeLayout.LayoutParams parmeter = new RelativeLayout.LayoutParams((EditActivity.this.main_layout.getHeight() * w) / h, (EditActivity.this.main_layout.getWidth() * h) / w);
                parmeter.addRule(15);
                parmeter.addRule(14);
                EditActivity.this.preview_layout.setLayoutParams(parmeter);
                EditActivity.this.original_ic.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.original_txt.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.square_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.square_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.custom_ar_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.custom_ar_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.t_crop_gone.start();
                EditActivity.this.t_center_img.start();
                if (EditActivity.this.flip_on.getVisibility() != View.VISIBLE) {
                    EditActivity.this.flip_off.performClick();
                }
                if (EditActivity.this.mirror_on.getVisibility() != View.VISIBLE) {
                    EditActivity.this.mirror_off.performClick();
                }
                EditActivity.this.imagerotate_set.setProgress(0);
                EditActivity.this.imagescale_xy_set.setProgress(100);
                EditActivity.this.modify_v_set.setProgress(25);
                EditActivity.this.modify_h_set.setProgress(25);
                EditActivity.this.reset_crop.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.crop_scroll.fullScroll(17);
                EditActivity.this.seekbars_crop_bg.setVisibility(View.INVISIBLE);
                EditActivity.this.crop_progress_txt.setVisibility(View.INVISIBLE);
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }
        });
        this.original_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.save_txt.setVisibility(View.INVISIBLE);
                EditActivity.this.savecustom_txt.setVisibility(View.VISIBLE);
                int w = Integer.valueOf(EditActivity.this.bitmap_width.getText().toString()).intValue();
                int h = Integer.valueOf(EditActivity.this.bitmap_height.getText().toString()).intValue();
                RelativeLayout.LayoutParams parmeter = new RelativeLayout.LayoutParams((EditActivity.this.main_layout.getHeight() * w) / h, (EditActivity.this.main_layout.getWidth() * h) / w);
                parmeter.addRule(15);
                parmeter.addRule(14);
                EditActivity.this.preview_layout.setLayoutParams(parmeter);
                EditActivity.this.original_ic.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.original_txt.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.square_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.square_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.custom_ar_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.custom_ar_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.reset_crop.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.square_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.save_txt.setVisibility(View.VISIBLE);
                EditActivity.this.savecustom_txt.setVisibility(View.INVISIBLE);
                int width = EditActivity.this.main_layout.getWidth();
                EditActivity.this.wpx.setText(String.valueOf(width * 2));
                EditActivity.this.hpx.setText(String.valueOf(width * 2));
                RelativeLayout.LayoutParams parmeter = new RelativeLayout.LayoutParams(width, width);
                parmeter.addRule(15);
                parmeter.addRule(14);
                EditActivity.this.preview_layout.setLayoutParams(parmeter);
                EditActivity.this.original_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.original_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.square_ic.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.square_txt.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.custom_ar_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.custom_ar_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.reset_crop.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.done_custom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.save_txt.setVisibility(View.INVISIBLE);
                EditActivity.this.savecustom_txt.setVisibility(View.VISIBLE);
                int new_width = Integer.valueOf(EditActivity.this.wpx.getText().toString()).intValue();
                int new_height = Integer.valueOf(EditActivity.this.hpx.getText().toString()).intValue();
                RelativeLayout.LayoutParams parmeter = new RelativeLayout.LayoutParams((EditActivity.this.main_layout.getHeight() * new_width) / new_height, (EditActivity.this.main_layout.getWidth() * new_height) / new_width);
                parmeter.addRule(15);
                parmeter.addRule(14);
                EditActivity.this.preview_layout.setLayoutParams(parmeter);
                EditActivity.this.wpx.requestFocus();
                EditActivity.this.wpx.setSelection(EditActivity.this.wpx.getText().length());
                EditActivity.this.custom_aspect.setVisibility(View.INVISIBLE);
                ((InputMethodManager) EditActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(EditActivity.this.wpx.getWindowToken(), 0);
                EditActivity.this.move_dot_empty.setVisibility(View.INVISIBLE);
                EditActivity.this.set_picture.setVisibility(View.VISIBLE);
                EditActivity.this.seekbars_crop.setVisibility(View.VISIBLE);
                EditActivity.this.basics_all.setVisibility(View.VISIBLE);
            }
        });
        this.custom_ar_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.save_txt.setVisibility(View.INVISIBLE);
                EditActivity.this.savecustom_txt.setVisibility(View.VISIBLE);
                EditActivity.this.custom_aspect.setVisibility(View.VISIBLE);
                EditActivity.this.wpx.requestFocus();
                EditActivity.this.wpx.setSelection(EditActivity.this.wpx.getText().length());
                if (EditActivity.this.wpx.getText().length() > 0) {
                    int wpx_number = Integer.parseInt(EditActivity.this.wpx.getText().toString());
                    if (wpx_number <= 39 || wpx_number >= 5001) {
                        EditActivity.this.done_custom.setEnabled(false);
                        EditActivity.this.done_custom.setTextColor(Color.parseColor("#636365"));
                        EditActivity.this.car_hint_txt.setTextColor(Color.parseColor("#06EFFF"));
                        EditActivity.this.hpx.setEnabled(false);
                    } else {
                        EditActivity.this.done_custom.setEnabled(true);
                        EditActivity.this.done_custom.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.car_hint_txt.setTextColor(Color.parseColor("#636365"));
                        EditActivity.this.hpx.setEnabled(true);
                    }
                }
                ((InputMethodManager) EditActivity.this.getSystemService("input_method")).toggleSoftInput(2, 0);
                EditActivity.this.move_dot_empty.setVisibility(View.VISIBLE);
                EditActivity.this.set_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.seekbars_crop.setVisibility(View.INVISIBLE);
                EditActivity.this.basics_all.setVisibility(View.INVISIBLE);
                EditActivity.this.original_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.original_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.square_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.square_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.custom_ar_ic.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.custom_ar_txt.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.reset_crop.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.rotate_p_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_crop_set = new CountDownTimer(250, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.t_crop_gone.cancel();
                    }
                }.start();
                EditActivity.this.imagerotate_set.setProgress(EditActivity.this.imagerotate_set.getProgress() + 90);
                if (EditActivity.this.imagerotate_set.getVisibility() == View.VISIBLE) {
                    EditActivity.this.reset_crop.setTextColor(Color.parseColor("#FFFFFF"));
                } else {
                    EditActivity.this.rotate360_rel.performClick();
                }
            }
        });
        this.rotate_m_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditActivity.this.t_crop_set = new CountDownTimer(250, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.t_crop_gone.cancel();
                    }
                }.start();
                EditActivity.this.imagerotate_set.setProgress(EditActivity.this.imagerotate_set.getProgress() - 90);
                if (EditActivity.this.imagerotate_set.getVisibility() == View.VISIBLE) {
                    EditActivity.this.reset_crop.setTextColor(Color.parseColor("#FFFFFF"));
                } else {
                    EditActivity.this.rotate360_rel.performClick();
                }
            }
        });
        this.flip_on.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.flip_ic.setScaleY(-1.0f);
                EditActivity.this.picture.setScaleY(-1.0f);
                EditActivity.this.colorize_picture.setScaleY(-1.0f);
                EditActivity.this.blur_picture.setScaleY(-1.0f);
                EditActivity.this.sharp_picture.setScaleY(-1.0f);
                EditActivity.this.grain_picture.setScaleY(-1.0f);
                EditActivity.this.fade_picture.setScaleY(-1.0f);
                EditActivity.this.highlights_picture.setScaleY(-1.0f);
                EditActivity.this.shadows_picture.setScaleY(-1.0f);
                EditActivity.this.filter_picture_bg.setScaleY(-1.0f);
                EditActivity.this.filter_picture.setScaleY(-1.0f);
                EditActivity.this.hsl_picture1.setScaleY(-1.0f);
                EditActivity.this.hsl_picture2.setScaleY(-1.0f);
                EditActivity.this.hsl_picture3.setScaleY(-1.0f);
                EditActivity.this.hsl_picture4.setScaleY(-1.0f);
                EditActivity.this.hsl_picture5.setScaleY(-1.0f);
                EditActivity.this.hsl_picture6.setScaleY(-1.0f);
                EditActivity.this.mergedimg.setScaleY(-1.0f);
                EditActivity.this.flip_ic.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.flip_txt.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.flip_on.setVisibility(View.INVISIBLE);
                EditActivity.this.flip_off.setVisibility(View.VISIBLE);
                EditActivity.this.reset_crop.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.flip_off.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.flip_ic.setScaleY(1.0f);
                EditActivity.this.picture.setScaleY(1.0f);
                EditActivity.this.colorize_picture.setScaleY(1.0f);
                EditActivity.this.blur_picture.setScaleY(1.0f);
                EditActivity.this.sharp_picture.setScaleY(1.0f);
                EditActivity.this.grain_picture.setScaleY(1.0f);
                EditActivity.this.fade_picture.setScaleY(1.0f);
                EditActivity.this.highlights_picture.setScaleY(1.0f);
                EditActivity.this.shadows_picture.setScaleY(1.0f);
                EditActivity.this.filter_picture_bg.setScaleY(1.0f);
                EditActivity.this.filter_picture.setScaleY(1.0f);
                EditActivity.this.hsl_picture1.setScaleY(1.0f);
                EditActivity.this.hsl_picture2.setScaleY(1.0f);
                EditActivity.this.hsl_picture3.setScaleY(1.0f);
                EditActivity.this.hsl_picture4.setScaleY(1.0f);
                EditActivity.this.hsl_picture5.setScaleY(1.0f);
                EditActivity.this.hsl_picture6.setScaleY(1.0f);
                EditActivity.this.mergedimg.setScaleY(1.0f);
                EditActivity.this.flip_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.flip_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.flip_on.setVisibility(View.VISIBLE);
                EditActivity.this.flip_off.setVisibility(View.INVISIBLE);
            }
        });
        this.mirror_on.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.mirror_ic.setScaleX(-1.0f);
                EditActivity.this.picture.setScaleX(-1.0f);
                EditActivity.this.colorize_picture.setScaleX(-1.0f);
                EditActivity.this.blur_picture.setScaleX(-1.0f);
                EditActivity.this.sharp_picture.setScaleX(-1.0f);
                EditActivity.this.grain_picture.setScaleX(-1.0f);
                EditActivity.this.fade_picture.setScaleX(-1.0f);
                EditActivity.this.highlights_picture.setScaleX(-1.0f);
                EditActivity.this.shadows_picture.setScaleX(-1.0f);
                EditActivity.this.filter_picture_bg.setScaleX(-1.0f);
                EditActivity.this.filter_picture.setScaleX(-1.0f);
                EditActivity.this.hsl_picture1.setScaleX(-1.0f);
                EditActivity.this.hsl_picture2.setScaleX(-1.0f);
                EditActivity.this.hsl_picture3.setScaleX(-1.0f);
                EditActivity.this.hsl_picture4.setScaleX(-1.0f);
                EditActivity.this.hsl_picture5.setScaleX(-1.0f);
                EditActivity.this.hsl_picture6.setScaleX(-1.0f);
                EditActivity.this.mergedimg.setScaleX(-1.0f);
                EditActivity.this.mirror_ic.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.mirror_txt.setTextColor(Color.parseColor("#FFFFFF"));
                EditActivity.this.mirror_on.setVisibility(View.INVISIBLE);
                EditActivity.this.mirror_off.setVisibility(View.VISIBLE);
                EditActivity.this.reset_crop.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.mirror_off.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.mirror_ic.setScaleX(1.0f);
                EditActivity.this.picture.setScaleX(1.0f);
                EditActivity.this.colorize_picture.setScaleX(1.0f);
                EditActivity.this.blur_picture.setScaleX(1.0f);
                EditActivity.this.sharp_picture.setScaleX(1.0f);
                EditActivity.this.grain_picture.setScaleX(1.0f);
                EditActivity.this.fade_picture.setScaleX(1.0f);
                EditActivity.this.highlights_picture.setScaleX(1.0f);
                EditActivity.this.shadows_picture.setScaleX(1.0f);
                EditActivity.this.filter_picture_bg.setScaleX(1.0f);
                EditActivity.this.filter_picture.setScaleX(1.0f);
                EditActivity.this.hsl_picture1.setScaleX(1.0f);
                EditActivity.this.hsl_picture2.setScaleX(1.0f);
                EditActivity.this.hsl_picture3.setScaleX(1.0f);
                EditActivity.this.hsl_picture4.setScaleX(1.0f);
                EditActivity.this.hsl_picture5.setScaleX(1.0f);
                EditActivity.this.hsl_picture6.setScaleX(1.0f);
                EditActivity.this.mergedimg.setScaleX(1.0f);
                EditActivity.this.mirror_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.mirror_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.mirror_on.setVisibility(View.VISIBLE);
                EditActivity.this.mirror_off.setVisibility(View.INVISIBLE);
            }
        });
        this.zoom_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_crop_gone.start();
                EditActivity.this.t_crop_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.zoom_ic.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.zoom_txt.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.seekbars_crop.setVisibility(View.VISIBLE);
                        EditActivity.this.imagescale_xy_set.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_crop_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.crop_progress_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.zoom_rel.setEnabled(false);
                        EditActivity.this.t_crop_set.cancel();
                    }
                }.start();
            }
        });
        this.imagescale_xy_set = (SeekBar) findViewById(R.id.imagescale_xy_set);
        this.imagescale_xy_set.setMax(1000);
        this.imagescale_xy_set.setProgress(100);
        this.imagescale_xy_set.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress_xy, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress_xy));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.move_picture.setScaleX(((float) progress_xy) / 100.0f);
                EditActivity.this.move_picture.setScaleY(((float) progress_xy) / 100.0f);
                if (((float) progress_xy) < 100.0f) {
                    EditActivity.this.move_dot_picture.setScaleX(1.0f);
                    EditActivity.this.move_dot_picture.setScaleY(1.0f);
                } else {
                    EditActivity.this.move_dot_picture.setScaleX(((float) progress_xy) / 100.0f);
                    EditActivity.this.move_dot_picture.setScaleY(((float) progress_xy) / 100.0f);
                }
                EditActivity.this.imagescale_xy_set.setProgress(progress_xy);
                EditActivity.this.reset_crop.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.rotate360_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_crop_gone.start();
                EditActivity.this.t_crop_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.rotate360_ic.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.rotate360_txt.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.seekbars_crop.setVisibility(View.VISIBLE);
                        EditActivity.this.imagerotate_set.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_crop_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.crop_progress_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.rotate360_rel.setEnabled(false);
                        EditActivity.this.t_crop_set.cancel();
                    }
                }.start();
            }
        });
        this.imagerotate_set = (SeekBar) findViewById(R.id.imagerotate_set);
        this.imagerotate_set.setMax(360);
        this.imagerotate_set.setProgress(0);
        this.imagerotate_set.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress360, boolean fromUser) {
                EditActivity.this.value_txt.setText(String.valueOf(progress360));
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.move_picture.setRotation((float) progress360);
                EditActivity.this.imagerotate_set.setProgress(progress360);
                EditActivity.this.reset_crop.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.modify_h_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_crop_gone.start();
                EditActivity.this.t_crop_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.modify_h_ic.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.modify_h_txt.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.seekbars_crop.setVisibility(View.VISIBLE);
                        EditActivity.this.modify_h_set.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_crop_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.crop_progress_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.modify_h_rel.setEnabled(false);
                        EditActivity.this.t_crop_set.cancel();
                    }
                }.start();
            }
        });
        this.modify_h_set = (SeekBar) findViewById(R.id.modify_h_set);
        this.modify_h_set.setMax(50);
        this.modify_h_set.setProgress(25);
        this.modify_h_set.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar arg0, int progress, boolean fromUser) {
                if (progress < 25) {
                    EditActivity.this.value_txt.setText(String.valueOf((progress + 25) - 50));
                } else {
                    EditActivity.this.value_txt.setText(String.valueOf(progress - 25));
                }
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.move_picture.setRotationX((float) ((progress - 25) / 2));
                EditActivity.this.modify_h_set.setProgress(progress);
                EditActivity.this.reset_crop.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        this.modify_v_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_crop_gone.start();
                EditActivity.this.t_crop_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.modify_v_ic.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.modify_v_txt.setTextColor(Color.parseColor("#FFFFFF"));
                        EditActivity.this.seekbars_crop.setVisibility(View.VISIBLE);
                        EditActivity.this.modify_v_set.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_crop_bg.setVisibility(View.VISIBLE);
                        EditActivity.this.crop_progress_txt.setVisibility(View.VISIBLE);
                        EditActivity.this.modify_v_rel.setEnabled(false);
                        EditActivity.this.t_crop_set.cancel();
                    }
                }.start();
            }
        });
        this.modify_v_set = (SeekBar) findViewById(R.id.modify_v_set);
        this.modify_v_set.setMax(50);
        this.modify_v_set.setProgress(25);
        this.modify_v_set.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                EditActivity.this.value_rel.setVisibility(View.INVISIBLE);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar arg0, int progress, boolean fromUser) {
                if (progress < 25) {
                    EditActivity.this.value_txt.setText(String.valueOf((progress + 25) - 50));
                } else {
                    EditActivity.this.value_txt.setText(String.valueOf(progress - 25));
                }
                EditActivity.this.value_rel.setVisibility(View.VISIBLE);
                EditActivity.this.move_picture.setRotationY(((float) (progress - 25)) / 2.0f);
                EditActivity.this.modify_v_set.setProgress(progress);
                EditActivity.this.reset_crop.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        findViewById(R.id.compare_txt).setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case 0:
                        EditActivity.this.filtered_rel.setVisibility(View.VISIBLE);
                        EditActivity.this.effect_view.setVisibility(View.VISIBLE);
                        EditActivity.this.erase_move_all.setVisibility(View.VISIBLE);
                        return true;
                    case 1:
                        EditActivity.this.filtered_rel.setVisibility(View.VISIBLE);
                        EditActivity.this.effect_view.setVisibility(View.VISIBLE);
                        EditActivity.this.erase_move_all.setVisibility(View.VISIBLE);
                        return true;
                    case 2:
                        EditActivity.this.filtered_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.effect_view.setVisibility(View.INVISIBLE);
                        EditActivity.this.erase_move_all.setVisibility(View.INVISIBLE);
                        return true;
                    default:
                        return true;
                }
            }
        });
        this.t_menu_gone = new CountDownTimer(25, 1) {
            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                EditActivity.this.crop_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.adjust_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.hsl_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.filter_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.effect_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.collage_ic.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.crop_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.adjust_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.hsl_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.filter_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.effect_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.collage_txt.setTextColor(Color.parseColor("#636365"));
                EditActivity.this.set_crop.setVisibility(View.INVISIBLE);
                EditActivity.this.set_adjust.setVisibility(View.INVISIBLE);
                EditActivity.this.set_hsl.setVisibility(View.INVISIBLE);
                EditActivity.this.set_filter.setVisibility(View.INVISIBLE);
                EditActivity.this.set_effect.setVisibility(View.INVISIBLE);
                EditActivity.this.set_collage.setVisibility(View.INVISIBLE);
                EditActivity.this.move_dot_empty.setVisibility(View.VISIBLE);
                EditActivity.this.move_dot_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.move_dot_erase.setVisibility(View.INVISIBLE);
                EditActivity.this.reset_crop.setVisibility(View.INVISIBLE);
                EditActivity.this.reset_adjust.setVisibility(View.INVISIBLE);
                EditActivity.this.reset_hsl.setVisibility(View.INVISIBLE);
                EditActivity.this.reset_filter.setVisibility(View.INVISIBLE);
                EditActivity.this.reset_effect.setVisibility(View.INVISIBLE);
                EditActivity.this.reset_collage.setVisibility(View.INVISIBLE);
                EditActivity.this.seekbars_crop.setVisibility(View.INVISIBLE);
                EditActivity.this.seekbars_adjust.setVisibility(View.INVISIBLE);
                EditActivity.this.seekbars_hsl.setVisibility(View.INVISIBLE);
                EditActivity.this.seekbars_filter.setVisibility(View.INVISIBLE);
                EditActivity.this.seekbars_effect.setVisibility(View.INVISIBLE);
                EditActivity.this.seekbars_collage.setVisibility(View.INVISIBLE);
                EditActivity.this.crop_rel.setEnabled(true);
                EditActivity.this.adjust_rel.setEnabled(true);
                EditActivity.this.hsl_rel.setEnabled(true);
                EditActivity.this.filter_rel.setEnabled(true);
                EditActivity.this.effect_rel.setEnabled(true);
                EditActivity.this.collage_rel.setEnabled(true);
                EditActivity.this.t_menu_gone.cancel();
            }
        };
        this.crop_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_menu_gone.start();
                EditActivity.this.t_menu_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.menu_txt.setText(EditActivity.this.getResources().getString(R.string.top_menu_1));
                        EditActivity.this.crop_ic.setTextColor(Color.parseColor("#06EFFF"));
                        EditActivity.this.crop_txt.setTextColor(Color.parseColor("#06EFFF"));
                        EditActivity.this.set_crop.setVisibility(View.VISIBLE);
                        EditActivity.this.crop_scroll.fullScroll(17);
                        EditActivity.this.move_dot_empty.setVisibility(View.INVISIBLE);
                        EditActivity.this.move_dot_picture.setVisibility(View.VISIBLE);
                        EditActivity.this.reset_crop.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_crop.setVisibility(View.VISIBLE);
                        int w = Integer.valueOf(EditActivity.this.bitmap_width.getText().toString()).intValue();
                        int h = Integer.valueOf(EditActivity.this.bitmap_height.getText().toString()).intValue();
                        EditActivity.this.wpx.setText(String.valueOf(w));
                        EditActivity.this.hpx.setText(String.valueOf(h));
                        EditActivity.this.crop_rel.setEnabled(false);
                        EditActivity.this.t_menu_set.cancel();
                        EditActivity.this.t_effect_unload();
                        EditActivity.this.t_filter_unload();
                    }
                }.start();
            }
        });
        this.adjust_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_menu_gone.start();
                EditActivity.this.t_menu_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.menu_txt.setText(EditActivity.this.getResources().getString(R.string.top_menu_2));
                        EditActivity.this.adjust_ic.setTextColor(Color.parseColor("#06EFFF"));
                        EditActivity.this.adjust_txt.setTextColor(Color.parseColor("#06EFFF"));
                        EditActivity.this.set_adjust.setVisibility(View.VISIBLE);
                        EditActivity.this.adjust_scroll.fullScroll(17);
                        EditActivity.this.reset_adjust.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_adjust.setVisibility(View.VISIBLE);
                        EditActivity.this.adjust_rel.setEnabled(false);
                        EditActivity.this.t_menu_set.cancel();
                        EditActivity.this.t_effect_unload();
                        EditActivity.this.t_filter_unload();
                    }
                }.start();
            }
        });
        this.hsl_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_menu_gone.start();
                EditActivity.this.t_menu_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.menu_txt.setText(EditActivity.this.getResources().getString(R.string.top_menu_3));
                        EditActivity.this.hsl_ic.setTextColor(Color.parseColor("#06EFFF"));
                        EditActivity.this.hsl_txt.setTextColor(Color.parseColor("#06EFFF"));
                        EditActivity.this.set_hsl.setVisibility(View.VISIBLE);
                        EditActivity.this.reset_hsl.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_hsl.setVisibility(View.VISIBLE);
                        EditActivity.this.hsl_rel.setEnabled(false);
                        EditActivity.this.t_menu_set.cancel();
                        EditActivity.this.t_effect_unload();
                        EditActivity.this.t_filter_unload();
                    }
                }.start();
            }
        });
        this.filter_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_menu_gone.start();
                EditActivity.this.t_menu_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.menu_txt.setText(EditActivity.this.getResources().getString(R.string.top_menu_4));
                        EditActivity.this.filter_ic.setTextColor(Color.parseColor("#06EFFF"));
                        EditActivity.this.filter_txt.setTextColor(Color.parseColor("#06EFFF"));
                        EditActivity.this.set_filter.setVisibility(View.VISIBLE);
                        EditActivity.this.filter_scroll.fullScroll(17);
                        EditActivity.this.reset_filter.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_filter.setVisibility(View.VISIBLE);
                        EditActivity.this.filter_rel.setEnabled(false);
                        EditActivity.this.t_menu_set.cancel();
                        EditActivity.this.t_effect_unload();
                        EditActivity.this.t_filter_load();
                    }
                }.start();
            }
        });
        this.effect_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_menu_gone.start();
                EditActivity.this.t_menu_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.menu_txt.setText(EditActivity.this.getResources().getString(R.string.top_menu_5));
                        EditActivity.this.effect_ic.setTextColor(Color.parseColor("#06EFFF"));
                        EditActivity.this.effect_txt.setTextColor(Color.parseColor("#06EFFF"));
                        EditActivity.this.set_effect.setVisibility(View.VISIBLE);
                        EditActivity.this.effect_scroll.fullScroll(17);
                        EditActivity.this.reset_effect.setVisibility(View.VISIBLE);
                        EditActivity.this.seekbars_effect.setVisibility(View.VISIBLE);
                        EditActivity.this.effect_rel.setEnabled(false);
                        EditActivity.this.t_menu_set.cancel();
                        EditActivity.this.t_effect_load();
                        EditActivity.this.t_filter_unload();
                        if (EditActivity.this.effect_view.getVisibility() == View.GONE) {
                            EditActivity.this.reset_effect.performClick();
                        }
                    }
                }.start();
            }
        });
        this.collage_rel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_menu_gone.start();
                EditActivity.this.t_menu_set = new CountDownTimer(75, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.menu_txt.setText(EditActivity.this.getResources().getString(R.string.top_menu_6));
                        EditActivity.this.collage_ic.setTextColor(Color.parseColor("#06EFFF"));
                        EditActivity.this.collage_txt.setTextColor(Color.parseColor("#06EFFF"));
                        EditActivity.this.set_collage.setVisibility(View.VISIBLE);
                        EditActivity.this.collage_scroll.fullScroll(17);
                        EditActivity.this.seekbars_collage.setVisibility(View.VISIBLE);
                        EditActivity.this.move_dot_empty.setVisibility(View.INVISIBLE);
                        EditActivity.this.move_dot_erase.setVisibility(View.VISIBLE);
                        if (EditActivity.this.eraseview.getVisibility() == View.VISIBLE) {
                            EditActivity.this.move_txt_on.performClick();
                            EditActivity.this.reset_collage.setVisibility(View.VISIBLE);
                        }
                        EditActivity.this.collage_rel.setEnabled(false);
                        EditActivity.this.t_menu_set.cancel();
                        EditActivity.this.t_effect_unload();
                        EditActivity.this.t_filter_unload();
                    }
                }.start();
            }
        });
        this.t_exit = new CountDownTimer(50, 1) {
            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                EditActivity.this.finish();
                EditActivity.this.moveTaskToBack(true);
                System.exit(0);
                EditActivity.this.t_exit.cancel();
            }
        };
        this.cancel_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.exit.setVisibility(View.INVISIBLE);
                EditActivity.this.set_picture.setVisibility(View.VISIBLE);
                EditActivity.this.basics.setVisibility(View.VISIBLE);
                EditActivity.this.basics_all.setVisibility(View.VISIBLE);
                EditActivity.this.views.setVisibility(View.VISIBLE);
                EditActivity.this.adjust_rel.performClick();
            }
        });
        this.quit_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.t_exit.start();
            }
        });
        this.restart_txt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.startActivity(new Intent(EditActivity.this, EditActivity.class));
                System.exit(0);
            }
        });
        this.save_txt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.getRateCH();
                EditActivity.this.t_save.start();
                EditActivity.this.save_txt.setEnabled(false);
                EditActivity.this.black.setVisibility(View.VISIBLE);
                EditActivity.this.set_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.basics.setVisibility(View.INVISIBLE);
                EditActivity.this.move_dot_empty.setVisibility(View.VISIBLE);
                EditActivity.this.gridview.setVisibility(View.INVISIBLE);
            }
        });
        this.t_save = new CountDownTimer(50, 1) {
            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                EditActivity.this.sharePIC();
                EditActivity.this.t_save.cancel();
            }
        };
        this.savecustom_txt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.getRateCH();
                EditActivity.this.t_savecustom.start();
                EditActivity.this.save_txt.setEnabled(false);
                EditActivity.this.black.setVisibility(View.VISIBLE);
                EditActivity.this.set_picture.setVisibility(View.INVISIBLE);
                EditActivity.this.basics.setVisibility(View.INVISIBLE);
                EditActivity.this.move_dot_empty.setVisibility(View.VISIBLE);
                EditActivity.this.gridview.setVisibility(View.INVISIBLE);
            }
        });
        this.t_savecustom = new CountDownTimer(50, 1) {
            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                EditActivity.this.sharecustomPIC();
                EditActivity.this.t_savecustom.cancel();
            }
        };
        this.t_load_enable = new CountDownTimer(500, 1) {
            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                EditActivity.this.load_rel.setEnabled(true);
                EditActivity.this.t_load_enable.cancel();
            }
        };
        image.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditActivity.this.load_rel.setEnabled(false);
                EditActivity.this.t_load_enable.start();
//                EditActivity.this.t_start_set.cancel();
                EditActivity.this.startActivityForResult(Intent.createChooser(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), EditActivity.this.getString(R.string.open_pic)), 1);
            }
        });
//        this.t_start_set = new CountDownTimer(1500, 1) {
//            public void onTick(long millisUntilFinished) {
//            }
//
//            public void onFinish() {
//                EditActivity.this.startActivityForResult(Intent.createChooser(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), EditActivity.this.getString(R.string.open_pic)), 1);
//                EditActivity.this.t_start_set.cancel();
//            }
//        }.start();
        this.t_start_setpic = new CountDownTimer(25, 1) {
            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                int w = Integer.valueOf(EditActivity.this.bitmap_width.getText().toString()).intValue();
                int h = Integer.valueOf(EditActivity.this.bitmap_height.getText().toString()).intValue();
                RelativeLayout.LayoutParams parmeter = new RelativeLayout.LayoutParams((EditActivity.this.main_layout.getHeight() * w) / h, (EditActivity.this.main_layout.getWidth() * h) / w);
                parmeter.addRule(15);
                parmeter.addRule(14);
                EditActivity.this.preview_layout.setLayoutParams(parmeter);
                EditActivity.this.resizedbitmap = Bitmap.createScaledBitmap(EditActivity.this.bitmap, w, h, false);
                EditActivity.this.blurbitmap = Bitmap.createScaledBitmap(EditActivity.this.bitmap, w / 6, h / 6, false);
                EditActivity.this.grainbitmap = Bitmap.createScaledBitmap(EditActivity.this.bitmap, w / 2, h / 2, false);
                EditActivity.this.hslbitmap = Bitmap.createScaledBitmap(EditActivity.this.bitmap, w / 4, h / 4, false);
                EditActivity.this.picture.setImageBitmap(EditActivity.this.resizedbitmap);
                EditActivity.this.t_compare_set = new CountDownTimer(250, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        Bitmap bitmap_preset = EditActivity.this.takeScreenshot(EditActivity.this.picture);
                        EditActivity.this.mergedimg.setImageBitmap(bitmap_preset);
                        EditActivity.this.fade_picture.setImageBitmap(bitmap_preset);
                        EditActivity.this.highlights_picture.setImageBitmap(bitmap_preset);
                        EditActivity.this.shadows_picture.setImageBitmap(bitmap_preset);
                        EditActivity.this.setBW(EditActivity.this.load_rel);
                        EditActivity.this.t_compare_set.cancel();
                    }
                }.start();
                EditActivity.this.t_filter_preset = new CountDownTimer(25, 1) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        EditActivity.this.load_rel.setVisibility(View.INVISIBLE);
                        EditActivity.this.load_icon.setBackgroundResource(R.drawable.empty);
                        EditActivity.this.direktload_view.setVisibility(View.INVISIBLE);
                        EditActivity.this.direktload_view.setImageResource(R.drawable.empty);
                        EditActivity.this.reset_adjust.performClick();
                        EditActivity.this.t_filter_preset.cancel();
                    }
                };
                EditActivity.this.bg_transparent.setImageResource(R.drawable.bg_transparent);
                EditActivity.this.adjust_rel.performClick();
                EditActivity.this.basics.setVisibility(View.VISIBLE);
                EditActivity.this.set_picture.setVisibility(View.VISIBLE);
                EditActivity.this.views.setVisibility(View.VISIBLE);
                EditActivity.this.t_start_setpic.cancel();
            }
        };
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if ("android.intent.action.SEND".equals(intent.getAction()) && extras.containsKey("android.intent.extra.STREAM") && (uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM")) != null) {
            this.direktload_view.setImageURI(uri);
            this.t_filter_preset = new CountDownTimer(50, 1) {
                public void onTick(long millisUntilFinished) {
                }

                public void onFinish() {
                    EditActivity.this.bitmap = ((BitmapDrawable) EditActivity.this.direktload_view.getDrawable()).getBitmap();
                    int w = EditActivity.this.bitmap.getWidth();
                    int h = EditActivity.this.bitmap.getHeight();
                    EditActivity.this.bitmap_width.setText(String.valueOf(w));
                    EditActivity.this.bitmap_height.setText(String.valueOf(h));
                    EditActivity.this.t_start_setpic.start();
//                    EditActivity.this.t_start_set.cancel();
                }
            }.start();
        }
    }


    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1) {
            switch (requestCode) {
                case 1:
                    this.source1 = data.getData();
                    try {
                        this.bitmap = loadScaledBitmap(this.source1);
                        this.bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(this.source1));
                        int w = this.bitmap.getWidth();
                        int h = this.bitmap.getHeight();
                        this.bitmap_width.setText(String.valueOf(w));
                        this.bitmap_height.setText(String.valueOf(h));
                        this.t_start_setpic.start();
                        return;
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                        return;
                    }
                case 2:
                    this.source2 = data.getData();
                    try {
                        this.erasebitmap = loadScaledBitmap(this.source2);
                        this.erasebitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(this.source2));
                        this.blurbitmap = Bitmap.createScaledBitmap(this.erasebitmap, this.erasebitmap.getWidth() / 2, this.erasebitmap.getHeight() / 2, false);
                    } catch (FileNotFoundException e2) {
                        e2.printStackTrace();
                    }
                    this.temp_picture.setVisibility(View.VISIBLE);
                    this.temp_picture.setImageBitmap(this.erasebitmap);
                    this.eraseview.setVisibility(View.VISIBLE);
                    this.move_txt_on.performClick();
                    this.t_add_a = new CountDownTimer(25, 1) {
                        public void onTick(long millisUntilFinished) {
                        }

                        public void onFinish() {
                            EditActivity.this.saveERASES(EditActivity.this.save_txt);
                            EditActivity.this.t_add_a.cancel();
                        }
                    }.start();
                    this.t_add_b = new CountDownTimer(25, 1) {
                        public void onTick(long millisUntilFinished) {
                        }

                        public void onFinish() {
                            EditActivity.this.temp_picture.setImageResource(R.drawable.empty);
                            EditActivity.this.temp_picture.setVisibility(View.INVISIBLE);
                            File imgFile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + "/" + getString(R.string.app_name) + "/.cache/cache.png");
                            if (imgFile.exists()) {
                                EditActivity.this.eraseview.setImageBitmap(BitmapFactory.decodeFile(imgFile.getAbsolutePath()));
                                EditActivity.this.reset_collage.setVisibility(View.VISIBLE);
                                EditActivity.this.t_erase_preset.start();
                            }
                            EditActivity.this.t_add_b.cancel();
                        }
                    };
                    return;
                default:
                    return;
            }
        }
    }


    public void getRotCH() {
        if (rotcount == 1) {
            this.effect_view.setScaleX(-1.0f);
        }
        if (rotcount == 2) {
            this.effect_view.setScaleY(-1.0f);
        }
        if (rotcount == 3) {
            this.effect_view.setScaleX(1.0f);
        }
        if (rotcount == 4) {
            rotcount = 0;
            this.effect_view.setScaleY(1.0f);
        }
    }

    public void saveERASES(View view) {
        new saveERASES_AsyncTask().execute(new Void[0]);
    }

    class saveERASES_AsyncTask extends AsyncTask<Void, Void, Void> {
        saveERASES_AsyncTask() {
        }


        public void onPreExecute() {
            super.onPreExecute();
        }


        public Void doInBackground(Void... voids) {
            try {
                File myDir = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + "/" + getString(R.string.app_name) + "/.cache");
                myDir.mkdirs();
                File file = new File(myDir, "cache.png");
                if (file.exists()) {
                    file.delete();
                }
                EditActivity.this.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file)));
                FileOutputStream out = new FileOutputStream(file);
                EditActivity.this.takeScreenshot(EditActivity.this.temp_picture).compress(Bitmap.CompressFormat.PNG, 100, out);
                out.flush();
                out.close();
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }


        public void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            EditActivity.this.t_add_b.start();
        }
    }

    public void setBW(View view) {
        new setBW_AsyncTask().execute(new Void[0]);
    }

    class setBW_AsyncTask extends AsyncTask<Void, Void, Void> {
        setBW_AsyncTask() {
        }


        public void onPreExecute() {
            super.onPreExecute();
        }


        public Void doInBackground(Void... voids) {
            try {
                EditActivity.this.imagebrightness_set.setProgress(235);
                EditActivity.this.imagecontrast_set.setProgress(265);
                EditActivity.this.imagesaturation_set.setProgress(0);
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }


        public void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            Bitmap bitmap_preset = EditActivity.this.takeScreenshot(EditActivity.this.picture);
            EditActivity.this.filter_picture_bg.setImageBitmap(bitmap_preset);
            EditActivity.this.filter_picture.setImageBitmap(bitmap_preset);
            EditActivity.this.t_filter_preset.start();
        }
    }


    public void getRateCH() {
        int rcount2 = getSharedPreferences("ratecount.txt", 0).getInt("ratescore", 0);
        this.rate_count.setText(String.valueOf(rcount2));
        Boolean ratecheck = Boolean.valueOf(getSharedPreferences("rate.txt", 0).getBoolean("rate_app", false));
        if (rcount2 == 4) {
            if (ratecheck.booleanValue()) {
                hide_rate();
            } else {
                show_rate();
            }
        }
        if (rcount2 == 8) {
            if (ratecheck.booleanValue()) {
                hide_rate();
            } else {
                show_rate();
            }
        }
        if (rcount2 == 13) {
            if (ratecheck.booleanValue()) {
                hide_rate();
            } else {
                show_rate();
            }
        }
        if (rcount2 == 19) {
            if (ratecheck.booleanValue()) {
                hide_rate();
            } else {
                show_rate();
            }
        }
        if (rcount2 == 22) {
            if (ratecheck.booleanValue()) {
                hide_rate();
            } else {
                show_rate();
            }
        }

    }

    public void show_rate() {
        this.rate_rel.setVisibility(View.VISIBLE);
        this.basics.setVisibility(View.INVISIBLE);
        this.seekbars.setVisibility(View.INVISIBLE);
        this.set_picture.setVisibility(View.INVISIBLE);
        this.views.setVisibility(View.INVISIBLE);
    }

    public void hide_rate() {
        this.rate_rel.setVisibility(View.INVISIBLE);
        this.basics.setVisibility(View.VISIBLE);
        this.seekbars.setVisibility(View.VISIBLE);
        this.set_picture.setVisibility(View.VISIBLE);
        this.views.setVisibility(View.VISIBLE);
    }

    private Bitmap loadScaledBitmap(Uri src) throws FileNotFoundException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(getContentResolver().openInputStream(src), (Rect) null, options);
        options.inSampleSize = calculateInSampleSize(options, 1000, 1000);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(getContentResolver().openInputStream(src), (Rect) null, options);
    }

    public static int calculateInSampleSize(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        int height = options.outHeight;
        int width = options.outWidth;
        int inSampleSize = 1;
        if (height > reqHeight || width > reqWidth) {
            int halfHeight = height / 2;
            int halfWidth = width / 2;
            while (halfHeight / inSampleSize >= reqHeight && halfWidth / inSampleSize >= reqWidth) {
                inSampleSize *= 2;
            }
        }
        return inSampleSize;
    }


    public Bitmap createBlurBitmap(Bitmap src, float r) {
        if (r <= 0.0f) {
            r = 0.1f;
        } else if (r > 25.0f) {
            r = 25.0f;
        }
        Bitmap bitmap2 = Bitmap.createBitmap(src.getWidth(), src.getHeight(), Bitmap.Config.ARGB_8888);
        RenderScript renderScript = RenderScript.create(this);
        Allocation blurInput = Allocation.createFromBitmap(renderScript, src);
        Allocation blurOutput = Allocation.createFromBitmap(renderScript, bitmap2);
        ScriptIntrinsicBlur blur = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        blur.setInput(blurInput);
        blur.setRadius(r);
        blur.forEach(blurOutput);
        blurOutput.copyTo(bitmap2);
        renderScript.destroy();
        return bitmap2;
    }


    public Bitmap createSharpBitmap(Bitmap src, float[] coefficients) {
        Bitmap result = Bitmap.createBitmap(src.getWidth(), src.getHeight(), src.getConfig());
        RenderScript renderScript = RenderScript.create(this);
        Allocation input = Allocation.createFromBitmap(renderScript, src);
        Allocation output = Allocation.createFromBitmap(renderScript, result);
        ScriptIntrinsicConvolve3x3 convolution = ScriptIntrinsicConvolve3x3.create(renderScript, Element.U8_4(renderScript));
        convolution.setInput(input);
        convolution.setCoefficients(coefficients);
        convolution.forEach(output);
        output.copyTo(result);
        renderScript.destroy();
        return result;
    }

    public Bitmap takeScreenshot(View view) {
        view.setDrawingCacheQuality(1048576);
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache(true);
        Bitmap bitmap2 = Bitmap.createScaledBitmap(view.getDrawingCache(), view.getWidth(), view.getHeight(), true);
        view.setDrawingCacheEnabled(false);
        view.destroyDrawingCache();
        return bitmap2;
    }

    public Bitmap customScreenshot(View view) {
        view.setDrawingCacheQuality(1048576);
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache(true);
        Bitmap bitmap2 = Bitmap.createScaledBitmap(view.getDrawingCache(), Integer.valueOf(this.bitmap_width.getText().toString()).intValue(), Integer.valueOf(this.bitmap_height.getText().toString()).intValue(), true);
        view.setDrawingCacheEnabled(false);
        view.destroyDrawingCache();
        return bitmap2;
    }

    public void sharecustomPIC() {
        try {
            File root = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            String timeStamp = new SimpleDateFormat("yyyMMdd_HHmmss").format(new Date());
            File myDir = new File(root + "/" + this.getString(R.string.app_name));
            myDir.mkdirs();
            File file = new File(myDir, "photo_" + timeStamp + ".jpg");
            if (file.exists()) {
                file.delete();
            }
            Uri uri = Uri.fromFile(file);

            sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
            FileOutputStream out = new FileOutputStream(file);
            customScreenshot(this.preview_layout).compress(Bitmap.CompressFormat.JPEG, 100, out);
            out.flush();
            out.close();


            Intent share = new Intent("android.intent.action.SEND");
            share.setType("image/jpg");
            if (Build.VERSION.SDK_INT >= 24) {
                uri = FileProvider.getUriForFile(this, "provider", file);
            }
            share.putExtra("android.intent.extra.STREAM", uri);
            startActivity(share);

            this.black.setVisibility(View.INVISIBLE);
            this.set_picture.setVisibility(View.VISIBLE);
            this.basics.setVisibility(View.VISIBLE);
            this.move_dot_empty.setVisibility(View.INVISIBLE);
            this.save_txt.setEnabled(true);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Bitmap saveScreenshot(View view) {
        view.setDrawingCacheQuality(1048576);
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache(true);
        Bitmap bitmap2 = Bitmap.createScaledBitmap(view.getDrawingCache(), view.getWidth() * 2, view.getHeight() * 2, true);
        view.setDrawingCacheEnabled(false);
        view.destroyDrawingCache();
        return bitmap2;
    }

    public void sharePIC() {
        try {
            File root = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            String timeStamp = new SimpleDateFormat("yyyMMdd_HHmmss").format(new Date());
            File myDir = new File(root + "/" + getString(R.string.app_name));
            myDir.mkdirs();
            File file = new File(myDir, "photo_" + timeStamp + ".jpg");
            if (file.exists()) {
                file.delete();
            }
            Uri uri = Uri.fromFile(file);
            sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
            FileOutputStream out = new FileOutputStream(file);
            saveScreenshot(this.preview_layout).compress(Bitmap.CompressFormat.JPEG, 100, out);
            out.flush();
            out.close();




            this.black.setVisibility(View.INVISIBLE);
            this.set_picture.setVisibility(View.VISIBLE);
            this.basics.setVisibility(View.VISIBLE);
            this.move_dot_empty.setVisibility(View.INVISIBLE);
            this.save_txt.setEnabled(true);

            Intent intent = new Intent(EditActivity.this, SaveActivity.class);
            intent.putExtra("path", file.toString());
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void t_filter_load() {
        this.f129f1.setImageResource(R.drawable.fs1);
        this.f130f2.setImageResource(R.drawable.fs2);
        this.f131f3.setImageResource(R.drawable.fs3);
        this.f132f4.setImageResource(R.drawable.fs4);
        this.f133f5.setImageResource(R.drawable.fs5);
        this.f134f6.setImageResource(R.drawable.fs6);
        this.f135f7.setImageResource(R.drawable.fs7);
        this.f136f8.setImageResource(R.drawable.fs8);
        this.f137f9.setImageResource(R.drawable.fs9);
        this.f10.setImageResource(R.drawable.fs10);
        this.f11.setImageResource(R.drawable.fs11);
        this.f12.setImageResource(R.drawable.fs12);
        this.f13.setImageResource(R.drawable.fs13);
        this.f14.setImageResource(R.drawable.fs14);
        this.f15.setImageResource(R.drawable.fs15);
        this.f16.setImageResource(R.drawable.fs16);
        this.f17.setImageResource(R.drawable.fs17);
        this.f18.setImageResource(R.drawable.fs18);
        this.f19.setImageResource(R.drawable.fs19);
        this.f20.setImageResource(R.drawable.fs20);
        this.f21.setImageResource(R.drawable.fs21);
        this.f22.setImageResource(R.drawable.fs22);
        this.f23.setImageResource(R.drawable.fs23);
        this.f24.setImageResource(R.drawable.fs24);
        this.f25.setImageResource(R.drawable.fs25);
        this.f26.setImageResource(R.drawable.fs26);
        this.f27.setImageResource(R.drawable.fs27);
        this.f28.setImageResource(R.drawable.fs28);
        this.f29.setImageResource(R.drawable.fs29);
        this.f30.setImageResource(R.drawable.fs30);
        this.f31.setImageResource(R.drawable.fs31);
        this.f32.setImageResource(R.drawable.fs32);
        this.f33.setImageResource(R.drawable.fs33);
        this.f34.setImageResource(R.drawable.fs34);
        this.f35.setImageResource(R.drawable.fs35);
        this.f36.setImageResource(R.drawable.fs36);
    }

    public void t_filter_unload() {
        this.f129f1.setImageResource(R.drawable.empty);
        this.f130f2.setImageResource(R.drawable.empty);
        this.f131f3.setImageResource(R.drawable.empty);
        this.f132f4.setImageResource(R.drawable.empty);
        this.f133f5.setImageResource(R.drawable.empty);
        this.f134f6.setImageResource(R.drawable.empty);
        this.f135f7.setImageResource(R.drawable.empty);
        this.f136f8.setImageResource(R.drawable.empty);
        this.f137f9.setImageResource(R.drawable.empty);
        this.f10.setImageResource(R.drawable.empty);
        this.f11.setImageResource(R.drawable.empty);
        this.f12.setImageResource(R.drawable.empty);
        this.f13.setImageResource(R.drawable.empty);
        this.f14.setImageResource(R.drawable.empty);
        this.f15.setImageResource(R.drawable.empty);
        this.f16.setImageResource(R.drawable.empty);
        this.f17.setImageResource(R.drawable.empty);
        this.f18.setImageResource(R.drawable.empty);
        this.f19.setImageResource(R.drawable.empty);
        this.f20.setImageResource(R.drawable.empty);
        this.f21.setImageResource(R.drawable.empty);
        this.f22.setImageResource(R.drawable.empty);
        this.f23.setImageResource(R.drawable.empty);
        this.f24.setImageResource(R.drawable.empty);
        this.f25.setImageResource(R.drawable.empty);
        this.f26.setImageResource(R.drawable.empty);
        this.f27.setImageResource(R.drawable.empty);
        this.f28.setImageResource(R.drawable.empty);
        this.f29.setImageResource(R.drawable.empty);
        this.f30.setImageResource(R.drawable.empty);
        this.f31.setImageResource(R.drawable.empty);
        this.f32.setImageResource(R.drawable.empty);
        this.f33.setImageResource(R.drawable.empty);
        this.f34.setImageResource(R.drawable.empty);
        this.f35.setImageResource(R.drawable.empty);
        this.f36.setImageResource(R.drawable.empty);
    }

    public void t_filter_set() {
        this.fon1.setVisibility(View.INVISIBLE);
        this.fon2.setVisibility(View.INVISIBLE);
        this.fon3.setVisibility(View.INVISIBLE);
        this.fon4.setVisibility(View.INVISIBLE);
        this.fon5.setVisibility(View.INVISIBLE);
        this.fon6.setVisibility(View.INVISIBLE);
        this.fon7.setVisibility(View.INVISIBLE);
        this.fon8.setVisibility(View.INVISIBLE);
        this.fon9.setVisibility(View.INVISIBLE);
        this.fon10.setVisibility(View.INVISIBLE);
        this.fon11.setVisibility(View.INVISIBLE);
        this.fon12.setVisibility(View.INVISIBLE);
        this.fon13.setVisibility(View.INVISIBLE);
        this.fon14.setVisibility(View.INVISIBLE);
        this.fon15.setVisibility(View.INVISIBLE);
        this.fon16.setVisibility(View.INVISIBLE);
        this.fon17.setVisibility(View.INVISIBLE);
        this.fon18.setVisibility(View.INVISIBLE);
        this.fon19.setVisibility(View.INVISIBLE);
        this.fon20.setVisibility(View.INVISIBLE);
        this.fon21.setVisibility(View.INVISIBLE);
        this.fon22.setVisibility(View.INVISIBLE);
        this.fon23.setVisibility(View.INVISIBLE);
        this.fon24.setVisibility(View.INVISIBLE);
        this.fon25.setVisibility(View.INVISIBLE);
        this.fon26.setVisibility(View.INVISIBLE);
        this.fon27.setVisibility(View.INVISIBLE);
        this.fon28.setVisibility(View.INVISIBLE);
        this.fon29.setVisibility(View.INVISIBLE);
        this.fon30.setVisibility(View.INVISIBLE);
        this.fon31.setVisibility(View.INVISIBLE);
        this.fon32.setVisibility(View.INVISIBLE);
        this.fon33.setVisibility(View.INVISIBLE);
        this.fon34.setVisibility(View.INVISIBLE);
        this.fon35.setVisibility(View.INVISIBLE);
        this.fon36.setVisibility(View.INVISIBLE);
        this.f129f1.setEnabled(true);
        this.f130f2.setEnabled(true);
        this.f131f3.setEnabled(true);
        this.f132f4.setEnabled(true);
        this.f133f5.setEnabled(true);
        this.f134f6.setEnabled(true);
        this.f135f7.setEnabled(true);
        this.f136f8.setEnabled(true);
        this.f137f9.setEnabled(true);
        this.f10.setEnabled(true);
        this.f11.setEnabled(true);
        this.f12.setEnabled(true);
        this.f13.setEnabled(true);
        this.f14.setEnabled(true);
        this.f15.setEnabled(true);
        this.f16.setEnabled(true);
        this.f17.setEnabled(true);
        this.f18.setEnabled(true);
        this.f19.setEnabled(true);
        this.f20.setEnabled(true);
        this.f21.setEnabled(true);
        this.f22.setEnabled(true);
        this.f23.setEnabled(true);
        this.f24.setEnabled(true);
        this.f25.setEnabled(true);
        this.f26.setEnabled(true);
        this.f27.setEnabled(true);
        this.f28.setEnabled(true);
        this.f29.setEnabled(true);
        this.f30.setEnabled(true);
        this.f31.setEnabled(true);
        this.f32.setEnabled(true);
        this.f33.setEnabled(true);
        this.f34.setEnabled(true);
        this.f35.setEnabled(true);
        this.f36.setEnabled(true);
    }

    public void t_filter_seted() {
        this.seekbars_filter_bg.setVisibility(View.VISIBLE);
        this.filter_progress_txt.setVisibility(View.VISIBLE);
        this.filter_alpha.setVisibility(View.VISIBLE);
        this.value_rel.setVisibility(View.INVISIBLE);
        this.filter_alpha.setProgress(100);
        this.filtered_rel.setAlpha(1.0f);
        this.reset_filter.setTextColor(Color.parseColor("#FFFFFF"));
    }

    public void t_effect_load() {
        this.f119e1.setImageResource(R.drawable.ds1);
        this.f120e2.setImageResource(R.drawable.ds2);
        this.f121e3.setImageResource(R.drawable.ds3);
        this.f122e4.setImageResource(R.drawable.ds4);
        this.f123e5.setImageResource(R.drawable.ds5);
        this.f124e6.setImageResource(R.drawable.ds6);
        this.f125e7.setImageResource(R.drawable.ds7);
        this.f126e8.setImageResource(R.drawable.ds8);
        this.f127e9.setImageResource(R.drawable.ls1);
        this.e10.setImageResource(R.drawable.ls2);
        this.e11.setImageResource(R.drawable.ls3);
        this.e12.setImageResource(R.drawable.ls4);
        this.e13.setImageResource(R.drawable.ls5);
        this.e14.setImageResource(R.drawable.ls6);
        this.e15.setImageResource(R.drawable.ls7);
        this.e16.setImageResource(R.drawable.ls8);
        this.e17.setImageResource(R.drawable.bs1);
        this.e18.setImageResource(R.drawable.bs2);
        this.e19.setImageResource(R.drawable.bs3);
        this.e20.setImageResource(R.drawable.bs4);
        this.e21.setImageResource(R.drawable.bs5);
        this.e22.setImageResource(R.drawable.bs6);
        this.e23.setImageResource(R.drawable.bs7);
        this.e24.setImageResource(R.drawable.bs8);
        this.e25.setImageResource(R.drawable.bs9);
        this.e26.setImageResource(R.drawable.bs10);
        this.e27.setImageResource(R.drawable.bs11);
        this.e28.setImageResource(R.drawable.bs12);
        this.e29.setImageResource(R.drawable.lo1);
        this.e30.setImageResource(R.drawable.lo2);
        this.e31.setImageResource(R.drawable.lo3);
        this.e32.setImageResource(R.drawable.lo4);
        this.e33.setImageResource(R.drawable.lo5);
        this.e34.setImageResource(R.drawable.lo6);
        this.e35.setImageResource(R.drawable.ws1);
        this.e36.setImageResource(R.drawable.ws2);
        this.e37.setImageResource(R.drawable.ws3);
        this.e38.setImageResource(R.drawable.ws4);
        this.e39.setImageResource(R.drawable.ws5);
        this.e40.setImageResource(R.drawable.ws6);
        this.e41.setImageResource(R.drawable.vs1);
        this.e42.setImageResource(R.drawable.vs2);
        this.e43.setImageResource(R.drawable.vs3);
        this.e44.setImageResource(R.drawable.vs4);
        this.e45.setImageResource(R.drawable.vs5);
        this.e46.setImageResource(R.drawable.vs6);
        this.e47.setImageResource(R.drawable.vs7);
        this.e48.setImageResource(R.drawable.vs8);
        this.e49.setImageResource(R.drawable.vs9);
        this.e50.setImageResource(R.drawable.vs10);

    }

    public void t_effect_unload() {
        this.f119e1.setImageResource(R.drawable.empty);
        this.f120e2.setImageResource(R.drawable.empty);
        this.f121e3.setImageResource(R.drawable.empty);
        this.f122e4.setImageResource(R.drawable.empty);
        this.f123e5.setImageResource(R.drawable.empty);
        this.f124e6.setImageResource(R.drawable.empty);
        this.f125e7.setImageResource(R.drawable.empty);
        this.f126e8.setImageResource(R.drawable.empty);
        this.f127e9.setImageResource(R.drawable.empty);
        this.e10.setImageResource(R.drawable.empty);
        this.e11.setImageResource(R.drawable.empty);
        this.e12.setImageResource(R.drawable.empty);
        this.e13.setImageResource(R.drawable.empty);
        this.e14.setImageResource(R.drawable.empty);
        this.e15.setImageResource(R.drawable.empty);
        this.e16.setImageResource(R.drawable.empty);
        this.e17.setImageResource(R.drawable.empty);
        this.e18.setImageResource(R.drawable.empty);
        this.e19.setImageResource(R.drawable.empty);
        this.e20.setImageResource(R.drawable.empty);
        this.e21.setImageResource(R.drawable.empty);
        this.e22.setImageResource(R.drawable.empty);
        this.e23.setImageResource(R.drawable.empty);
        this.e24.setImageResource(R.drawable.empty);
        this.e25.setImageResource(R.drawable.empty);
        this.e26.setImageResource(R.drawable.empty);
        this.e27.setImageResource(R.drawable.empty);
        this.e28.setImageResource(R.drawable.empty);
        this.e29.setImageResource(R.drawable.empty);
        this.e30.setImageResource(R.drawable.empty);
        this.e31.setImageResource(R.drawable.empty);
        this.e32.setImageResource(R.drawable.empty);
        this.e33.setImageResource(R.drawable.empty);
        this.e34.setImageResource(R.drawable.empty);
        this.e35.setImageResource(R.drawable.empty);
        this.e36.setImageResource(R.drawable.empty);
        this.e37.setImageResource(R.drawable.empty);
        this.e38.setImageResource(R.drawable.empty);
        this.e39.setImageResource(R.drawable.empty);
        this.e40.setImageResource(R.drawable.empty);
        this.e41.setImageResource(R.drawable.empty);
        this.e42.setImageResource(R.drawable.empty);
        this.e43.setImageResource(R.drawable.empty);
        this.e44.setImageResource(R.drawable.empty);
        this.e45.setImageResource(R.drawable.empty);
        this.e46.setImageResource(R.drawable.empty);
        this.e47.setImageResource(R.drawable.empty);
        this.e48.setImageResource(R.drawable.empty);
        this.e49.setImageResource(R.drawable.empty);
        this.e50.setImageResource(R.drawable.empty);

    }

    public void t_effect_set() {
        this.effect_alpha.setProgress(50);
        this.erot1.setVisibility(View.INVISIBLE);
        this.erot2.setVisibility(View.INVISIBLE);
        this.erot3.setVisibility(View.INVISIBLE);
        this.erot4.setVisibility(View.INVISIBLE);
        this.erot5.setVisibility(View.INVISIBLE);
        this.erot6.setVisibility(View.INVISIBLE);
        this.erot7.setVisibility(View.INVISIBLE);
        this.erot8.setVisibility(View.INVISIBLE);
        this.erot9.setVisibility(View.INVISIBLE);
        this.erot10.setVisibility(View.INVISIBLE);
        this.erot11.setVisibility(View.INVISIBLE);
        this.erot12.setVisibility(View.INVISIBLE);
        this.erot13.setVisibility(View.INVISIBLE);
        this.erot14.setVisibility(View.INVISIBLE);
        this.erot15.setVisibility(View.INVISIBLE);
        this.erot16.setVisibility(View.INVISIBLE);
        this.erot17.setVisibility(View.INVISIBLE);
        this.erot18.setVisibility(View.INVISIBLE);
        this.erot19.setVisibility(View.INVISIBLE);
        this.erot20.setVisibility(View.INVISIBLE);
        this.erot21.setVisibility(View.INVISIBLE);
        this.erot22.setVisibility(View.INVISIBLE);
        this.erot23.setVisibility(View.INVISIBLE);
        this.erot24.setVisibility(View.INVISIBLE);
        this.erot25.setVisibility(View.INVISIBLE);
        this.erot26.setVisibility(View.INVISIBLE);
        this.erot27.setVisibility(View.INVISIBLE);
        this.erot28.setVisibility(View.INVISIBLE);
        this.erot29.setVisibility(View.INVISIBLE);
        this.erot30.setVisibility(View.INVISIBLE);
        this.erot31.setVisibility(View.INVISIBLE);
        this.erot32.setVisibility(View.INVISIBLE);
        this.erot33.setVisibility(View.INVISIBLE);
        this.erot34.setVisibility(View.INVISIBLE);
        this.erot35.setVisibility(View.INVISIBLE);
        this.erot36.setVisibility(View.INVISIBLE);
        this.erot37.setVisibility(View.INVISIBLE);
        this.erot38.setVisibility(View.INVISIBLE);
        this.erot39.setVisibility(View.INVISIBLE);
        this.erot40.setVisibility(View.INVISIBLE);
        this.erot41.setVisibility(View.INVISIBLE);
        this.erot42.setVisibility(View.INVISIBLE);
        this.erot43.setVisibility(View.INVISIBLE);
        this.erot44.setVisibility(View.INVISIBLE);
        this.erot45.setVisibility(View.INVISIBLE);
        this.erot46.setVisibility(View.INVISIBLE);
        this.erot47.setVisibility(View.INVISIBLE);
        this.erot48.setVisibility(View.INVISIBLE);
        this.erot49.setVisibility(View.INVISIBLE);
        this.erot50.setVisibility(View.INVISIBLE);

        this.f119e1.setEnabled(true);
        this.f120e2.setEnabled(true);
        this.f121e3.setEnabled(true);
        this.f122e4.setEnabled(true);
        this.f123e5.setEnabled(true);
        this.f124e6.setEnabled(true);
        this.f125e7.setEnabled(true);
        this.f126e8.setEnabled(true);
        this.f127e9.setEnabled(true);
        this.e10.setEnabled(true);
        this.e11.setEnabled(true);
        this.e12.setEnabled(true);
        this.e13.setEnabled(true);
        this.e14.setEnabled(true);
        this.e15.setEnabled(true);
        this.e16.setEnabled(true);
        this.e17.setEnabled(true);
        this.e18.setEnabled(true);
        this.e19.setEnabled(true);
        this.e20.setEnabled(true);
        this.e21.setEnabled(true);
        this.e22.setEnabled(true);
        this.e23.setEnabled(true);
        this.e24.setEnabled(true);
        this.e25.setEnabled(true);
        this.e26.setEnabled(true);
        this.e27.setEnabled(true);
        this.e28.setEnabled(true);
        this.e29.setEnabled(true);
        this.e30.setEnabled(true);
        this.e31.setEnabled(true);
        this.e32.setEnabled(true);
        this.e33.setEnabled(true);
        this.e34.setEnabled(true);
        this.e35.setEnabled(true);
        this.e36.setEnabled(true);
        this.e37.setEnabled(true);
        this.e38.setEnabled(true);
        this.e39.setEnabled(true);
        this.e40.setEnabled(true);
        this.e41.setEnabled(true);
        this.e42.setEnabled(true);
        this.e43.setEnabled(true);
        this.e44.setEnabled(true);
        this.e45.setEnabled(true);
        this.e46.setEnabled(true);
        this.e47.setEnabled(true);
        this.e48.setEnabled(true);
        this.e49.setEnabled(true);
        this.e50.setEnabled(true);

        this.value_rel.setVisibility(View.INVISIBLE);
        rotcount = 0;
    }

    public void t_effect_seted() {
        this.seekbars_effect_bg.setVisibility(View.VISIBLE);
        this.effect_progress_txt.setVisibility(View.VISIBLE);
        this.effect_alpha.setVisibility(View.VISIBLE);
        this.effect_view.setVisibility(View.VISIBLE);
        this.effect_view.setAlpha(0.5f);
        this.reset_effect.setTextColor(Color.parseColor("#FFFFFF"));
    }

    public void onBackPressed() {
        this.exit.setVisibility(View.VISIBLE);
        this.set_picture.setVisibility(View.INVISIBLE);
        this.basics.setVisibility(View.INVISIBLE);
        this.views.setVisibility(View.INVISIBLE);
        this.custom_aspect.setVisibility(View.INVISIBLE);
        if (!this.done_custom.isEnabled()) {
            this.original_rel.performClick();
        }
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.wpx.getWindowToken(), 0);
    }
}
