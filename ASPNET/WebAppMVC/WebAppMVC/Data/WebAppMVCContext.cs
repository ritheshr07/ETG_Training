using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;
using WebAppMVC.Models;

namespace WebAppMVC.Data
{
    public class WebAppMVCContext : DbContext
    {
        public WebAppMVCContext (DbContextOptions<WebAppMVCContext> options)
            : base(options)
        {
        }

        public DbSet<WebAppMVC.Models.MyTask> MyTask { get; set; }
    }
}
