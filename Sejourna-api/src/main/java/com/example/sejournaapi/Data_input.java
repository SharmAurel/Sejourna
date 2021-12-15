package com.example.sejournaapi;

import com.example.sejournaapi.Activities.Activities;
import com.example.sejournaapi.Activities.Chill;

import java.util.ArrayList;

public class Data_input {
    ArrayList<Integer> inputed_activities_id;
    ArrayList<Activities> Imported_activities= new ArrayList<>();
    int activity_score[];
    Data_input(ArrayList<Integer> inputed_activities_id)
    {
        this.inputed_activities_id=inputed_activities_id;
        activity_score=new int[8];
    }
    public void import_activities()
    {
        Chill e=new Chill(1,0,"Barode en moto", "barode",48.893940,2.331090);
        this.Imported_activities.add(e);
    }
    public void calculate_activities_scores()
    {
        for(Integer id:inputed_activities_id)
        {
            int i=0;
            while(Imported_activities.get(i).getId()!=id)
            {
                switch (Imported_activities.getClass().getSimpleName())
                {
                    case "Chill":
                        activity_score[0]++;
                        break;
                    case "Cultural":
                        activity_score[1]++;
                        break;
                    case "Entertainment":
                        activity_score[2]++;
                        break;
                    case "Gastronomy":
                        activity_score[3]++;
                        break;
                    case "Nature":
                        activity_score[4]++;
                        break;
                    case "Other":
                        activity_score[5]++;
                        break;
                    case "Sport":
                        activity_score[6]++;
                        break;
                    case "Touristic":
                        activity_score[7]++;
                        break;
                }
            }
        }
    }

    public ArrayList<Integer> getInputed_activities_id() {
        return inputed_activities_id;
    }

    public ArrayList<Activities> getImported_activities() {
        return Imported_activities;
    }

    public int[] getActivity_score() {
        return activity_score;
    }
}
