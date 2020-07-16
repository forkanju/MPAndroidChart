package com.pal.mpandroidchart;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);

        PieChart pieChart = findViewById(R.id.piechart);


        ArrayList noOfEmp = new ArrayList();

        noOfEmp.add(new Entry(22.24f, 0));
        noOfEmp.add(new Entry(10.9f, 0));
        noOfEmp.add(new Entry(40f, 0));
//        noOfEmp.add(new Entry(25f, 0));

        PieDataSet dataSet = new PieDataSet(noOfEmp, "Health Overview");

        ArrayList year = new ArrayList();

        year.add("Normal");
        year.add("OverWeight");
        year.add("UnderWeight");
//        year.add("Age");


        PieData pieData = new PieData(year, dataSet);
        pieChart.setData(pieData);
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieChart.animateXY(5000, 5000);
        //for half pie.
        //pieChart.setMaxAngle(180f);


//        pieChart.getRotation();


    }
}