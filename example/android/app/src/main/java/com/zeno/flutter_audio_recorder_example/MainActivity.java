package com.zeno.flutter_audio_recorder_example;

import android.os.Bundle;

import cafe.adriel.androidaudioconverter.AndroidAudioConverter;
import cafe.adriel.androidaudioconverter.callback.ILoadCallback;
import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    AndroidAudioConverter.load(this, new ILoadCallback() {
      @Override
      public void onSuccess() {
        // Great!
      }
      @Override
      public void onFailure(Exception error) {
        // FFmpeg is not supported by device
        error.printStackTrace();
      }
    });
    GeneratedPluginRegistrant.registerWith(this);
  }
}
