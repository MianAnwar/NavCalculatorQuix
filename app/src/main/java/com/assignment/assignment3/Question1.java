package com.assignment.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Question1 extends AppCompatActivity {
    int countScore = 0;

    int currentQuestionNo=-1;
    TextView questionNo;
    TextView questionText;
    RadioGroup radioGroup;
    RadioButton answer1;
    RadioButton answer2;
    RadioButton answer3;
    RadioButton answer4;

    public ArrayList<String> questions_no = new ArrayList<String>();
    public ArrayList<String> questions = new ArrayList<String>();
    public ArrayList<ArrayList<String>> answers  = new ArrayList<ArrayList<String>>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        questionNo = (TextView) findViewById(R.id.questionNoText);
        questionText = (TextView) findViewById(R.id.questionText);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        answer1 = (RadioButton) findViewById(R.id.option1Text);
        answer2 = (RadioButton) findViewById(R.id.option2Text);
        answer3 = (RadioButton) findViewById(R.id.option3Text);
        answer4 = (RadioButton) findViewById(R.id.option4Text);

        setQuestions();

        this.currentQuestionNo +=1;
        settingLatestQuestion();
    }

    private void setQuestions(){
        questions_no.add("Question No: 1");
        questions.add("The name of current President of Pakistan:");
        ArrayList<String> answersOf1  = new ArrayList<String>();
        answersOf1.add("Mamnoon Hussain");
        answersOf1.add("Pervaiz Musharf");
        answersOf1.add("Arif Alvi");
        answersOf1.add("None");
        answersOf1.add("Arif Alvi");    // correct option
        answers.add(answersOf1);

        questions_no.add("Question No: 2");
        questions.add("The name of current Prime Minister of Pakistan:");
        ArrayList<String> answersOf2  = new ArrayList<String>();
        answersOf2.add("Nawaz Shareef");
        answersOf2.add("Imran Khan");
        answersOf2.add("Benazeer Bhutto");
        answersOf2.add("Yousf Raza Gillani");
        answersOf2.add("Imran Khan");   // correct option
        answers.add(answersOf2);

        questions_no.add("Question No: 3");
        questions.add("The name of Chief Minister of Punjab:");
        ArrayList<String> answersOf3  = new ArrayList<String>();
        answersOf3.add("Shehbaz Shareef");
        answersOf3.add("Buzadar");
        answersOf3.add("Nawaz Shareef");
        answersOf3.add("None");
        answersOf3.add("Buzadar");    // correct option
        answers.add(answersOf3);

        questions_no.add("Question No: 4");
        questions.add("The name of Chief Minister of Sindh:");
        ArrayList<String> answersOf4 = new ArrayList<String>();
        answersOf4.add("Qaim Ali Shah");
        answersOf4.add("Murad ali Shah");
        answersOf4.add("Bilawal Zardari");
        answersOf4.add("Maryam Safdar");
        answersOf4.add("Murad ali Shah");    // correct option
        answers.add(answersOf4);


        questions_no.add("Question No: 5");
        questions.add("The name of Chief Minister of KPK:");
        ArrayList<String> answersOf5 = new ArrayList<String>();
        answersOf5.add("Shaukat ALi");
        answersOf5.add("Kamran Ajmal");
        answersOf5.add("fazool ur Rehman");
        answersOf5.add("None");
        answersOf5.add("None");    // correct option
        answers.add(answersOf5);


        questions_no.add("Question No: 6");
        questions.add("The name of Chief Minister of Balochistan:");
        ArrayList<String> answersOf6  = new ArrayList<String>();
        answersOf6.add("Hussain Akram");
        answersOf6.add("Pervaiz Musharf");
        answersOf6.add("Arif Butt");
        answersOf6.add("None");
        answersOf6.add("None");    //correct option
        answers.add(answersOf6);

        questions_no.add("Question No: 7");
        questions.add("The name of Chief Justice of Pakistan:");
        ArrayList<String> answersOf7 = new ArrayList<String>();
        answersOf7.add("Manzoor ul Haq");
        answersOf7.add("Saqib ");
        answersOf7.add("Muhammad Ali");
        answersOf7.add("None");
        answersOf7.add("None");         //correct option
        answers.add(answersOf7);

        questions_no.add("Question No: 8");
        questions.add("The name of Chief of Army Staff of Pakistan:");
        ArrayList<String> answersOf8 = new ArrayList<String>();
        answersOf8.add("Qamar Javed");
        answersOf8.add("Pervaiz Musharf");
        answersOf8.add("Raheel Shareef");
        answersOf8.add("Zia ul Haq");
        answersOf8.add("Qamar Javed");    //correct option
        answers.add(answersOf8);

        questions_no.add("Question No: 9");
        questions.add("The name of Foreign Minister of Pakistan:");
        ArrayList<String> answersOf9 = new ArrayList<String>();
        answersOf9.add("Mehmood Quraishe");
        answersOf9.add("Aleem Khan");
        answersOf9.add("Mehmood Achaq Ziai");
        answersOf9.add("None");
        answersOf9.add("Mehmood Quraishe");    //correct option
        answers.add(answersOf9);

        questions_no.add("Question No: 10");
        questions.add("The date of liberation of Pakistan:");
        ArrayList<String> answersOf10  = new ArrayList<String>();
        answersOf10.add("20 March 1940");
        answersOf10.add("14 August 1947");
        answersOf10.add("17 September 1971");
        answersOf10.add("6 September 1966");
        answersOf10.add("14 August 1947");    //correct option
        answers.add(answersOf10);
    }

    public void processAndEvaluate(View view) {
        int ii = radioGroup.getCheckedRadioButtonId();
        RadioButton selection = (RadioButton) findViewById(ii);

        if(selection.getText() == answers.get(currentQuestionNo).get(4))
        {
            countScore = countScore +1;
        }
        if(this.currentQuestionNo==9)
        {
            Intent result = new Intent(Question1.this, Result.class);
            String s = ""+countScore;
            result.putExtra("score", s);
            startActivity(result);
            this.finish();
        }
        else {
            this.currentQuestionNo += 1;
            settingLatestQuestion();
        }
    }

    void settingLatestQuestion()
    {
        questionNo.setText(questions_no.get(currentQuestionNo));
        questionText.setText(questions.get(currentQuestionNo));

        answer1.setText(answers.get(currentQuestionNo).get(0));
        answer2.setText(answers.get(currentQuestionNo).get(1));
        answer3.setText(answers.get(currentQuestionNo).get(2));
        answer4.setText(answers.get(currentQuestionNo).get(3));

    }
}