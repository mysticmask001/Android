package com.over.overkill

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.over.overkill.ui.theme.OverkillTheme
import androidx.compose.foundation.layout.Row as Row1
import androidx.compose.foundation.layout.Row as Row
import androidx.compose.foundation.layout.Spacer as Spacer

class AssignmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Ass()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Ass() {
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
                .background(Color.LightGray)
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
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier
                            .fillMaxWidth(),
                    ) {

                        Image(
                            imageVector = Icons.Default.Home,
                            contentDescription = "",
                        )

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "Location")

                            Row {
                                Image(
                                    imageVector = Icons.Default.LocationOn,
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(15.dp)

                                )
                                Text(text = "Nairobi")
                            }

                        }

                        Image(imageVector = Icons.Default.Settings, contentDescription = "")

                    }
//
                    Spacer(modifier = Modifier.height(15.dp))
                    Spacer(modifier = Modifier.height(15.dp))


                    Row(
                        horizontalArrangement = Arrangement.Absolute.SpaceEvenly
                    ) {

                        Row(
                            modifier = Modifier
                                .padding(10.dp)
                                .background(Color.LightGray)
                                .shadow(elevation = 10.dp)
//                        .border(
//                            shape = RoundedCornerShape(5.dp)
//                        )

                        ) {

                            Image(
                                imageVector = Icons.Default.Home,
                                contentDescription = "null"
                            )
                            Text(text = "Home")

                        }


                        Spacer(modifier = Modifier.width(25.dp))

                        Row(
                            modifier = Modifier
                                .padding(10.dp)
                                .background(Color.LightGray)
                                .shadow(elevation = 10.dp)
//                        .border(
//                            shape = RoundedCornerShape(5.dp)
//                        )

                        ) {

                            Image(
                                imageVector = Icons.Default.Home,
                                contentDescription = "null"
                            )
                            Text(text = "Home")

                        }


                    }

                    Row(
                        horizontalArrangement = Arrangement.Absolute.SpaceEvenly
                    ) {

                        Row(
                            modifier = Modifier
                                .padding(10.dp)
                                .background(Color.LightGray)
                                .shadow(elevation = 10.dp)
//                        .border(
//                            shape = RoundedCornerShape(5.dp)
//                        )

                        ) {

                            Image(
                                imageVector = Icons.Default.Home,
                                contentDescription = "null"
                            )
                            Text(text = "Home")

                        }



                        Spacer(modifier = Modifier.width(25.dp))

                        Row(
                            modifier = Modifier
                                .padding(10.dp)
                                .background(Color.LightGray)
                                .shadow(elevation = 10.dp)
//                        .border(
//                            shape = RoundedCornerShape(5.dp)
//                        )

                        ) {

                            Image(
                                imageVector = Icons.Default.Home,
                                contentDescription = "null"
                            )
                            Text(text = "Home")

                        }


                    }

                    Row(
                        horizontalArrangement = Arrangement.Absolute.SpaceEvenly
                    ) {

                        Row(
                            modifier = Modifier
                                .padding(10.dp)
                                .background(Color.LightGray)
                                .shadow(elevation = 10.dp)
//                        .border(
//                            shape = RoundedCornerShape(5.dp)
//                        )

                        ) {

                            Image(
                                imageVector = Icons.Default.Home,
                                contentDescription = "null"
                            )
                            Text(text = "Home")

                        }



                        Spacer(modifier = Modifier.width(25.dp))



                        Row(
                            modifier = Modifier
                                .padding(10.dp)
                                .background(Color.LightGray)
                                .shadow(elevation = 10.dp)
//                        .border(
//                            shape = RoundedCornerShape(5.dp)
//                        )

                        ) {

                            Image(
                                imageVector = Icons.Default.Home,
                                contentDescription = "null"
                            )
                            Text(text = "Home")

                        }
                    }

                    Spacer(modifier = Modifier.height(25.dp))



                    Row(
                        horizontalArrangement = Arrangement.Absolute.SpaceEvenly
                    ) {

                        Row {


                            Text(text = "Post")



                            Spacer(modifier = Modifier.width(25.dp))



                            Text(text = "View all!")
                        }
                    }

                    Spacer(modifier = Modifier.height(25.dp))



                    Row(
                        horizontalArrangement = Arrangement.Absolute.SpaceEvenly
                    ) {

                        Row(
                            modifier = Modifier
                                .size(140.dp)
                        ) {
                            Card(
                                elevation = CardDefaults.cardElevation(40.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.beverly),
                                    contentDescription = "null"
                                )

                                Text(text = "Beverly")


                            }

//
                        }

                        Spacer(modifier = Modifier.width(25.dp))


                        Row(
                            modifier = Modifier
                                .size(140.dp)
                        ) {
                            Card(
                                elevation = CardDefaults.cardElevation(40.dp)

                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.beverly),
                                    contentDescription = "null"
                                )

                                Text(text = "Beverly")


                            }
                        }


                    }

                    Spacer(modifier = Modifier.height(25.dp))



                    Row(
                        horizontalArrangement = Arrangement.Absolute.SpaceEvenly
                    ) {

                        Row(
                            modifier = Modifier
                                .size(140.dp)
                        ) {
                            Card(
                                elevation = CardDefaults.cardElevation(40.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.beverly),
                                    contentDescription = "null"
                                )

                                Text(text = "Beverly")


                            }

//
                        }

                        Spacer(modifier = Modifier.width(25.dp))


                        Row(
                            modifier = Modifier
                                .size(140.dp)
                        ) {
                            Card(
                                elevation = CardDefaults.cardElevation(40.dp)

                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.beverly),
                                    contentDescription = "null"
                                )

                                Text(text = "Beverly")


                            }
                        }


                    }


                }
            }
        }
    }
}









