package com.example.portatil.cdi_empresaseguridad

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class UserMainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_user)
    }


    override fun onStart() {
        super.onStart()

        val expand_action_0 = findViewById<ImageView>(R.id.expand_action_0)
        expand_action_0.setOnClickListener {view ->
            val expanded_action = findViewById<LinearLayout>(R.id.expanded_actions_0)
            val textView = findViewById<TextView>(R.id.description_0)

            view.visibility = ImageView.GONE
            expanded_action.visibility = LinearLayout.VISIBLE
            textView.maxLines = Int.MAX_VALUE


        }

        findViewById<ImageView>(R.id.collapse_action_0).setOnClickListener {view ->
            val expanded_action = findViewById<LinearLayout>(R.id.expanded_actions_0)
            val textView = findViewById<TextView>(R.id.description_0)

            expand_action_0.visibility = ImageView.VISIBLE
            expanded_action.visibility = LinearLayout.GONE
            textView.maxLines = 5
        }

        val expand_action_1 = findViewById<ImageView>(R.id.expand_action_1)
        expand_action_1.setOnClickListener {view ->
            val expanded_action = findViewById<LinearLayout>(R.id.expanded_actions_1)
            val textView = findViewById<TextView>(R.id.description_1)

            view.visibility = ImageView.GONE
            expanded_action.visibility = LinearLayout.VISIBLE
            textView.maxLines = Int.MAX_VALUE


        }

        findViewById<ImageView>(R.id.collapse_action_1).setOnClickListener {view ->
            val expanded_action = findViewById<LinearLayout>(R.id.expanded_actions_1)
            val textView = findViewById<TextView>(R.id.description_1)

            expand_action_1.visibility = ImageView.VISIBLE
            expanded_action.visibility = LinearLayout.GONE
            textView.maxLines = 5
        }

        val expand_action_2 = findViewById<ImageView>(R.id.expand_action_2)
        expand_action_2.setOnClickListener {view ->
            val expanded_action = findViewById<LinearLayout>(R.id.expanded_actions_2)
            val textView = findViewById<TextView>(R.id.description_2)

            view.visibility = ImageView.GONE
            expanded_action.visibility = LinearLayout.VISIBLE
            textView.maxLines = Int.MAX_VALUE


        }

        findViewById<ImageView>(R.id.collapse_action_2).setOnClickListener {view ->
            val expanded_action = findViewById<LinearLayout>(R.id.expanded_actions_2)
            val textView = findViewById<TextView>(R.id.description_2)

            expand_action_2.visibility = ImageView.VISIBLE
            expanded_action.visibility = LinearLayout.GONE
            textView.maxLines = 5
        }

        val expand_action_3 = findViewById<ImageView>(R.id.expand_action_3)
        expand_action_3.setOnClickListener {view ->
            val expanded_action = findViewById<LinearLayout>(R.id.expanded_actions_3)
            val textView = findViewById<TextView>(R.id.description_3)

            view.visibility = ImageView.GONE
            expanded_action.visibility = LinearLayout.VISIBLE
            textView.maxLines = Int.MAX_VALUE


        }

        findViewById<ImageView>(R.id.collapse_action_3).setOnClickListener {view ->
            val expanded_action = findViewById<LinearLayout>(R.id.expanded_actions_3)
            val textView = findViewById<TextView>(R.id.description_3)

            expand_action_3.visibility = ImageView.VISIBLE
            expanded_action.visibility = LinearLayout.GONE
            textView.maxLines = 5
        }
    }
}