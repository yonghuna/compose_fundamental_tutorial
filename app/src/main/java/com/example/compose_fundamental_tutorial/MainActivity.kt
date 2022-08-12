

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_fundamental_tutorial.ui.theme.Compose_fundamental_tutorialTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_fundamental_tutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Container()
                }
            }
        }
    }
}

@Composable
fun Container(){
    Row {
        DummyBox()
        DummyBox()
        DummyBox()
    }
}
@Composable
fun DummyBox(modifier : Modifier = Modifier){
    val red = Random.nextInt(256)
    val green = Random.nextInt(256)
    val blue = Random.nextInt(256)
    val randomColor = Color(red, green, blue)
    Box(modifier = modifier
        .size(100.dp)
        .background(randomColor))

}


//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Compose_fundamental_tutorialTheme {
        Container()
        //Greeting("Android")
    }
}