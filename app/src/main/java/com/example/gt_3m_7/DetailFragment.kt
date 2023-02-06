package com.example.gt_3m_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gt_3m_7.databinding.FragmentDetailBinding
import com.example.gt_3m_7.databinding.FragmentMainBinding


class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding
    private lateinit var navArgs: DetailFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            navArgs = DetailFragmentArgs.fromBundle(it)
        }
        val user = navArgs.user as User
        binding.apply {
            tvName.text = user.name
            tvStatus.text = user.status
            user.image?.let { image.setImageResource(it) }
        }
    }


}