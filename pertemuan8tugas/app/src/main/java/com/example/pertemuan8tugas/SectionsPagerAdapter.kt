import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.pertemuan8tugas.FragmentLogin
import com.example.pertemuan8tugas.FragmentRegister


class SectionsPagerAdapter(activity: AppCompatActivity) :
    FragmentStateAdapter(activity) {
    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = FragmentRegister()
            1 -> fragment = FragmentLogin()
        }
        return fragment as Fragment
    }
    override fun getItemCount(): Int {
        return 2
    }
}