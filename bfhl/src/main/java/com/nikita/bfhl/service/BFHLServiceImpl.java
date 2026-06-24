package com.nikita.bfhl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nikita.bfhl.dto.BFHLRequest;
import com.nikita.bfhl.dto.BFHLResponse;

@Service
public class BFHLServiceImpl implements BFHLService {

    @Override
    public BFHLResponse process(BFHLRequest request) {

        List<String> odd = new ArrayList<>();
        List<String> even = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        List<String> special = new ArrayList<>();

        int sum = 0;

        StringBuilder letters = new StringBuilder();

        for (String s : request.getData()) {

            if (s.matches("\\d+")) {

                int num = Integer.parseInt(s);

                sum += num;

                if (num % 2 == 0)
                    even.add(s);
                else
                    odd.add(s);

            } else if (s.matches("[a-zA-Z]+")) {

                alphabets.add(s.toUpperCase());

                letters.append(s);

            } else {

                special.add(s);
            }
        }

        BFHLResponse response = new BFHLResponse();

       response.user_id = "nikita_arora_21042005";
       response.email = "nikitaarora7734@gmail.com";
       response.roll_number = "2310990586";

        response.odd_numbers = odd;
        response.even_numbers = even;
        response.alphabets = alphabets;
        response.special_characters = special;

        response.sum = String.valueOf(sum);

        response.concat_string = createString(letters.toString());

        return response;
    }

    private String createString(String str) {

        StringBuilder rev = new StringBuilder(str).reverse();

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < rev.length(); i++) {

            char ch = Character.toLowerCase(rev.charAt(i));

            if (i % 2 == 0)
                ans.append(Character.toUpperCase(ch));
            else
                ans.append(ch);
        }

        return ans.toString();
    }
}