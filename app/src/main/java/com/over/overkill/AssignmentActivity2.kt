package com.over.overkill

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class AssignmentActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ass2()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Ass2(){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {


        Image(
            painter = painterResource(
                id = R.drawable.detect
            ),
            contentDescription = "null",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        LazyColumn(
            modifier = Modifier
//                .background(Color.LightGray)
                .fillMaxSize()
        ) {
            item {
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Row(
                        horizontalArrangement = Arrangement . SpaceEvenly,
                        modifier = Modifier
                            .fillMaxWidth()


                        ) {

                        Text(text = "Hello World!", color = Color.White, fontSize = 40.sp)



                    }
                    
                    Spacer(modifier = Modifier.height(500.dp))



//
//                    val result = remember
//                    { mutableStateOf<Uri?>(null) }
//
//                    val launcher =
//                        rememberLauncherForActivityResult(ActivityResultContracts.PickVisualMedia = ()) {
//                           result.value = it
//
//
//                        }
//
//
//                    Column{
//                        Button(onClick = {
//                            launcher.launch(
//                                PickVisualMediaRequest(mediaType = ActivityResultContracts.PickVisualMedia.ImageOnly)
//                            )
//                        }){
//                            Text(text = "Select Image")
//                        }
//
//                        result.value?.let {image ->
//
//                            val painter = rememberAsyncImagePainter(ImageRequest.Builder(LocalContext.current)
//                                .data(data = image)
//                                .build()
//                            )
//                            Image(
//                                painter = painter,
//                                contentDescription = "null",
//                                modifier = Modifier.size(150.dp, 150.dp)
//                                    .padding(16.dp)
//                            )
//                        }
//                    }



                    Card(
                        elevation = CardDefaults.cardElevation(40.dp)
                    ){
                        Image(painter = painterResource(id = R.drawable.beverly), contentDescription ="null")

                        Text(text = "Beverly" +
                                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor" )

                    }
                }
            }
        }
    }
}


