package dev.ranieri.controllers;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    public static Algorithm algorithm = Algorithm.HMAC256("some secret string that must never be known");

    @GetMapping("/login")
    public String craftJWT(){
        String jwt = JWT.create().withClaim("username","Bill").sign(algorithm);
        return jwt;
    }

    @GetMapping("/validate")
    public String validateJWT(){
        JWTVerifier verifier = JWT.require(algorithm).build();
        DecodedJWT decodedJWT = verifier.verify("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VybmFtZSI6IkJpbGwifQ.VoPzgrZ2asohUNCVi6rOoqA8EmWkjUl-xzZI1FeaHeQ");
        Claim claim = decodedJWT.getClaim("username");
        String s = claim.asString();
        System.out.println(s);
        return "";
    }
}
