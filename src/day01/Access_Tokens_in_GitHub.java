package day01;

public class Access_Tokens_in_GitHub {

    // Understanding how to configure and use Access Tokens in GitHub

    /*
    Introduction
In July 2020, GitHub announced their intent to require users to use token-based authentication in order to perform certain (authenticated) Git operations. Going forward and as of the 13th of August 2021, account passwords are no longer accepted when authenticating with the REST API.

For instance, if you attempt to push on the remote server using password authentication the operation will fail with the following message:

Support for password authentication was removed on August 13, 2021. Please use a personal access token instead
The recent changes affect the command line access to Git as well as any services accessing GitHub repositories directly with the use of password. On the other hand, if you have already enabled the two-factor authentication you are required to use a token-based authentication (or SSH-based authentication) and therefore you shouldn’t be seeing the error mentioned above.

In today’s article we will discuss we will go through a quick step by step guide that will help you configure Access Tokens on GitHub that we’ll allow you to perform token-based authentication when executing Git operations that require you doing so.

Reproducing the error
Now let’s assume that you’ve initialised a Git repository (git init), you’ve done some work and created a commit and finally you want to push the changes made to the remote host.

$ git push -U origin main
Username for 'https://github.com': <username>
Password for 'https://your-username@github.com':
remote: Support for password authentication was removed on August 13, 2021. Please use a personal access token instead.
remote: Please see https://github.blog/2020-12-15-token-authentication-requirements-for-git-operations/ for more information.
fatal: Authentication failed for 'https://github.com/<username>/repo-name.git/'
Given that you are attempting to perform password-based authentication, the push command will fail with the authentication fatal error shown above.




     */
}
