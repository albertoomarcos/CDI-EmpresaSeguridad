package com.example.portatil.cdi_empresaseguridad

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class UserMainFragment: Fragment() {

    companion object {

        fun newInstance(): UserMainFragment {
            return UserMainFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main_user, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val expand_action_0 = view.findViewById<ImageView>(R.id.expand_action_0)
        expand_action_0?.setOnClickListener {mView ->
            val expanded_action = view.findViewById<LinearLayout>(R.id.expanded_actions_0)
            val textView = view.findViewById<TextView>(R.id.description_0)

            mView.visibility = ImageView.GONE
            expanded_action?.visibility = LinearLayout.VISIBLE
            textView?.maxLines = Int.MAX_VALUE


        }

        view.findViewById<ImageView>(R.id.collapse_action_0)?.setOnClickListener { _ ->
            val expanded_action = view.findViewById<LinearLayout>(R.id.expanded_actions_0)
            val textView = view.findViewById<TextView>(R.id.description_0)

            expand_action_0?.visibility = ImageView.VISIBLE
            expanded_action?.visibility = LinearLayout.GONE
            textView?.maxLines = 5
        }

        val expand_action_1 = view.findViewById<ImageView>(R.id.expand_action_1)
        expand_action_1?.setOnClickListener {mView ->
            val expanded_action = view.findViewById<LinearLayout>(R.id.expanded_actions_1)
            val textView = view.findViewById<TextView>(R.id.description_1)

            mView.visibility = ImageView.GONE
            expanded_action?.visibility = LinearLayout.VISIBLE
            textView?.maxLines = Int.MAX_VALUE


        }

        view.findViewById<ImageView>(R.id.collapse_action_1)?.setOnClickListener { _ ->
            val expanded_action = view.findViewById<LinearLayout>(R.id.expanded_actions_1)
            val textView = view.findViewById<TextView>(R.id.description_1)

            expand_action_1?.visibility = ImageView.VISIBLE
            expanded_action?.visibility = LinearLayout.GONE
            textView?.maxLines = 5
        }

        val expand_action_2 = view.findViewById<ImageView>(R.id.expand_action_2)
        expand_action_2?.setOnClickListener {mView ->
            val expanded_action = view.findViewById<LinearLayout>(R.id.expanded_actions_2)
            val textView = view.findViewById<TextView>(R.id.description_2)

            mView.visibility = ImageView.GONE
            expanded_action?.visibility = LinearLayout.VISIBLE
            textView?.maxLines = Int.MAX_VALUE


        }

        view.findViewById<ImageView>(R.id.collapse_action_2)?.setOnClickListener { mView ->
            val expanded_action = view.findViewById<LinearLayout>(R.id.expanded_actions_2)
            val textView = view.findViewById<TextView>(R.id.description_2)

            expand_action_2?.visibility = ImageView.VISIBLE
            expanded_action?.visibility = LinearLayout.GONE
            textView?.maxLines = 5
        }

        val expand_action_3 = view.findViewById<ImageView>(R.id.expand_action_3)
        expand_action_3?.setOnClickListener {mView ->
            val expanded_action = view.findViewById<LinearLayout>(R.id.expanded_actions_3)
            val textView = view.findViewById<TextView>(R.id.description_3)

            mView.visibility = ImageView.GONE
            expanded_action?.visibility = LinearLayout.VISIBLE
            textView?.maxLines = Int.MAX_VALUE


        }

        view.findViewById<ImageView>(R.id.collapse_action_3)?.setOnClickListener { mView ->
            val expanded_action = view.findViewById<LinearLayout>(R.id.expanded_actions_3)
            val textView = view.findViewById<TextView>(R.id.description_3)

            expand_action_3?.visibility = ImageView.VISIBLE
            expanded_action?.visibility = LinearLayout.GONE
            textView?.maxLines = 5
        }
    }
}