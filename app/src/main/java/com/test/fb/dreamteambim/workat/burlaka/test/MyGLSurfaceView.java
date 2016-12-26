package com.test.fb.dreamteambim.workat.burlaka.test;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by Operator on 26.12.2016.
 */
class MyGLSurfaceView extends GLSurfaceView {

private final MyGLRenderer mRenderer;

public MyGLSurfaceView(Context context){
        super(context);

        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2);

        mRenderer = new MyGLRenderer();

        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer(mRenderer);
        }
        }