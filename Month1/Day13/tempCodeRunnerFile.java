
        for(int i=0;i<26;i++){
            if(frq[i]!=frq1[i]){
                anagram=false;
                break;
            }
        }
        if(anagram){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
}
}
