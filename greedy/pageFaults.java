 int faults=0;
        for(int i=0;i<N;i++)
        {
            int pos= i-1;
            boolean found = false;
            while(pos>=0&& pos>= (i-C))
            {
                if(arr[pos] == arr[i])
                {
                    found= true;
                    break;
                }
                pos--;
                
            }
            if(found ==false)
             faults+=1;
        }
        return faults;
        
        
        
        
        
    HashSet<Integer> s = new HashSet<>(C); 
		HashMap<Integer, Integer> indexes = new HashMap<>(); 
		int page_faults = 0; 
		for (int i = 0;i < N; i++) { 
			if (s.size() < C) {  
				if (!s.contains(pages[i])) { 
					s.add(pages[i]); 
					page_faults++; 
				} 
				indexes.put(pages[i], i); 
			}
			else { 
				if (!s.contains(pages[i])) { 
					int lru = Integer.MAX_VALUE, val=Integer.MIN_VALUE; 
					
					Iterator<Integer> itr = s.iterator(); 
					
					while (itr.hasNext()) { 
						int temp = itr.next(); 
						if (indexes.get(temp) < lru) { 
							lru = indexes.get(temp); 
							val = temp; 
						} 
					} 
					s.remove(val); 
					s.add(pages[i]); 
					page_faults++; 
				} 
				indexes.put(pages[i], i); 
			} 
		} 
	
		return page_faults; 
        
        
     int faults=0;
     Queue<Integer> q = new LinkedList<>();
     
     for(int i=0;i<N;i++)
     {
         if(q.contains(arr[i]) || q.size()< C)
         {
             if(!q.contains(arr[i]))
             {
                 faults++;
             }
             else
             {
                 q.remove(new Integer(arr[i]));
             }
         }
         else
         {
             faults++;
             q.poll();
         }
         q.add(arr[i]);
     }
     return faults;     
   
