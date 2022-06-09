package com.example.loginapp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class reycl extends AppCompatActivity {
    RecyclerView rcv;
    myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reycl);

        rcv = (RecyclerView) findViewById(R.id.recview);
        //  rcv.setLayoutManager(new LinearLayoutManager(this));

        adapter = new myadapter(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);

        //LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        //rcv.setLayoutManager(layoutManager);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        rcv.setLayoutManager(gridLayoutManager);
    }

    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model ob1=new Model();
        ob1.setHeader("Louvre");
        ob1.setDesc("Paris, France");
        ob1.setDescA("The Louvre, or the Louvre Museum, is the world's largest art museum and a historic monument in Paris, France, and is best known for being the home of the Mona Lisa. A central landmark of the city, it is located on the Right Bank of the Seine in the city's 1st arrondissement.");
        ob1.setImgname(R.drawable.louvre);
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setHeader("National Museum of China");
        ob2.setDesc("Beijing, China");
        ob2.setDescA("The National Museum of China flanks the eastern side of Tiananmen Square in Beijing, China. The museum's mission is to educate about the arts and history of China. It is directed by the Ministry of Culture of the People's Republic of China.");
        ob2.setImgname(R.drawable.national);
        holder.add(ob2);

        Model ob3=new Model();
        ob3.setHeader("Vatican Museum");
        ob3.setDesc("Vatican City, Vatican");
        ob3.setDescA("The Vatican Museums are the public art and sculpture museums in the Vatican City. They display works from the immense collection amassed by the Catholic Church and the papacy throughout the centuries.");
        ob3.setImgname(R.drawable.vactican);
        holder.add(ob3);

        Model ob4=new Model();
        ob4.setHeader("Metropolitan Museum of Art");
        ob4.setDesc("New York City, US");
        ob4.setDescA("The Metropolitan Museum of Art of New York City, colloquially \"the Met\", is the largest art museum in the United States. Its permanent collection contains over 2 million works, divided among 17 curatorial departments.");
        ob4.setImgname(R.drawable.metro);
        holder.add(ob4);

        Model ob5=new Model();
        ob5.setHeader("British Museum");
        ob5.setDesc("London, UK");
        ob5.setDescA("The British Museum, in the Bloomsbury area of London, England, is a public institution dedicated to human history, art and culture. Its permanent collection of some eight million works is among the largest and most comprehensive in existence, having been widely collected during the era of the British Empire.");
        ob5.setImgname(R.drawable.british);
        holder.add(ob5);

        Model ob6=new Model();
        ob6.setHeader("Tate Modern");
        ob6.setDesc("London, UK");
        ob6.setDescA("Tate is an institution that houses, in a network of four art galleries, the United Kingdom's national collection of British art, and international modern and contemporary art. It is not a government institution, but its main sponsor is the UK Department for Digital, Culture, Media and Sport.");
        ob6.setImgname(R.drawable.tate);
        holder.add(ob6);

        Model ob7=new Model();
        ob7.setHeader("National Gallery");
        ob7.setDesc("London, UK");
        ob7.setDescA("The National Gallery is an art museum in Trafalgar Square in the City of Westminster, in Central London. Founded in 1824, it houses a collection of over 2,300 paintings dating from the mid-13th century to 1900.");
        ob7.setImgname(R.drawable.gallery);
        holder.add(ob7);

        Model ob8=new Model();
        ob8.setHeader("Natural History Museum");
        ob8.setDesc("London, UK");
        ob8.setDescA("The Natural History Museum in London is a natural history museum that exhibits a vast range of specimens from various segments of natural history. It is one of three major museums on Exhibition Road in South Kensington, the others being the Science Museum and the Victoria and Albert Museum. ");
        ob8.setImgname(R.drawable.history);
        holder.add(ob8);

        Model ob9=new Model();
        ob9.setHeader("American Museum of Natural History");
        ob9.setDesc("New York City, US");
        ob9.setDescA("The American Museum of Natural History (abbreviated as AMNH) is a natural history museum on the Upper West Side of Manhattan, New York City. In Theodore Roosevelt Park, across the street from Central Park, the museum complex comprises 26 interconnected buildings housing 45 permanent exhibition halls, in addition to a planetarium and a library. ");
        ob9.setImgname(R.drawable.natural);
        holder.add(ob9);

        Model ob10=new Model();
        ob10.setHeader("State Hermitage Museum");
        ob10.setDesc("Saint Petersburg, Russia");
        ob10.setDescA("The State Hermitage Museum is a museum of art and culture in Saint Petersburg, Russia. The second-largest art museum in the world, it was founded in 1764 when Empress Catherine the Great acquired an impressive collection of paintings from the Berlin merchant Johann Ernst Gotzkowsky.");
        ob10.setImgname(R.drawable.state);
        holder.add(ob10);

        return holder;
    }

}