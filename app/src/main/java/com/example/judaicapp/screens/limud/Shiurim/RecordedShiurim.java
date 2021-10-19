package com.example.judaicapp.screens.limud.Shiurim;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.judaicapp.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.IOException;

public class RecordedShiurim extends Fragment implements MediaPlayer.OnPreparedListener {

    private MediaPlayer mMediaplayer, mMediaPlayer2, mMediaplayer3, mMediaPlayer4, mMediaplayer5, mMediaPlayer6, mMediaplayer7, mMediaPlayer8, mMediaplayer9, mMediaPlayer10;
    ImageButton pause, play, pause2, play2,pause3, play3, pause4, play4, pause5, play5, pause6, play6, pause7, play7, pause8, play8, pause9, play9, pause10, play10;
    String shiur1 = "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/shiurim%2FThe%20Kid%20LAROI%20-%20STAY%20(Lyrics)%20Ft.%20Justin%20Bieber.mp3?alt=media&token=e3c87320-d7de-477d-bd14-a263886d5f8e";
    String shiur2 = "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/shiurim%2FFairy%20Tail%20Main%20Theme.mp3?alt=media&token=afc8ebf7-88e2-408b-99fa-ad7f4b985b46";
    String shiur3 = "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/shiurim%2FNever%20Gonna%20Give%20You%20Up.mp3?alt=media&token=15ab3ffa-b00e-45ee-9159-f869aeab1492";
    String shiur4 = "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/shiurim%2FLose%20You%20Now.mp3?alt=media&token=17938094-45a3-4e08-84f2-569081c92835";
    String shiur5 = "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/shiurim%2FFairytale.mp3?alt=media&token=426966c5-1691-49c6-a444-b5121923229d";
    String shiur6 = "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/shiurim%2FBlue%20Bird.mp3?alt=media&token=b00feea5-a641-4566-bb38-ea0413d60424";
    String shiur7 = "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/shiurim%2FBlack%20Rover.mp3?alt=media&token=d46fe6e7-8ae9-4bb6-bbdd-6a2729bb672e";
    String shiur8 = "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/shiurim%2FBlack%20Catcher.mp3?alt=media&token=d638f396-a641-45ea-916d-0e38a18105ed";
    String shiur9 = "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/shiurim%2FArcade.mp3?alt=media&token=0f0869f7-37ba-4c76-b193-be906338b5ff";
    String shiur10 = "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/shiurim%2FMaster%20Of%20Tides.mp3?alt=media&token=cf6830e6-f7e6-4224-865a-6a6b30b0e737";






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_recorded_shiurim, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mMediaplayer = new MediaPlayer();
        mMediaPlayer2 = new MediaPlayer();
        mMediaplayer3 = new MediaPlayer();
        mMediaPlayer4 = new MediaPlayer();
        mMediaplayer5 = new MediaPlayer();
        mMediaPlayer6 = new MediaPlayer();
        mMediaplayer7 = new MediaPlayer();
        mMediaPlayer8 = new MediaPlayer();
        mMediaplayer9 = new MediaPlayer();
        mMediaPlayer10 = new MediaPlayer();
        init2();
        paused();
        seekTo();
    }

    private void seekTo() {
        mMediaplayer.seekTo(0);
        mMediaPlayer2.seekTo(0);
        mMediaplayer3.seekTo(0);
        mMediaPlayer4.seekTo(0);
        mMediaplayer5.seekTo(0);
        mMediaPlayer6.seekTo(0);
        mMediaplayer7.seekTo(0);
        mMediaPlayer8.seekTo(0);
        mMediaplayer9.seekTo(0);
        mMediaPlayer10.seekTo(0);
    }

    private void paused() {
        mMediaplayer.pause();
        mMediaPlayer2.pause();
        mMediaplayer3.pause();
        mMediaPlayer4.pause();
        mMediaplayer5.pause();
        mMediaPlayer6.pause();
        mMediaplayer7.pause();
        mMediaPlayer8.pause();
        mMediaplayer9.pause();
        mMediaPlayer10.pause();
    }

    private void init2() {
        pause = getView().findViewById(R.id.shiur1_pause);
        play = getView().findViewById(R.id.shiur1_play);
        pause2 = getView().findViewById(R.id.shiur2_pause);
        play2 = getView().findViewById(R.id.shiur2_play);
        pause3 = getView().findViewById(R.id.shiur3_pause);
        play3 = getView().findViewById(R.id.shiur3_play);
        pause4 = getView().findViewById(R.id.shiur4_pause);
        play4 = getView().findViewById(R.id.shiur4_play);
        pause5 = getView().findViewById(R.id.shiur5_pause);
        play5 = getView().findViewById(R.id.shiur5_play);
        pause6 = getView().findViewById(R.id.shiur6_pause);
        play6 = getView().findViewById(R.id.shiur6_play);
        pause7 = getView().findViewById(R.id.shiur7_pause);
        play7 = getView().findViewById(R.id.shiur7_play);
        pause8 = getView().findViewById(R.id.shiur8_pause);
        play8 = getView().findViewById(R.id.shiur8_play);
        pause9 = getView().findViewById(R.id.shiur9_pause);
        play9 = getView().findViewById(R.id.shiur9_play);
        pause10 = getView().findViewById(R.id.shiur10_pause);
        play10 = getView().findViewById(R.id.shiur10_play);


        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMediaplayer.pause();
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final FirebaseStorage storage = FirebaseStorage.getInstance();
                // Create a storage reference from our app
                StorageReference storageRef = storage.getReferenceFromUrl(shiur1);
                storageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {

                        try {
                            // Download url of file
                            final String url = uri.toString();

                            mMediaplayer.setDataSource(url);
                            // wait for media player to get prepared
                            mMediaplayer.setOnPreparedListener(RecordedShiurim.this);
                            mMediaplayer.prepareAsync();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.i("TAG", e.getMessage());
                    }
                });
                paused();
                seekTo();
                mMediaplayer.start();

            }
        });
        pause2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMediaPlayer2.pause();

            }
        });
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final FirebaseStorage storage = FirebaseStorage.getInstance();
                StorageReference storageRef2 = storage.getReferenceFromUrl(shiur2);
                storageRef2.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {

                        try {
                            // Download url of file
                            final String url = uri.toString();
                            mMediaPlayer2.setDataSource(url);
                            // wait for media player to get prepared
                            mMediaPlayer2.setOnPreparedListener(RecordedShiurim.this);
                            mMediaPlayer2.prepareAsync();


                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.i("TAG", e.getMessage());
                            }
                        });

                paused();
                seekTo();
                mMediaPlayer2.start();
            }
        });
        pause3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMediaplayer3.pause();


            }
        });
        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final FirebaseStorage storage = FirebaseStorage.getInstance();
                // Create a storage reference from our app
                StorageReference storageRef3 = storage.getReferenceFromUrl(shiur3);
                storageRef3.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {

                        try {
                            // Download url of file
                            final String url = uri.toString();
                            mMediaplayer3.setDataSource(url);
                            // wait for media player to get prepared
                            mMediaplayer3.setOnPreparedListener(RecordedShiurim.this);
                            mMediaplayer3.prepareAsync();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.i("TAG", e.getMessage());
                    }
                });
                paused();
                seekTo();
                mMediaplayer3.start();

            }
        });
        pause4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMediaPlayer4.pause();

            }
        });
        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final FirebaseStorage storage = FirebaseStorage.getInstance();
                StorageReference storageRef4 = storage.getReferenceFromUrl(shiur4);
                storageRef4.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {

                        try {
                            // Download url of file
                            final String url = uri.toString();
                            mMediaPlayer4.setDataSource(url);
                            // wait for media player to get prepared
                            mMediaPlayer4.setOnPreparedListener(RecordedShiurim.this);
                            mMediaPlayer4.prepareAsync();


                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.i("TAG", e.getMessage());
                            }
                        });

                paused();
                seekTo();
                mMediaPlayer4.start();
            }
        });
        pause5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMediaplayer5.pause();


            }
        });
        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final FirebaseStorage storage = FirebaseStorage.getInstance();
                // Create a storage reference from our app
                StorageReference storageRef5 = storage.getReferenceFromUrl(shiur5);
                storageRef5.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {

                        try {
                            // Download url of file
                            final String url = uri.toString();
                            mMediaplayer5.setDataSource(url);
                            // wait for media player to get prepared
                            mMediaplayer5.setOnPreparedListener(RecordedShiurim.this);
                            mMediaplayer5.prepareAsync();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.i("TAG", e.getMessage());
                    }
                });
                paused();
                seekTo();
                mMediaplayer5.start();

            }
        });
        pause6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMediaPlayer6.pause();

            }
        });
        play6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final FirebaseStorage storage = FirebaseStorage.getInstance();
                StorageReference storageRef6 = storage.getReferenceFromUrl(shiur6);
                storageRef6.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {

                        try {
                            // Download url of file
                            final String url = uri.toString();
                            mMediaPlayer6.setDataSource(url);
                            // wait for media player to get prepared
                            mMediaPlayer6.setOnPreparedListener(RecordedShiurim.this);
                            mMediaPlayer6.prepareAsync();


                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.i("TAG", e.getMessage());
                            }
                        });

                paused();
                seekTo();
                mMediaPlayer6.start();
            }
        });
        pause7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMediaplayer7.pause();


            }
        });
        play7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final FirebaseStorage storage = FirebaseStorage.getInstance();
                // Create a storage reference from our app
                StorageReference storageRef7 = storage.getReferenceFromUrl(shiur7);
                storageRef7.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {

                        try {
                            // Download url of file
                            final String url = uri.toString();
                            mMediaplayer7.setDataSource(url);
                            // wait for media player to get prepared
                            mMediaplayer7.setOnPreparedListener(RecordedShiurim.this);
                            mMediaplayer7.prepareAsync();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.i("TAG", e.getMessage());
                    }
                });
                paused();
                seekTo();
                mMediaplayer7.start();

            }
        });
        pause8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMediaPlayer8.pause();

            }
        });
        play8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final FirebaseStorage storage = FirebaseStorage.getInstance();
                StorageReference storageRef8 = storage.getReferenceFromUrl(shiur8);
                storageRef8.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {

                        try {
                            // Download url of file
                            final String url = uri.toString();
                            mMediaPlayer8.setDataSource(url);
                            // wait for media player to get prepared
                            mMediaPlayer8.setOnPreparedListener(RecordedShiurim.this);
                            mMediaPlayer8.prepareAsync();


                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.i("TAG", e.getMessage());
                            }
                        });

                paused();
                seekTo();
                mMediaPlayer8.start();
            }
        });
        pause9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMediaplayer9.pause();


            }
        });
        play9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final FirebaseStorage storage = FirebaseStorage.getInstance();
                // Create a storage reference from our app
                StorageReference storageRef9 = storage.getReferenceFromUrl(shiur9);
                storageRef9.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {

                        try {
                            // Download url of file
                            final String url = uri.toString();
                            mMediaplayer9.setDataSource(url);
                            // wait for media player to get prepared
                            mMediaplayer9.setOnPreparedListener(RecordedShiurim.this);
                            mMediaplayer9.prepareAsync();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.i("TAG", e.getMessage());
                    }
                });
                paused();
                seekTo();
                mMediaplayer9.start();

            }
        });
        pause10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMediaPlayer10.pause();

            }
        });
        play10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final FirebaseStorage storage = FirebaseStorage.getInstance();
                StorageReference storageRef10 = storage.getReferenceFromUrl(shiur10);
                storageRef10.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {

                        try {
                            // Download url of file
                            final String url = uri.toString();
                            mMediaPlayer10.setDataSource(url);
                            // wait for media player to get prepared
                            mMediaPlayer10.setOnPreparedListener(RecordedShiurim.this);
                            mMediaPlayer10.prepareAsync();


                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.i("TAG", e.getMessage());
                            }
                        });

                paused();
                mMediaplayer.seekTo(0);
                mMediaPlayer10.start();
            }
        });
    }




















    @Override
    public void onPrepared(MediaPlayer mp) {
        mp.start();
    }
}