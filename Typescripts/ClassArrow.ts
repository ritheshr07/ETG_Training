class Employee{
    empCode: number;
    empName: string;

    constructor(code: number,name: string){
        this.empName=name;
        this.empCode=code;
    }
    display=()=>{console.log(this.empCode + ' '+ this.empName)}

}
export default Employee;
let emp=new Employee(1,'Ram');
emp.display();

