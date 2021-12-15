package com.example.sejournaapi;

import com.example.sejournaapi.Activities.Activities;
import com.example.sejournaapi.Activities.Chill;

import java.util.ArrayList;

public class Data_input {
    ArrayList<Integer> inputed_activities_id;
    ArrayList<Activities> Imported_activities= new ArrayList<>();
    int Chill_score;
    int Cultural_score;
    int Entertainment_score;
    int Gastronomy_score;
    int Nature_score;
    int Other_score;
    int Sport_score;
    int Touristic_score;
    Data_input(ArrayList<Integer> inputed_activities_id)
    {
        this.inputed_activities_id=inputed_activities_id;
         Chill_score=0;
         Cultural_score=0;
         Entertainment_score=0;
         Gastronomy_score=0;
         Nature_score=0;
         Other_score=0;
         Sport_score=0;
         Touristic_score=0;
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
                        Chill_score++;
                        break;
                    case "Cultural":
                        Cultural_score++;
                        break;
                    case "Entertainment":
                        Entertainment_score++;
                        break;
                    case "Gastronomy":
                        Gastronomy_score++;
                        break;
                    case "Nature":
                        Nature_score++;
                        break;
                    case "Other":
                        Other_score++;
                        break;
                    case "Sport":
                        Sport_score++;
                        break;
                    case "Touristic":
                        Touristic_score++;
                        break;
                }
            }
        }
    }

}
