package com.ar.arfaces

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ar.arfaces.arface.AugmentedFaceFragment
import com.ar.arfaces.arface.AugmentedFaceListener
import com.ar.arfaces.arface.AugmentedFaceNode
import com.ar.arfaces.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), AugmentedFaceListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.faceView.getFragment<AugmentedFaceFragment>().setAugmentedFaceListener(this)
        setContentView(binding.root)
    }

    override fun onFaceAdded(face: AugmentedFaceNode) {}

    override fun onFaceUpdate(face: AugmentedFaceNode) {}

}