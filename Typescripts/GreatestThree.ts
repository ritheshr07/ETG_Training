class GreatestThree{
    num1:number=12;

    num2:number=25;

    num3:number=89;



    greater()

    {

        if((this.num1>this.num2)&&(this.num1>this.num3))

        {

            console.log(this.num1);

        }

        else if((this.num2>this.num1)&&(this.num2>this.num3))

        {

            console.log(this.num2);

        }

        else

        {

            console.log(this.num3);

        }

    }
}

var greater1=new GreatestThree();

greater1.greater();