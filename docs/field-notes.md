# Field Notes

This note keeps the platform engineering assumptions visible beside the checks.

The domain cases cover `rollout width`, `quota pressure`, `route drift`, and `secret scope`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

`stress` is the strongest case at 185 on `quota pressure`. `baseline` is the cautious anchor at 165 on `rollout width`.

The point is not to make the repository bigger. The point is to make the important judgment testable.
