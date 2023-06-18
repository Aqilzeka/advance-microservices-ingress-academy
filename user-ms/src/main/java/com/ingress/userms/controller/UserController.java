package com.ingress.userms.controller;

import com.ingress.userms.model.criteria.PageCriteria;
import com.ingress.userms.model.criteria.UserCriteria;
import com.ingress.userms.model.response.PageableUserResponse;
import com.ingress.userms.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    public PageableUserResponse getUsers(PageCriteria pageCriteria, UserCriteria userCriteria) {

        return userService.getUsers(pageCriteria, userCriteria);

    }
}
