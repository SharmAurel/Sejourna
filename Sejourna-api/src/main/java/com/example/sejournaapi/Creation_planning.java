package com.example.sejournaapi;

import com.example.sejournaapi.Activities.*;

import java.util.ArrayList;

public class Creation_planning {
    Data_input data_input;
    int[] sorted_activities_priority;
    public Creation_planning(Data_input data_input)
    {
        this.data_input=data_input;
        sorted_activities_priority=new int[]{0,1,2,3,4,5,6,7};
    }
    public void sort_array()
    {
        //int[] arr = data_input.getActivity_score();
        int[] arr =new int[]{7,3,5,1,2,0,8,0};
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tmp = 0;
                int tmp2=0;
                if (arr[i] > arr[j])
                {
                    tmp = arr[i];

                    tmp2=sorted_activities_priority[i];
                    sorted_activities_priority[i]=sorted_activities_priority[j];
                    sorted_activities_priority[j]=tmp2;
                    arr[i] = arr[j];
                    //sorted_activities_priority[j]=tmp2;
                    arr[j] = tmp;
                }
            }
                System.out.print(sorted_activities_priority[i]+",");
        }

    }
    public Activities getRandomActivity(int Type)
    {
    String type;
    int retourne;
        switch (Type) {
            case 0:
                type = "Chill";
                break;
            case 1:
                type = "Cultural";
                break;
            case 2:
                type = "Entertainment";
                break;
            case 3:
                type = "Gastronomy";
                break;
            case 4:
                type = "Nature";
                break;
            case 5:
                type = "Other";
                break;
            case 6:
                type = "Sport";
                break;
            case 7:
                type = "Touristic";
                break;
            default: type="other";
            break;
        }
        do
        {
            retourne=(int) Math.random()*data_input.getImported_activities().size();
        }while(data_input.getImported_activities().get(retourne).getType().equals(type));
        return data_input.getImported_activities().get(retourne);
        }


        public void creation()
        {
            ArrayList <Activities> Planning_crée=new ArrayList<>();
            for(int i:sorted_activities_priority)
            {
                Planning_crée.add(getRandomActivity(i));
            }
            String x= " ";
            for(Activities a: Planning_crée)
            {
                System.out.println(a.toString());
                }

        }
}


