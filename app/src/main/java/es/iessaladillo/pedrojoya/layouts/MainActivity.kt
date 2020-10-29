package es.iessaladillo.pedrojoya.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import es.iessaladillo.pedrojoya.layouts.databinding.ConstraintlayoutActivityBinding
import es.iessaladillo.pedrojoya.layouts.databinding.LinearlayoutActivityBinding
import es.iessaladillo.pedrojoya.layouts.databinding.RelativelayoutActivityBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bindingLinearLayout: LinearlayoutActivityBinding
    private lateinit var bindingRelativeLayout: RelativelayoutActivityBinding
    private lateinit var bindingConstraintLayout: ConstraintlayoutActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Hecho con Linear Layout
        //bindingLinearLayout = LinearlayoutActivityBinding.inflate(LayoutInflater.from(this))
        //setContentView(bindingLinearLayout.root)

        //Hecho con Relative Layout
        //bindingRelativeLayout = RelativelayoutActivityBinding.inflate(LayoutInflater.from(this))
        //setContentView(bindingRelativeLayout.root)

        //Hecho con Constraint Layout
        bindingConstraintLayout = ConstraintlayoutActivityBinding.inflate(LayoutInflater.from(this))
        setContentView(bindingConstraintLayout.root)
    }
}