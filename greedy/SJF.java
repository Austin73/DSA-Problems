

class Process
{
  int pid,
  int arrivalTime;
  int burstTime;
  public Process()
  {
  }
}
class sort implements Comparator<Proccess>{

 public int compare(Process p1,Process p2)
 { 
     return p1.arrivalTime- p2.arrivalTime;
 }
}

select email from author where 'author-id' !=${author}

select * from post where author=${author}

void Sjf(Process process[])
{
  
  PriorityQueue<Integer> readyQueue= new PriorityQueue<>();
  int currTime =0;
  
  Arrays.sort(Process,new sort());
  readyQueue.push(process[i].burstTime);
  int i;
  while(readyQueue.size()>0)
  {
     int minId = readyQueue.poll();
     currTime= currTime+ process.get(minId).burstTime;
     process.get(minId).burstTime=0;
    while(i<process.length && process[i].arrivalTime <= currTime)
     {
         readyQueue.push(process[i].burstTime);
         i++;
     }        
  }
  
return currTime;
}
