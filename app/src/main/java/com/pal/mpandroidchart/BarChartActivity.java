package com.pal.mpandroidchart;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);

        BarChart chart = findViewById(R.id.barchart);

        ArrayList NoOfEmp = new ArrayList();

        NoOfEmp.add(new BarEntry(55f, 0));
        NoOfEmp.add(new BarEntry(117f, 1));
        NoOfEmp.add(new BarEntry(89f, 2));
        NoOfEmp.add(new BarEntry(82.24f, 3));
        NoOfEmp.add(new BarEntry(102f, 4));
        NoOfEmp.add(new BarEntry(96f, 5));
        NoOfEmp.add(new BarEntry(75f, 6));
//        NoOfEmp.add(new BarEntry(1645f, 7));
//        NoOfEmp.add(new BarEntry(1578f, 8));
//        NoOfEmp.add(new BarEntry(1695f, 9));

        ArrayList year = new ArrayList();

//        year.add("2011");
//        year.add("2012");
//        year.add("2013");
        year.add("Age");
        year.add("Height");
        year.add("Weight");
        year.add("BMI");
        year.add("Kcal");
        year.add("Step");
        year.add("Today");

        BarDataSet barDataSet = new BarDataSet(NoOfEmp, "Health Overview");
        chart.animateY(4000);
        BarData data = new BarData(year, barDataSet);
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        chart.setData(data);
    }
}