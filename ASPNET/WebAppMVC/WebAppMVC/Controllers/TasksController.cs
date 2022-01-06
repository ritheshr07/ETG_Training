using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using WebAppMVC.Models;

namespace WebAppMVC.Controllers
{
    public class TasksController : Controller
    {
        List<MyTask> list;
        public IActionResult Index()
        {
            return View();
        }
        public IActionResult List()
        {
             list = new List<MyTask> { new MyTask { description="MVS trg",owner="Rithesh"} 
          };
            return View(list);
        }
        public ActionResult Edit(int id)
        {
            MyTask t = list.FirstOrDefault(x => x.Id == id);
            return View();
        }
    }
}
