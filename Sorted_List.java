class Link
{
    public long dData;
    public Link next;

    public Link(long dd)
    {
        data=dd;
    }
    public void displayLink()
    {
        System.out.print(dData);
    }
}

class sortedList
{
    private Link first;
    public SortedList()
    {
        first=null;
    }
    public boolean isEmpty()
    {
        return (first==null);   
     }
        public void insert(long key)
        {
            Link newLink= new Link(key);
            Link previous= null;
            Link current=first;
            while (current!=null && key> current.dData)
            {
                previous=current;
                current=current.next;
            }
            if(previous==null)
            first=newLink;
            else 
            previous.next=newLink;
            newLink.next=current;

        }
        public Link remove()
        {
            Link temp=first;
            first=first.next;
            return temp;
        }
        public void displayList()
        {
            System.out.print("List (first-->Last): ");
            Link current=first;
            while (current!=null)
            {
                current.displayLink();
                current=current.next;
            }
            System.out.println("");
        }
}

class SortedListApp
{
    public static void main(String[] args)
    {
        SortedList theSortedList= new Sortedlist();
        theSortedList(20);
        theSortedList(40);

        theSortedList.displayList();
        theSortedList.insert(10);
        theSortedList.insert(30);
        theSortedList.insert(50);
        theSortedList.displayList();
        theSortedList.remove();
        theSortedList.displayList();
    }
}