import java.util.*;

class Connection{
    String node1;
    String node2;
    int cost;
    public Connection(String node1, String node2, int cost){
        this.node1 = node1;
        this.node2 = node2;
        this.cost = cost;
    }
}
public class minimunSpanningTree{
    public static void main(String[] args){
        Connection t1 = new Connection("a", "d", 7);
        Connection t2 = new Connection("a", "c", 10);
        Connection t3 = new Connection("c", "d", 9);
        Connection t4 = new Connection("b", "d", 32);
        Connection t5 = new Connection("d", "e", 23);

        List<Connection> test = new ArrayList<Connection>();
        test.add(t1);
        test.add(t2);
        test.add(t3);
        test.add(t4);
        test.add(t5);

        minimunSpanningTree aaa = new minimunSpanningTree();

        List<Connection> res = aaa.MST(test);
        for(Connection c : res){
            System.out.println(c.node1 + " " + c.node2 + " " + c.cost);
        }
    }

    public List<Connection> MST(List<Connection> connections){
        List<Connection> res = new ArrayList<Connection>();
        if(connections == null){
            return res;
        }
        Comparator<Connection> comp = new Comparator<Connection>(){
            @Override
            public int compare(Connection c1, Connection c2){
                return c1.cost - c2.cost;
            }
        };
        Collections.sort(connections, comp);

        unionFind uf = new unionFind(connections);
        for(Connection c : connections){
            String a = uf.find(c.node1);
            String b = uf.find(c.node2);
            if(a.equals(b)){
                continue;
            }else{
                uf.union(a, b);
                res.add(c);
            }
        }

        if(res.size() == uf.map.size() - 1){
            return res;
        }

        return null;
    }

    public class unionFind{
        Map<String, String> map = new HashMap<String, String>();

        public unionFind(List<Connection> connections){
            for(Connection c : connections){
                map.put(c.node1, c.node1);
                map.put(c.node2, c.node2);
            }
        }

        public String find(String a){
            String parent = a;
            while(parent != map.get(parent)){
                return parent = find(map.get(parent)); // TODO
            }
            return parent;
        }
        public void union(String a, String b){
            String aParent = find(a);
            String bParent = find(b);
            if(!aParent.equals(bParent)){
                map.put(a, b);
            }
        }
    }
}

