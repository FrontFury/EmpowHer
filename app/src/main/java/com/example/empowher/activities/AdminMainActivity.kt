package com.example.empowher.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.empowher.R
import com.example.empowher.databinding.ActivityAdminMainBinding
import com.example.empowher.fragments.*

class AdminMainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAdminMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityAdminMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, 0)
            insets
        }

        // Set default fragment
        replaceFragment(TriageFragment())

        binding.adminBottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_triage -> replaceFragment(TriageFragment())
                R.id.nav_cases -> replaceFragment(CasesFragment())
                R.id.nav_vault -> replaceFragment(VaultFragment())
                R.id.nav_stories -> replaceFragment(AdminStoriesFragment())
                R.id.nav_users -> replaceFragment(UsersFragment())
                R.id.nav_ops_desk -> replaceFragment(OpsDeskFragment())
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.adminFragmentContainer, fragment)
            .commit()
    }
}
