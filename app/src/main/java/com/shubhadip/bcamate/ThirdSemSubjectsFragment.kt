package com.shubhadip.bcamate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.shubhadip.bcamate.databinding.FragmentThirdSemSubjectsBinding

class ThirdSemSubjectsFragment : Fragment() {

    private  var _binding: FragmentThirdSemSubjectsBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentThirdSemSubjectsBinding.inflate(inflater, container, false)


        //  clicking on Computer Network Subject

        binding.sem3Sub1ChaptersBtn.setOnClickListener {
            val sem3subjectCN = ComputerNetworkChaptersFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.fragment_container, sem3subjectCN)
            transaction.addToBackStack(null)
            transaction.commit()

        }

        //  clicking on Data Structure Subject

        binding.sem3Sub2ChaptersBtn.setOnClickListener {
            val sem3subjectDS = DataStructureChaptersFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.fragment_container, sem3subjectDS)
            transaction.addToBackStack(null)
            transaction.commit()

        }

        //  clicking on Software Engineering

        binding.sem3Sub3ChaptersBtn.setOnClickListener {
            val sem3subjectSWE = SoftwareEngineeringChaptersFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.fragment_container, sem3subjectSWE)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        //  clicking on Universal Values

        binding.sem3Sub4Chapters.setOnClickListener {
            val sem3subjectUniValues = UniversalHumanValuesFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.fragment_container, sem3subjectUniValues)
            transaction.addToBackStack(null)
            transaction.commit()

        }

        //  clicking on Privacy Social Media

        binding.sem3Sub5Chapters.setOnClickListener {
            val sem3subjectPrivacy = PrivacyChaptersFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.fragment_container, sem3subjectPrivacy)
            transaction.addToBackStack(null)
            transaction.commit()

        }

        //  clicking on Soft Skill

        binding.sem3Sub6Chapters.setOnClickListener {
            val sem3subjectSoftSkill = SoftSkillChaptersFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.fragment_container, sem3subjectSoftSkill)
            transaction.addToBackStack(null)
            transaction.commit()

        }

        return  binding.root
    }

}