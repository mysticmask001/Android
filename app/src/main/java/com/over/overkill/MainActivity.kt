package com.over.overkill

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.over.overkill.ui.theme.OverkillTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Greeting()

        }
    }
}
@Preview(showBackground = true)
@Composable
fun Greeting() {

            Column (
                modifier = Modifier
                    .background(Color.DarkGray)

//          .fillMaxWidth()
//          .fillMaxHeight()
                    .fillMaxSize(),

//        verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,


                ){

                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .background(Color.Cyan)
                        .fillMaxWidth()
                        .height(40.dp)

                ) {

                    Text(text = "Feed")

                    Spacer(modifier = Modifier .width(12.dp))

                    Text(text = "Notifications")

                    Spacer(modifier = Modifier .width(12.dp) )

                    Text(text = "Profile")

                    Spacer(modifier = Modifier .width(12.dp))
                }

                Spacer(modifier = Modifier.height(150.dp))




                Text(text = "First app.", color = Color.Blue, fontSize = 20.sp, fontFamily = FontFamily.Cursive)



                Text(text = "Second app.", color = Color.Green, fontFamily = FontFamily.Monospace)


                Text(text = "Another one.", color = Color.Magenta, fontFamily = FontFamily.SansSerif)


                   val about = LocalContext.current
                   Button(onClick = {

                       about.startActivity(Intent(about, AboutActivity::class.java))



                   }, colors = ButtonDefaults.buttonColors(Color.Black),
//             shape = RectangleShape
//            shape = RoundedcornerShape(10.dp)



                   ) {

                       Text(text = "About")

                   }

                   val image = LocalContext.current
                   Button(onClick = {

                       image.startActivity(Intent(image, ImageActivity2::class.java))


                   }
                   ) {

                       Text(text = "Image", color = Color.Blue)

                   }

                   val input = LocalContext.current
                   Button(onClick = {

                       input.startActivity(Intent(input, InputActivity::class.java))


                   }
                   ) {

                       Text(text = "Input", color = Color.Blue)

                   }

                   val scroll = LocalContext.current
                   Button(onClick = {

                       scroll.startActivity(Intent(scroll, ScrollActivity::class.java))


                   }
                   ) {

                       Text(text = "Scroll", color = Color.Blue)

                   }



                   val card = LocalContext.current
                   Button(onClick = {

                       card.startActivity(Intent(card, CardActivity::class.java))


                   }
                   ) {

                       Text(text = "Card", color = Color.Blue)

                   }

            }
        }







