package com.kotlincourse.media

import android.media.AudioManager
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.kotlincourse.R

class MP3Activity : AppCompatActivity() {
    lateinit var btnPlay: Button
    lateinit var btnStop: Button
    lateinit var mediaPlayer: MediaPlayer
    var audioUrl = "https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mp3)
        btnPlay = findViewById(R.id.btnPlay)
        btnStop = findViewById(R.id.btnStop)
        // initializing our media player
        mediaPlayer = MediaPlayer()
        btnPlay.setOnClickListener {
            //setting audio stream type as stream music on below line.
            mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC)

            // on below line we are setting audio
            // source as audio url on below line.
            mediaPlayer.setDataSource(audioUrl)
            // on below line we are
            // preparing our media player.
            mediaPlayer.prepare()

            // on below line we are
            // starting our media player.
            mediaPlayer.start()
        }
        btnStop.setOnClickListener {
            if (mediaPlayer.isPlaying) {
                // if media player is playing we
                // are stopping it on below line.
                mediaPlayer.stop()

                // on below line we are resetting
                // our media player.
                mediaPlayer.reset()

                // on below line we are calling
                // release to release our media player.
                mediaPlayer.release()
            }
        }
    }
}