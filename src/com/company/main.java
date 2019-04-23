package com.company;


public class main
{
    public static void main(String[] args)
    {
        String expression="-200*-200";
        log(""+calculate(expression));

    }
    public static String calculate(String s)
    {
        System.out.println(s.charAt(0) );
        int theplaceofoperator=0,typeofcalculation=9;
        boolean the_first_one_is_positive=true,the_second_one_is_positive=true;
        int frontnumbeer,backnumbeer;
        if(s.charAt(0)=='-')
            the_first_one_is_positive=false;
        if(the_first_one_is_positive)
        {
            for(int i=0; i<s.length() ;i++)
            {
                if(s.charAt(i)==('+'))
                {
                    theplaceofoperator =i;
                    typeofcalculation =0;
                    break;
                }
                if(s.charAt(i)==('-'))
                {
                    theplaceofoperator =i;
                    typeofcalculation =1;
                    break;
                }
                if(s.charAt(i)==('*'))
                {
                    theplaceofoperator =i;
                    typeofcalculation =2;
                    break;
                }
                if(s.charAt(i)==('/'))
                {
                    theplaceofoperator =i;
                    typeofcalculation =3;
                    break;
                }
            }
            if(s.charAt(theplaceofoperator+1)=='-')
                the_second_one_is_positive=false;
        }
        else
        {
            for(int i=1; i<s.length() ;i++)
            {
                if(s.charAt(i)==('+'))
                {
                    theplaceofoperator =i;
                    typeofcalculation =0;
                    break;
                }
                if(s.charAt(i)==('-'))
                {
                    theplaceofoperator =i;
                    typeofcalculation =1;
                    break;
                }
                if(s.charAt(i)==('*'))
                {
                    theplaceofoperator =i;
                    typeofcalculation =2;
                    break;
                }
                if(s.charAt(i)==('/'))
                {
                    theplaceofoperator =i;
                    typeofcalculation =3;
                    break;
                }
            }
            if(s.charAt(theplaceofoperator+1)=='-')
                the_second_one_is_positive=false;
        }

        System.out.println(""+theplaceofoperator);
        System.out.println(""+typeofcalculation);
        if(the_first_one_is_positive)
        {
            String front = s.substring(0,theplaceofoperator) ;
             frontnumbeer = Integer.parseInt(front );
            if(the_second_one_is_positive)
            {
                String back = s.substring(theplaceofoperator+1);
                backnumbeer = Integer.parseInt(back );
            }
            else
            {
                String back = s.substring(theplaceofoperator+2);
                backnumbeer = Integer.parseInt(back );
                backnumbeer=-backnumbeer;
            }

        }
        else
        {
            String front = s.substring(1,theplaceofoperator) ;
            frontnumbeer = Integer.parseInt(front );
            frontnumbeer = - frontnumbeer;
            if(the_second_one_is_positive)
            {
                String back = s.substring(theplaceofoperator+1);
                backnumbeer = Integer.parseInt(back );
            }
            else
            {
                String back = s.substring(theplaceofoperator+2);
                backnumbeer = Integer.parseInt(back );
                backnumbeer=-backnumbeer;
            }
        }


        int resultnumber=0;
        switch(typeofcalculation)
        {
            case 0: resultnumber=frontnumbeer+backnumbeer;
            break;
            case 1: resultnumber=frontnumbeer-backnumbeer;
            break;
            case 2: resultnumber=frontnumbeer*backnumbeer;
            break;
            case 3: resultnumber=frontnumbeer/backnumbeer;
            break;
            default:  System.out.println("no calculation");
            break;

        }
        String result = Integer.toString(resultnumber);
        return result ;

    }
    public static void log(String s){
        System.out.println(s);
    }

}
